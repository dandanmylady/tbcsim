package `data`.items

import `data`.Constants
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
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
public class HammerOfTheNaaru : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28800

  public override var name: String = "Hammer of the Naaru"

  public override var itemLevel: Int = 125

  public override var quality: Int = 4

  public override var icon: String = "inv_hammer_28.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 345.0

  public override var maxDmg: Double = 518.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 44,
      stamina = 41,
      intellect = 37
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.RED),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2869)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
