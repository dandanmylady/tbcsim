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
public class Splintermark : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27931

  public override var name: String = "Splintermark"

  public override var itemLevel: Int = 91

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_bow_04.jpg"

  public override var inventorySlot: Int = 15

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.BOW

  public override var minDmg: Double = 93.0

  public override var maxDmg: Double = 174.0

  public override var speed: Double = 2500.0

  public override var stats: Stats = Stats(
      stamina = 7,
      physicalCritRating = 12.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9329, "Attack Power 16", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      Splintermark::class, serializer()) }
}
