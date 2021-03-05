package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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
public class GauntletsOfTheSoothedSoul : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34240

  public override var name: String = "Gauntlets of the Soothed Soul"

  public override var itemLevel: Int = 159

  public override var quality: Int = 4

  public override var icon: String = "inv_gauntlets_20.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 27,
      intellect = 33,
      spellHasteRating = 30.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.YELLOW),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2881)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36098, "Increase Healing 99", this),
        Buffs.byIdOrName(21365, "Increased Mana Regen", this)
        )}

}
