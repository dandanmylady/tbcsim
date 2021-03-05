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
public class GladiatorsPummeler : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28305

  public override var name: String = "Gladiator's Pummeler"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_mace_36.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 189.0

  public override var maxDmg: Double = 285.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      stamina = 21,
      physicalCritRating = 15.0,
      physicalHitRating = 9.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9335, "Attack Power 28", this)
        )}

}
