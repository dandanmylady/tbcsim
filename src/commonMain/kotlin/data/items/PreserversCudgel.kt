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
public class PreserversCudgel : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25836

  public override var name: String = "Preserver's Cudgel"

  public override var itemLevel: Int = 91

  public override var quality: Int = 3

  public override var icon: String = "inv_mace_11.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 62.0

  public override var maxDmg: Double = 145.0

  public override var speed: Double = 2500.0

  public override var stats: Stats = Stats(
      stamina = 16,
      intellect = 11
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(37083, "Increase Healing 105", this),
        Buffs.byIdOrName(21363, "Increased Mana Regen", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      PreserversCudgel::class, serializer()) }
}
