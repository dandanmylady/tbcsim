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

public class EmbraceOfTheTwistingNether : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 23565

  public override var name: String = "Embrace of the Twisting Nether"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 56,
      intellect = 27,
      physicalCritRating = 35.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(90)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15828, "Attack Power 84", this),
        Buffs.byIdOrName(21632, "Increased Mana Regen", this),
        Buffs.byIdOrName(34518, "Nether Protection", this)
        )}

}