package `data`.items

import `data`.Constants
import `data`.itemsets.ItemSets
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
public class HeavyClefthoofBoots : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25691

  public override var name: String = "Heavy Clefthoof Boots"

  public override var itemLevel: Int = 113

  public override var quality: Int = 3

  public override var icon: String = "inv_boots_07.jpg"

  public override var inventorySlot: Int = 8

  public override var itemSet: ItemSet? = ItemSets.byId(574)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 30,
      defenseRating = 21.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2876)

  public override val buffs: List<Buff> by lazy {
        listOf()}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      HeavyClefthoofBoots::class, serializer()) }
}
