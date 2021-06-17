package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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
public class PrimalstrikeBracers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29527

  public override var name: String = "Primalstrike Bracers"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_bracer_07.jpg"

  public override var inventorySlot: Int = 9

  public override var itemSet: ItemSet? = ItemSets.byId(619)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 15,
      stamina = 21,
      armor = 159
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15817, "Attack Power 64", this)
        )}

}
