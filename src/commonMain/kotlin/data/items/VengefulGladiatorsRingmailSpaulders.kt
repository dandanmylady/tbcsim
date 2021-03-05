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
public class VengefulGladiatorsRingmailSpaulders : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33742

  public override var name: String = "Vengeful Gladiator's Ringmail Spaulders"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_shoulder_61.jpg"

  public override var inventorySlot: Int = 3

  public override var itemSet: ItemSet? = ItemSets.byId(686)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 43,
      intellect = 23,
      spellCritRating = 20.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2859)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(21364, "Increased Mana Regen", this),
        Buffs.byIdOrName(18036, "Increase Healing 55", this)
        )}

}
