package `data`.items

import `data`.Constants
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@JsExport
@Serializable
public class FelHardenedMaul : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 23546

  public override var name: String = "Fel Hardened Maul"

  public override var itemLevel: Int = 105

  public override var quality: Int = 4

  public override var icon: String = "inv_hammer_17.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 286.0

  public override var maxDmg: Double = 430.0

  public override var speed: Double = 3300.0

  public override var stats: Stats = Stats(
      strength = 50,
      stamina = 46,
      physicalCritRating = 21.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
