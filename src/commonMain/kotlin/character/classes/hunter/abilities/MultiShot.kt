package character.classes.hunter.abilities

import character.Ability
import character.Proc
import character.classes.hunter.talents.Efficiency
import character.classes.hunter.talents.TheBeastWithin
import data.Constants
import data.itemsets.DemonStalkerArmor
import mechanics.General
import mechanics.Ranged
import sim.Event
import sim.SimParticipant

class MultiShot : Ability() {
    companion object {
        const val name = "Multi Shot"
    }
    override val id: Int = 27021
    override val name: String = Companion.name
    override fun gcdMs(sp: SimParticipant): Int = sp.physicalGcd().toInt()
    override fun cooldownMs(sp: SimParticipant): Int = 10000

    val baseCost = 275.0
    override fun resourceCost(sp: SimParticipant): Double {
        val efficiency = sp.character.klass.talents[Efficiency.name] as Efficiency?
        val effDiscount = efficiency?.shotManaCostReduction() ?: 0.0

        val tbwDiscount = if(sp.buffs[TheBeastWithin.name] != null) { 0.2 } else 0.0

        val t4Buff = sp.buffs[DemonStalkerArmor.FOUR_SET_BUFF_NAME] != null
        val t4Discount = if(t4Buff) { DemonStalkerArmor.fourSetMultiShotCostReductionPct() } else 0.0

        return General.resourceCostReduction(baseCost, listOf(effDiscount, tbwDiscount, t4Discount))
    }

    val bonusDmg = 205.0
    override fun cast(sp: SimParticipant) {
        val item = sp.character.gear.rangedTotemLibram

        // Ammo adds DPS, so we can just model it as bonus AP
        val ammoBonusAp = General.dpsToAp(sp.character.gear.ammo.maxDmg)
        val damage = Ranged.baseDamageRoll(sp, item, bonusAp = ammoBonusAp) + bonusDmg
        val result = Ranged.attackRoll(sp, damage, item)

        val event = Event(
            eventType = Event.Type.DAMAGE,
            damageType = Constants.DamageType.PHYSICAL,
            abilityName = name,
            amount = result.first,
            result = result.second,
        )
        sp.logEvent(event)

        // Proc anything that can proc off a yellow hit
        val triggerTypes = when(result.second) {
            Event.Result.HIT -> listOf(Proc.Trigger.RANGED_YELLOW_HIT, Proc.Trigger.PHYSICAL_DAMAGE)
            Event.Result.CRIT -> listOf(Proc.Trigger.RANGED_YELLOW_CRIT, Proc.Trigger.PHYSICAL_DAMAGE)
            Event.Result.MISS -> listOf(Proc.Trigger.RANGED_MISS)
            Event.Result.BLOCK -> listOf(Proc.Trigger.RANGED_YELLOW_HIT, Proc.Trigger.PHYSICAL_DAMAGE)
            Event.Result.BLOCKED_CRIT -> listOf(Proc.Trigger.RANGED_YELLOW_CRIT, Proc.Trigger.PHYSICAL_DAMAGE)
            else -> null
        }

        if(triggerTypes != null) {
            sp.fireProc(triggerTypes, listOf(item), this, event)
        }
    }
}