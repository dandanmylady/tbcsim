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
public class GemOfTrappedInnocents : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 23057

  public override var name: String = "Gem of Trapped Innocents"

  public override var itemLevel: Int = 92

  public override var quality: Int = 4

  public override var icon: String = "inv_jewelry_necklace_29naxxramas.jpg"

  public override var inventorySlot: Int = 2

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MISC

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 9,
      intellect = 7
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9344, "Increase Spell Dam 15", this),
        Buffs.byIdOrName(18382, "Increased Critical Spell", this)
        )}

}
