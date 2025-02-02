package `data`.items

import `data`.Constants
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
public class BreastplateOfRighteousFury : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28337

  public override var name: String = "Breastplate of Righteous Fury"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_chest_plate08.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      strength = 31,
      stamina = 29,
      intellect = 28,
      armor = 1164
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.RED),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2865)

  public override var phase: Int = 1

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
