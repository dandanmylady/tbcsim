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
public class StaffOfDisintegration : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30313

  public override var name: String = "Staff of Disintegration"

  public override var itemLevel: Int = 175

  public override var quality: Int = 5

  public override var icon: String = "inv_staff_52.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 131.16000366210938

  public override var maxDmg: Double = 309.1600036621094

  public override var speed: Double = 2800.0

  public override var stats: Stats = Stats(
      stamina = 75,
      intellect = 50,
      spellCritRating = 75.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36385, "Increase Spell Dam 325", this),
        Buffs.byIdOrName(44917, "Attack Power - Feral (+1459)", this),
        Buffs.byIdOrName(36480, "Mental Protection Field", this)
        )}

}
