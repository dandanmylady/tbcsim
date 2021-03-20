package `data`.items

import `data`.Constants
import `data`.itemsets.ItemSets
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
public class GladiatorsPlateHelm : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 24545

  public override var name: String = "Gladiator's Plate Helm"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_helmet_07.jpg"

  public override var inventorySlot: Int = 1

  public override var itemSet: ItemSet? = ItemSets.byId(567)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.WARRIOR
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 30,
      stamina = 52,
      armor = 1257,
      physicalCritRating = 28.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.META),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2927)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
