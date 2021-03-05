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
public class BootsOfRighteousFortitude : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32778

  public override var name: String = "Boots of Righteous Fortitude"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_boots_plate_06.jpg"

  public override var inventorySlot: Int = 8

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 37,
      intellect = 14,
      defenseRating = 19.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(13881, "Increase Spell Dam 29", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      BootsOfRighteousFortitude::class, serializer()) }
}
