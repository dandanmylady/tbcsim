package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
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
public class HandOfTheDeceiver : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34331

  public override var name: String = "Hand of the Deceiver"

  public override var itemLevel: Int = 164

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_hand_15.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.FIST

  public override var minDmg: Double = 238.0

  public override var maxDmg: Double = 357.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      stamina = 28
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.YELLOW),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2973)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15813, "Attack Power 54", this),
        Buffs.byIdOrName(40226, "Armor Penetration 196", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      HandOfTheDeceiver::class, serializer()) }
}
