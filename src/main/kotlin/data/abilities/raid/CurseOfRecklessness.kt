package data.abilities.raid

import character.*
import sim.SimIteration

class CurseOfRecklessness : Ability() {
    companion object {
        const val name = "Curse of Recklessness"
    }

    override val id: Int = 27226
    override val name: String = Companion.name
    override fun gcdMs(sim: SimIteration): Int = 0

    val debuff = object : Debuff() {
         override val name: String = Companion.name
        // Assume the caster is always maintaining this
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sim: SimIteration): Stats {
            return Stats(
                armor = -800,
                attackPower = 135
            )
        }
    }

    override fun cast(sim: SimIteration, free: Boolean) {
        sim.addDebuff(debuff)
    }

    override val baseCastTimeMs: Int = 0
}
