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
public class HoodOfAbsolution : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31064

  public override var name: String = "Hood of Absolution"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_helmet_99.jpg"

  public override var inventorySlot: Int = 1

  public override var itemSet: ItemSet? = ItemSets.byId(674)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 36,
      intellect = 39,
      spirit = 27,
      spellCritRating = 17.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.META),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2889)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(34760, "Increase Spell Dam 62", this),
        Buffs.byIdOrName(21632, "Increased Mana Regen", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      HoodOfAbsolution::class, serializer()) }
}
