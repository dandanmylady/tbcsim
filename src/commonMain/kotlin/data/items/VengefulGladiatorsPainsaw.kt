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
public class VengefulGladiatorsPainsaw : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33727

  public override var name: String = "Vengeful Gladiator's Painsaw"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_halberd15.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.POLEARM

  public override var allowableClasses: Array<Constants.AllowableClass>? = null

  public override var minDmg: Double = 236.0

  public override var maxDmg: Double = 354.0

  public override var speed: Double = 2200.0

  public override var stats: Stats = Stats(
      stamina = 62,
      meleeCritRating = 47.0,
      rangedCritRating = 47.0,
      resilienceRating = 42.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override var phase: Int = 3

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15832, "Attack Power 92", this)
        )}

}
