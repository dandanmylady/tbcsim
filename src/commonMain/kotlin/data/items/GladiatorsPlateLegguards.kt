package `data`.items

import `data`.Constants
import `data`.itemsets.ItemSets
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
public class GladiatorsPlateLegguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 24547

  public override var name: String = "Gladiator's Plate Legguards"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_pants_plate_17.jpg"

  public override var inventorySlot: Int = 7

  public override var itemSet: ItemSet? = ItemSets.byId(567)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 40,
      stamina = 55,
      physicalCritRating = 36.0,
      physicalHitRating = 12.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      GladiatorsPlateLegguards::class, serializer()) }
}
