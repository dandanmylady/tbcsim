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
public class CharlottesIvy : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31338

  public override var name: String = "Charlotte's Ivy"

  public override var itemLevel: Int = 100

  public override var quality: Int = 4

  public override var icon: String = "inv_jewelry_necklace_36.jpg"

  public override var inventorySlot: Int = 2

  public override var itemSet: ItemSet? = ItemSets.byId(667)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MISC

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 18,
      intellect = 19,
      spirit = 14
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14047, "Increase Spell Dam 23", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      CharlottesIvy::class, serializer()) }
}
