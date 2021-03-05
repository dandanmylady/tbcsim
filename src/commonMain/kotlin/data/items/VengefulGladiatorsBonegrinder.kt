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
public class VengefulGladiatorsBonegrinder : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33663

  public override var name: String = "Vengeful Gladiator's Bonegrinder"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_mace_43.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 386.0

  public override var maxDmg: Double = 580.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 46,
      stamina = 62,
      physicalCritRating = 46.0,
      physicalHitRating = 15.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(43902, "Armor Penetration 98", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      VengefulGladiatorsBonegrinder::class, serializer()) }
}
