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
public class MarshalsChainBracers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28973

  public override var name: String = "Marshal's Chain Bracers"

  public override var itemLevel: Int = 113

  public override var quality: Int = 4

  public override var icon: String = "inv_bracer_16.jpg"

  public override var inventorySlot: Int = 9

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 18,
      stamina = 25,
      intellect = 9,
      armor = 349,
      meleeCritRating = 7.0,
      rangedCritRating = 7.0,
      resilienceRating = 11.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2867)

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9329, "Attack Power 16", this)
        )}

}
