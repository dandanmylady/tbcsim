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

public class GuardiansWyrmhideBracers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35180

  public override var name: String = "Guardian's Wyrmhide Bracers"

  public override var itemLevel: Int = 154

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 35,
      intellect = 23
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2867)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14054, "Increase Spell Dam 27", this),
        Buffs.byIdOrName(21630, "Increased Mana Regen", this)
        )}

}