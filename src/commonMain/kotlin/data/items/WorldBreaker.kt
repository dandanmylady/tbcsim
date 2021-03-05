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
public class WorldBreaker : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30090

  public override var name: String = "World Breaker"

  public override var itemLevel: Int = 134

  public override var quality: Int = 4

  public override var icon: String = "inv_mace_52.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 371.0

  public override var maxDmg: Double = 558.0

  public override var speed: Double = 3700.0

  public override var stats: Stats = Stats(
      strength = 50,
      stamina = 51
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36111, "World Breaker", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      WorldBreaker::class, serializer()) }
}
