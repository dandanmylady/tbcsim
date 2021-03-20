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
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class BrutalGladiatorsMailArmor : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35048

  public override var name: String = "Brutal Gladiator's Mail Armor"

  public override var itemLevel: Int = 159

  public override var quality: Int = 4

  public override var icon: String = "inv_chest_chain_16.jpg"

  public override var inventorySlot: Int = 20

  public override var itemSet: ItemSet? = ItemSets.byId(580)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.SHAMAN
      )

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 61,
      intellect = 33,
      armor = 1110,
      spellCritRating = 34.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2951)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(21366, "Increased Mana Regen", this),
        Buffs.byIdOrName(28360, "Increase Spell Dam 49", this)
        )}

}
