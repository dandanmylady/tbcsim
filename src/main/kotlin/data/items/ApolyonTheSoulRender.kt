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

public class ApolyonTheSoulRender : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Apolyon, the Soul-Render"

  public override var itemLevel: Int = 164

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_2H

  public override var minDmg: Double = 404.0

  public override var maxDmg: Double = 607.0

  public override var speed: Double = 3400.0

  public override var stats: Stats = Stats(
      stamina = 75,
      physicalCritRating = 42.0,
      physicalHasteRating = 32.0,
      spellCritRating = 42.0,
      spellHasteRating = 32.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED),
      Socket(Color.RED),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2868)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byId(39885)
      )
}