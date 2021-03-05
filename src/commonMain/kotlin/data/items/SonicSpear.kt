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
public class SonicSpear : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27903

  public override var name: String = "Sonic Spear"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_spear_08.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.POLEARM

  public override var minDmg: Double = 261.0

  public override var maxDmg: Double = 392.0

  public override var speed: Double = 3500.0

  public override var stats: Stats = Stats(
      agility = 35,
      stamina = 30,
      physicalHitRating = 24.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15816, "Attack Power 62", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      SonicSpear::class, serializer()) }
}
