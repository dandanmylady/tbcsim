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
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class UtopianTunicOfElune : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34398

  public override var name: String = "Utopian Tunic of Elune"

  public override var itemLevel: Int = 159

  public override var quality: Int = 4

  public override var icon: String = "inv_chest_leather_14.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 48,
      intellect = 41,
      spirit = 32,
      armor = 499,
      spellHasteRating = 33.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.BLUE),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2865)

  public override var phase: Int = 5

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(23929, "Increase Spell Dam 71", this)
        )}

}
