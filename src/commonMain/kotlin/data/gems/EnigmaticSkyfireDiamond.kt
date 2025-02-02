package data.gems

import character.Buff
import character.Stats
import data.model.Color
import data.model.Gem
import data.model.Quality
import data.model.Socket
import sim.SimParticipant
import kotlin.js.JsExport

@JsExport
class EnigmaticSkyfireDiamond : Gem(25895, "Enigmatic Skyfire Diamond", "inv_misc_gem_diamond_07.jpg", null, Color.META, Quality.META) {
    val buff = object : Buff() {
        override val name: String = "Enigmatic Skyfire Diamond"
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sp: SimParticipant): Stats {
            return Stats(
                meleeCritRating = 12.0,
                rangedCritRating = 12.0
            )
        }
    }

    override fun metaActive(sockets: List<Socket>): Boolean {
        val byColor = socketsByColor(sockets)

        return byColor[Color.RED] ?: 0 >
                byColor[Color.YELLOW] ?: 0
    }

    override var buffs: List<Buff> = listOf(buff)
}
