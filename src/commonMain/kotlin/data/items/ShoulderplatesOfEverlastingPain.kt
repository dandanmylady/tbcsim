package `data`.items

import `data`.Constants
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
public class ShoulderplatesOfEverlastingPain : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34601

  public override var name: String = "Shoulderplates of Everlasting Pain"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_shoulder_27.jpg"

  public override var inventorySlot: Int = 3

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 30,
      stamina = 33,
      physicalHasteRating = 21.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2879)

  public override val buffs: List<Buff> by lazy {
        listOf()}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      ShoulderplatesOfEverlastingPain::class, serializer()) }
}
