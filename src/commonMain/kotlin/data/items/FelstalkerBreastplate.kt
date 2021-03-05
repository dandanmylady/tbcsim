package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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
public class FelstalkerBreastplate : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25696

  public override var name: String = "Felstalker Breastplate"

  public override var itemLevel: Int = 114

  public override var quality: Int = 3

  public override var icon: String = "inv_chest_chain_13.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = ItemSets.byId(575)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 26,
      intellect = 26
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.RED),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(104)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15812, "Attack Power 52", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      FelstalkerBreastplate::class, serializer()) }
}
