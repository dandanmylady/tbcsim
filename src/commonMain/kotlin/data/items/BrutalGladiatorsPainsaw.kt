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
public class BrutalGladiatorsPainsaw : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35064

  public override var name: String = "Brutal Gladiator's Painsaw"

  public override var itemLevel: Int = 154

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_halberd_20.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.POLEARM

  public override var minDmg: Double = 247.0

  public override var maxDmg: Double = 371.0

  public override var speed: Double = 2200.0

  public override var stats: Stats = Stats(
      stamina = 68,
      physicalCritRating = 51.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(42107, "Attack Power 102", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      BrutalGladiatorsPainsaw::class, serializer()) }
}
