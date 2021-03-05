package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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
public class MantleOfTheElvenKings : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30024

  public override var name: String = "Mantle of the Elven Kings"

  public override var itemLevel: Int = 128

  public override var quality: Int = 4

  public override var icon: String = "inv_shoulder_25.jpg"

  public override var inventorySlot: Int = 3

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 27,
      intellect = 18,
      spirit = 17,
      spellCritRating = 25.0,
      spellHitRating = 18.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(18055, "Increase Spell Dam 39", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      MantleOfTheElvenKings::class, serializer()) }
}
