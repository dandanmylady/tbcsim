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
public class SeersCane : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29133

  public override var name: String = "Seer's Cane"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_staff_38.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 92.37000274658203

  public override var maxDmg: Double = 171.3699951171875

  public override var speed: Double = 2100.0

  public override var stats: Stats = Stats(
      stamina = 28,
      intellect = 46
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(35338, "Increase Healing 228", this),
        Buffs.byIdOrName(21633, "Increased Mana Regen", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      SeersCane::class, serializer()) }
}
