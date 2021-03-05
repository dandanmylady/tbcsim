package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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
public class GladiatorsRingmailGauntlets : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31397

  public override var name: String = "Gladiator's Ringmail Gauntlets"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_gauntlets_11.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(686)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 36,
      intellect = 18,
      spellCritRating = 21.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(38501, "Shaman Lesser Healing Wave Crit Chance", this),
        Buffs.byIdOrName(18038, "Increase Healing 59", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      GladiatorsRingmailGauntlets::class, serializer()) }
}
