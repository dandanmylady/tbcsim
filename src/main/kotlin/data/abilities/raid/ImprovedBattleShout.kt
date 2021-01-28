package data.abilities.raid

import character.Ability
import character.Buff
import character.Proc
import character.Stats
import sim.SimIteration

class ImprovedBattleShout : Ability() {
    companion object {
        const val name = "Improved Battle Shout"
    }

    override val id: Int = 2048
    override val name: String = Companion.name
    override fun gcdMs(sim: SimIteration): Int = 0

    // Always assume the raid buffer has 5/5 imp BS
    val bonusAp = 305.0 * 1.25
    val buff = object : Buff() {
        override val name: String = Companion.name
        // Assume the caster is always maintaining this
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sim: SimIteration, stats: Stats): Stats {
            return stats.add(Stats(attackPower = bonusAp.toInt()))
        }

        override fun procs(sim: SimIteration): List<Proc> = listOf()
    }

    override fun cast(sim: SimIteration, free: Boolean) {
        sim.addBuff(buff)
    }

    override val baseCastTimeMs: Int = 0
}