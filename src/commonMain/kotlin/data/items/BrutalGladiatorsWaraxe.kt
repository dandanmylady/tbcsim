package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
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
public class BrutalGladiatorsWaraxe : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35110

  public override var name: String = "Brutal Gladiator's Waraxe"

  public override var itemLevel: Int = 154

  public override var quality: Int = 4

  public override var icon: String = "inv_axe_1h_blacksmithing_02.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_1H

  public override var allowableClasses: Array<Constants.AllowableClass>? = arrayOf(
      Constants.AllowableClass.HUNTER,
      Constants.AllowableClass.DEATHKNIGHT
      )

  public override var minDmg: Double = 196.0

  public override var maxDmg: Double = 365.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      stamina = 31,
      meleeCritRating = 20.0,
      rangedCritRating = 20.0,
      physicalHitRating = 9.0,
      resilienceRating = 14.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 5

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15809, "Attack Power 42", this),
        Buffs.byIdOrName(47041, "Armor Penetration 42", this)
        )}

}
