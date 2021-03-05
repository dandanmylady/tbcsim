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
public class BrutalGladiatorsShanker : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35093

  public override var name: String = "Brutal Gladiator's Shanker"

  public override var itemLevel: Int = 154

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_75.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 155.0

  public override var maxDmg: Double = 233.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 31,
      physicalCritRating = 22.0,
      physicalHitRating = 9.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15808, "Attack Power 38", this),
        Buffs.byIdOrName(43901, "Armor Penetration 49", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      BrutalGladiatorsShanker::class, serializer()) }
}
