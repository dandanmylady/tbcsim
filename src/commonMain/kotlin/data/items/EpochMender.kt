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
public class EpochMender : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28033

  public override var name: String = "Epoch-Mender"

  public override var itemLevel: Int = 112

  public override var quality: Int = 3

  public override var icon: String = "inv_staff_46.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 100.27999877929688

  public override var maxDmg: Double = 187.27999877929688

  public override var speed: Double = 2400.0

  public override var stats: Stats = Stats(
      stamina = 37,
      intellect = 35
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33273, "Increase Healing 227", this),
        Buffs.byIdOrName(21637, "Increased Mana Regen", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      EpochMender::class, serializer()) }
}
