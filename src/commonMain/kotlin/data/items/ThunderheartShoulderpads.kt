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
public class ThunderheartShoulderpads : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31049

  public override var name: String = "Thunderheart Shoulderpads"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_shoulder_58.jpg"

  public override var inventorySlot: Int = 3

  public override var itemSet: ItemSet? = ItemSets.byId(677)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 30,
      intellect = 31,
      spirit = 19,
      spellCritRating = 13.0,
      spellHitRating = 14.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.BLUE),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2900)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(28264, "Increase Spell Dam 46", this)
        )}

}
