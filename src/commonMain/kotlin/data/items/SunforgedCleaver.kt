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
public class SunforgedCleaver : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34699

  public override var name: String = "Sun-forged Cleaver"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_axe_02.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_1H

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 130.0

  public override var maxDmg: Double = 243.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      meleeCritRating = 13.0,
      rangedCritRating = 13.0,
      physicalHasteRating = 15.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 5

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9335, "Attack Power 28", this)
        )}

}
