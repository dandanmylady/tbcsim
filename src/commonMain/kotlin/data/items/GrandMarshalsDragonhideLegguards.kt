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
public class GrandMarshalsDragonhideLegguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28620

  public override var name: String = "Grand Marshal's Dragonhide Legguards"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_pants_cloth_05.jpg"

  public override var inventorySlot: Int = 7

  public override var itemSet: ItemSet? = ItemSets.byId(601)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 23,
      agility = 22,
      stamina = 30,
      intellect = 22
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(18034, "Increase Healing 48", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      GrandMarshalsDragonhideLegguards::class, serializer()) }
}
