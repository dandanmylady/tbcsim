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

public class BattleMagesBaton : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25760

  public override var name: String = "Battle Mage's Baton"

  public override var itemLevel: Int = 103

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 92.2699966430664

  public override var maxDmg: Double = 161.27000427246094

  public override var speed: Double = 2100.0

  public override var stats: Stats = Stats(
      stamina = 45,
      intellect = 31,
      spellCritRating = 30.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(28687, "Increase Spell Dam 85", this)
      )
}