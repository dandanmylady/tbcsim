package character.classes.warrior.talents

import character.Buff
import character.Stats
import character.Talent
import sim.SimParticipant

class ImprovedBerserkerStance(currentRank: Int) : Talent(currentRank) {
    companion object {
        const val name = "Improved Berserker Stance"
    }

    override val name: String = Companion.name
    override val maxRank: Int = 5

    val buff = object : Buff() {
        override val name: String = "Improved Berserker Stance"
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sp: SimParticipant): Stats {
            val multiplier = 1.0 + currentRank * 0.02
            return Stats(attackPowerMultiplier = multiplier)
        }
    }

    override fun buffs(sp: SimParticipant): List<Buff> = listOf(buff)
}
