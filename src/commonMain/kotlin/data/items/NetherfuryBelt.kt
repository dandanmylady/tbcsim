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
public class NetherfuryBelt : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25694

  public override var name: String = "Netherfury Belt"

  public override var itemLevel: Int = 106

  public override var quality: Int = 3

  public override var icon: String = "inv_belt_15.jpg"

  public override var inventorySlot: Int = 6

  public override var itemSet: ItemSet? = ItemSets.byId(576)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 27
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2875)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14248, "Increase Spell Dam 21", this),
        Buffs.byIdOrName(21631, "Increased Mana Regen", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      NetherfuryBelt::class, serializer()) }
}
