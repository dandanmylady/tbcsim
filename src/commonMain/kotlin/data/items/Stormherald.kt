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
public class Stormherald : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28442

  public override var name: String = "Stormherald"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_mace_2h_blacksmithing_03.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 386.0

  public override var maxDmg: Double = 579.0

  public override var speed: Double = 3800.0

  public override var stats: Stats = Stats(
      strength = 42,
      agility = 42,
      stamina = 61
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(34510, "Stun", this)
        )}

}
