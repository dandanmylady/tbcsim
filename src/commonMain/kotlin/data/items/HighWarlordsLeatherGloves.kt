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
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.SerializersModule

@JsExport
@Serializable
public class HighWarlordsLeatherGloves : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28836

  public override var name: String = "High Warlord's Leather Gloves"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_gauntlets_28.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(606)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 21,
      stamina = 31,
      physicalCritRating = 11.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9332, "Attack Power 22", this),
        Buffs.byIdOrName(32748, "Deadly Throw Interrupt", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      HighWarlordsLeatherGloves::class, serializer()) }
}
