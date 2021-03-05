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
public class TheGunblade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31204

  public override var name: String = "The Gunblade"

  public override var itemLevel: Int = 100

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_rifle_07.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.GUN

  public override var minDmg: Double = 112.0

  public override var maxDmg: Double = 210.0

  public override var speed: Double = 2800.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14089, "Attack Power 36", this)
        )}

}
