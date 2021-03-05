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
public class LibramOfSoulsRedeemed : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28592

  public override var name: String = "Libram of Souls Redeemed"

  public override var itemLevel: Int = 115

  public override var quality: Int = 4

  public override var icon: String = "inv_relics_libramofgrace.jpg"

  public override var inventorySlot: Int = 28

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LIBRAM

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(38320, "Increased Blessing of Light Healing", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      LibramOfSoulsRedeemed::class, serializer()) }
}
