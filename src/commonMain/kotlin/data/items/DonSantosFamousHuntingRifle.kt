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
public class DonSantosFamousHuntingRifle : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31323

  public override var name: String = "Don Santos' Famous Hunting Rifle"

  public override var itemLevel: Int = 100

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_rifle_21.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.GUN

  public override var minDmg: Double = 139.0

  public override var maxDmg: Double = 259.0

  public override var speed: Double = 2700.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(38290, "Santos' Blessing", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      DonSantosFamousHuntingRifle::class, serializer()) }
}
