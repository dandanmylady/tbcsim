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
public class AuchenaiTrackersHauberk : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29339

  public override var name: String = "Auchenai Tracker's Hauberk"

  public override var itemLevel: Int = 100

  public override var quality: Int = 3

  public override var icon: String = "inv_chest_plate10.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      intellect = 29,
      armor = 570
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.BLUE),
      Socket(Color.BLUE),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2952)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14052, "Attack Power 60", this),
        Buffs.byIdOrName(21363, "Increased Mana Regen", this)
        )}

}
