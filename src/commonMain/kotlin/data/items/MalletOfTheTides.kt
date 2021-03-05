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
public class MalletOfTheTides : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30058

  public override var name: String = "Mallet of the Tides"

  public override var itemLevel: Int = 134

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_42.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 115.0

  public override var maxDmg: Double = 214.0

  public override var speed: Double = 1700.0

  public override var stats: Stats = Stats(
      stamina = 34,
      expertiseRating = 14.0,
      defenseRating = 16.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      MalletOfTheTides::class, serializer()) }
}
