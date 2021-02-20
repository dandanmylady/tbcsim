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

public class GladiatorsMaul : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28476

  public override var name: String = "Gladiator's Maul"

  public override var itemLevel: Int = 123

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 89.4000015258789

  public override var maxDmg: Double = 185.39999389648438

  public override var speed: Double = 2000.0

  public override var stats: Stats = Stats(
      strength = 32,
      stamina = 48,
      physicalCritRating = 35.0,
      physicalHitRating = 20.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44912, "Attack Power - Feral (+0894)", this)
        )}

}