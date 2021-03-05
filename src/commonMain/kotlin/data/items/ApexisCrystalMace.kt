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
public class ApexisCrystalMace : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32661

  public override var name: String = "Apexis Crystal Mace"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_mace_34.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 90.0

  public override var maxDmg: Double = 168.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      physicalCritRating = 20.0,
      physicalHitRating = 8.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9332, "Attack Power 22", this)
        )}

}
