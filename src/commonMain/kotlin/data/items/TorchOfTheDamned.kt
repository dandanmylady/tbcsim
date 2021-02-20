package `data`.items

import `data`.Constants
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

public class TorchOfTheDamned : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32332

  public override var name: String = "Torch of the Damned"

  public override var itemLevel: Int = 141

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 396.0

  public override var maxDmg: Double = 595.0

  public override var speed: Double = 3800.0

  public override var stats: Stats = Stats(
      strength = 51,
      stamina = 45,
      physicalCritRating = 38.0,
      physicalHasteRating = 50.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}