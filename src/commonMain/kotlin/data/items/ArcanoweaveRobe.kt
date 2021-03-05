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
public class ArcanoweaveRobe : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 21868

  public override var name: String = "Arcanoweave Robe"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_chest_cloth_01.jpg"

  public override var inventorySlot: Int = 20

  public override var itemSet: ItemSet? = ItemSets.byId(558)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 45
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(21631, "Increased Mana Regen", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      ArcanoweaveRobe::class, serializer()) }
}
