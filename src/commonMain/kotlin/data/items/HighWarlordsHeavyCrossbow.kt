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

public class HighWarlordsHeavyCrossbow : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28933

  public override var name: String = "High Warlord's Heavy Crossbow"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CROSSBOW

  public override var minDmg: Double = 170.0

  public override var maxDmg: Double = 255.0

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 12,
      physicalCritRating = 9.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(21434, "Attack Power Ranged 22", this)
      )
}