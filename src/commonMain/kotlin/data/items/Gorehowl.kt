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
public class Gorehowl : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28773

  public override var name: String = "Gorehowl"

  public override var itemLevel: Int = 125

  public override var quality: Int = 4

  public override var icon: String = "inv_axe_60.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var minDmg: Double = 345.0

  public override var maxDmg: Double = 518.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 49,
      agility = 43,
      stamina = 51
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      Gorehowl::class, serializer()) }
}
