package `data`.items

import `data`.Constants
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
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
public class AldoriLegacyDefender : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28825

  public override var name: String = "Aldori Legacy Defender"

  public override var itemLevel: Int = 125

  public override var quality: Int = 4

  public override var icon: String = "inv_shield_30.jpg"

  public override var inventorySlot: Int = 14

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SHIELD

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 39,
      physicalHitRating = 15.0,
      defenseRating = 19.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2976)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
