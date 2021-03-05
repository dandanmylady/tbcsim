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
public class MercilessGladiatorsSlicer : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32052

  public override var name: String = "Merciless Gladiator's Slicer"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_sword_71.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 203.0

  public override var maxDmg: Double = 305.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      stamina = 27,
      physicalCritRating = 19.0,
      physicalHitRating = 10.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9336, "Attack Power 30", this)
        )}

}
