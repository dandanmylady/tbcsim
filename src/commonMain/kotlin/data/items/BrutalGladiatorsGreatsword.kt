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
public class BrutalGladiatorsGreatsword : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35015

  public override var name: String = "Brutal Gladiator's Greatsword"

  public override var itemLevel: Int = 154

  public override var quality: Int = 4

  public override var icon: String = "inv_sword_116.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_2H

  public override var minDmg: Double = 404.0

  public override var maxDmg: Double = 606.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 50,
      stamina = 66,
      physicalCritRating = 50.0,
      physicalHitRating = 19.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(43902, "Armor Penetration 98", this)
        )}

}
