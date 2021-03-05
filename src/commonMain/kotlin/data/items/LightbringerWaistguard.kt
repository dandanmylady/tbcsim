package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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
public class LightbringerWaistguard : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34488

  public override var name: String = "Lightbringer Waistguard"

  public override var itemLevel: Int = 154

  public override var quality: Int = 4

  public override var icon: String = "inv_belt_27.jpg"

  public override var inventorySlot: Int = 6

  public override var itemSet: ItemSet? = ItemSets.byId(679)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 64,
      defenseRating = 28.0,
      blockRating = 20.0,
      dodgeRating = 30.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2926)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(18050, "Increase Spell Dam 33", this)
        )}

}
