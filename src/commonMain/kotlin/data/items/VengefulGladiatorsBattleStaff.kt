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
import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@JsExport
@Serializable
public class VengefulGladiatorsBattleStaff : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34540

  public override var name: String = "Vengeful Gladiator's Battle Staff"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_staff_54.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 90.4000015258789

  public override var maxDmg: Double = 198.39999389648438

  public override var speed: Double = 2000.0

  public override var stats: Stats = Stats(
      stamina = 62,
      intellect = 46,
      spellCritRating = 46.0,
      spellHitRating = 28.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(43455, "Increase Spell Dam 247", this)
        )}

}
