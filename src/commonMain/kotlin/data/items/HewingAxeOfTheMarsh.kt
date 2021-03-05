package `data`.items

import `data`.Constants
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
public class HewingAxeOfTheMarsh : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25537

  public override var name: String = "Hewing Axe of the Marsh"

  public override var itemLevel: Int = 94

  public override var quality: Int = 3

  public override var icon: String = "inv_axe_02.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var minDmg: Double = 176.0

  public override var maxDmg: Double = 265.0

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(
      strength = 29,
      agility = 28,
      stamina = 42
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      HewingAxeOfTheMarsh::class, serializer()) }
}
