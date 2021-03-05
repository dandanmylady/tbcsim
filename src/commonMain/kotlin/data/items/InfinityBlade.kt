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
public class InfinityBlade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30312

  public override var name: String = "Infinity Blade"

  public override var itemLevel: Int = 175

  public override var quality: Int = 5

  public override var icon: String = "inv_weapon_shortblade_47.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 171.0

  public override var maxDmg: Double = 318.0

  public override var speed: Double = 2000.0

  public override var stats: Stats = Stats(
      stamina = 35,
      physicalCritRating = 25.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15820, "Attack Power 70", this),
        Buffs.byIdOrName(36478, "Magic Disruption", this)
        )}

}
