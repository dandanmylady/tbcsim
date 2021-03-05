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
public class MarshalsChainGirdle : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28974

  public override var name: String = "Marshal's Chain Girdle"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_belt_20.jpg"

  public override var inventorySlot: Int = 6

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 27,
      stamina = 39,
      intellect = 18,
      physicalCritRating = 14.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9336, "Attack Power 30", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      MarshalsChainGirdle::class, serializer()) }
}
