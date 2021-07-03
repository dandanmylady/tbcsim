package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
import character.Buff
import character.Stats
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class PantsOfSplendidRecovery : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33552

  public override var name: String = "Pants of Splendid Recovery"

  public override var itemLevel: Int = 128

  public override var quality: Int = 4

  public override var icon: String = "inv_pants_leather_23.jpg"

  public override var inventorySlot: Int = 7

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 30,
      intellect = 40,
      spirit = 31,
      armor = 353
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2865)

  public override var phase: Int = 3

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36062, "Increase Healing 86", this)
        )}

}
