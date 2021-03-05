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
public class Heartrazor : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29962

  public override var name: String = "Heartrazor"

  public override var itemLevel: Int = 134

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_46.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 121.0

  public override var maxDmg: Double = 226.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      agility = 20,
      stamina = 30
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36041, "Heartrazor", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      Heartrazor::class, serializer()) }
}
