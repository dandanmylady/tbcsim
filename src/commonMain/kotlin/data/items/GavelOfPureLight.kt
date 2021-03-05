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
public class GavelOfPureLight : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29175

  public override var name: String = "Gavel of Pure Light"

  public override var itemLevel: Int = 100

  public override var quality: Int = 4

  public override var icon: String = "inv_hammer_04.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 32.380001068115234

  public override var maxDmg: Double = 125.37999725341797

  public override var speed: Double = 1900.0

  public override var stats: Stats = Stats(
      stamina = 12,
      intellect = 12
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(34495, "Increase Healing 299", this),
        Buffs.byIdOrName(21630, "Increased Mana Regen", this)
        )}

}
