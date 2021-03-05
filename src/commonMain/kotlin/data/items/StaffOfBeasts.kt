package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@JsExport
@Serializable
public class StaffOfBeasts : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25761

  public override var name: String = "Staff of Beasts"

  public override var itemLevel: Int = 103

  public override var quality: Int = 3

  public override var icon: String = "inv_staff_34.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 144.7100067138672

  public override var maxDmg: Double = 252.7100067138672

  public override var speed: Double = 3300.0

  public override var stats: Stats = Stats(
      strength = 31,
      agility = 30,
      stamina = 45
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44903, "Attack Power - Feral (+0375)", this)
        )}

}
