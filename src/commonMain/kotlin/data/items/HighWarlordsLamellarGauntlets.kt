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
public class HighWarlordsLamellarGauntlets : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28832

  public override var name: String = "High Warlord's Lamellar Gauntlets"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_gauntlets_29.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(587)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 36,
      intellect = 13,
      spellCritRating = 19.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14248, "Increase Spell Dam 21", this),
        Buffs.byIdOrName(23300, "Seal of the Crusader Judgement Increase", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      HighWarlordsLamellarGauntlets::class, serializer()) }
}
