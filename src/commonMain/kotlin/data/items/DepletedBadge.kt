package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
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
public class DepletedBadge : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32672

  public override var name: String = "Depleted Badge"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_misc_armorkit_12.jpg"

  public override var inventorySlot: Int = 0

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.MISCELLANEOUS

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.JUNK

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      armor = 308
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(40744, "Apexis Crystal Infusion", this)
        )}

}
