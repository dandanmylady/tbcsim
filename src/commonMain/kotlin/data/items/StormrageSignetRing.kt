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
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.SerializersModule

@JsExport
@Serializable
public class StormrageSignetRing : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32497

  public override var name: String = "Stormrage Signet Ring"

  public override var itemLevel: Int = 151

  public override var quality: Int = 4

  public override var icon: String = "inv_jewelry_ring_67.jpg"

  public override var inventorySlot: Int = 11

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MISC

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 33,
      physicalHitRating = 30.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15818, "Attack Power 66", this),
        Buffs.byIdOrName(40680, "Armor Penetration 126", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      StormrageSignetRing::class, serializer()) }
}
