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
public class MercilessGladiatorsMaul : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32014

  public override var name: String = "Merciless Gladiator's Maul"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_mace_52.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 90.4000015258789

  public override var maxDmg: Double = 192.39999389648438

  public override var speed: Double = 2000.0

  public override var stats: Stats = Stats(
      strength = 42,
      stamina = 55,
      physicalCritRating = 42.0,
      physicalHitRating = 18.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44915, "Attack Power - Feral (+1010)", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      MercilessGladiatorsMaul::class, serializer()) }
}
