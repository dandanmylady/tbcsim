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
public class MercilessGladiatorsDragonhideGloves : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31967

  public override var name: String = "Merciless Gladiator's Dragonhide Gloves"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_gauntlets_28.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(584)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 34,
      agility = 19,
      stamina = 40,
      intellect = 19
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(7681, "Increase Healing 15", this),
        Buffs.byIdOrName(33830, "Cyclone Cast Time Decrease", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      MercilessGladiatorsDragonhideGloves::class, serializer()) }
}
