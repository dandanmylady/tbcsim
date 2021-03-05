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
public class VengefulGladiatorsTouchOfDefeat : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33764

  public override var name: String = "Vengeful Gladiator's Touch of Defeat"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_wand_09.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.WAND

  public override var minDmg: Double = 252.0

  public override var maxDmg: Double = 468.0

  public override var speed: Double = 1900.0

  public override var stats: Stats = Stats(
      stamina = 18,
      intellect = 14
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9346, "Increase Spell Dam 18", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      VengefulGladiatorsTouchOfDefeat::class, serializer()) }
}
