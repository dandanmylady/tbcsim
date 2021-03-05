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
public class Creepjacker : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25943

  public override var name: String = "Creepjacker"

  public override var itemLevel: Int = 97

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_shortblade_16.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var minDmg: Double = 106.0

  public override var maxDmg: Double = 197.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      stamina = 13,
      physicalCritRating = 13.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9335, "Attack Power 28", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      Creepjacker::class, serializer()) }
}
