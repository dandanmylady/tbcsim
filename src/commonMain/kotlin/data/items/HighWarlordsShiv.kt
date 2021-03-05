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
public class HighWarlordsShiv : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28930

  public override var name: String = "High Warlord's Shiv"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_shortblade_29.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 80.0

  public override var maxDmg: Double = 121.0

  public override var speed: Double = 1400.0

  public override var stats: Stats = Stats(
      stamina = 18,
      physicalCritRating = 13.0,
      physicalHitRating = 8.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9334, "Attack Power 26", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      HighWarlordsShiv::class, serializer()) }
}
