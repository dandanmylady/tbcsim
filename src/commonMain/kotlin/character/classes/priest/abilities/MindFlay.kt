package character.classes.priest.abilities

import character.classes.priest.debuffs.*
import character.classes.priest.talents.*
import character.classes.priest.buffs.InnerFocus as InnerFocusBuff
import character.classes.priest.talents.MindFlay as MindFlayTalent
import character.Ability
import character.Buff
import character.Proc
import character.Resource
import data.Constants
import data.model.Item
import mechanics.Spell
import sim.Event
import sim.EventResult
import sim.EventType
import sim.SimParticipant
import mu.KotlinLogging

abstract class MindFlay : Ability() {
    override val id: Int = 25387
    open val tickCount = 3

    val school = Constants.DamageType.SHADOW 

    override fun gcdMs(sp: SimParticipant): Int = sp.spellGcd().toInt()

    val baseResourceCost = 230.0
    override fun resourceCost(sp: SimParticipant): Double {
        val innerFocusBuff = sp.buffs[InnerFocusBuff.name] as InnerFocusBuff?

        if (innerFocusBuff != null) {
            return 0.0
        }

        val fm: FocusedMind? = sp.character.klass.talentInstance(FocusedMind.name)
        val fmMulti = fm?.manaReductionMultiplier() ?: 1.0

        return baseResourceCost * fmMulti
    }

    override fun available(sp: SimParticipant): Boolean {
        return super.available(sp) && sp.character.klass.hasTalentRanks(MindFlayTalent.name)
    }

    override fun cast(sp: SimParticipant) {
        val sfTalent: ShadowFocus? = sp.character.klass.talentInstance(ShadowFocus.name)
        val sfHit = sfTalent?.shadowHitIncreasePct() ?: 0.0

        val result = Spell.attackRoll(sp, 0.0, school, isBinary = true, bonusHitChance = sfHit, canCrit = false)

        val event = Event(
            eventType = EventType.DAMAGE,
            damageType = school,
            abilityName = name,
            result = result.second,
        )
        sp.logEvent(event)

        if (result.second == EventResult.RESIST){
            sp.fireProc(listOf(Proc.Trigger.SPELL_RESIST), listOf(), this, event)
            return;
        }

        sp.fireProc(listOf(Proc.Trigger.SPELL_HIT), listOf(), this, event)

        sp.sim.target.addDebuff(MindFlayDot(sp, tickCount));
    }
}
