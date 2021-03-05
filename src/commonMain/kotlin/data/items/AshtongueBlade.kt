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
public class AshtongueBlade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30999

  public override var name: String = "Ashtongue Blade"

  public override var itemLevel: Int = 109

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_shortblade_29.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 65.0

  public override var maxDmg: Double = 122.0

  public override var speed: Double = 1400.0

  public override var stats: Stats = Stats(
      agility = 11,
      stamina = 10
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14049, "Attack Power 40", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      AshtongueBlade::class, serializer()) }
}
