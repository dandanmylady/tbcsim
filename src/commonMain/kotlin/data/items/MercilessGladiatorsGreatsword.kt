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
import kotlin.js.JsExport
import kotlinx.serialization.Serializable

@JsExport
@Serializable
public class MercilessGladiatorsGreatsword : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31984

  public override var name: String = "Merciless Gladiator's Greatsword"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_sword_70.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_2H

  public override var minDmg: Double = 365.0

  public override var maxDmg: Double = 549.0

  public override var speed: Double = 3600.0

  public override var stats: Stats = Stats(
      strength = 42,
      stamina = 55,
      physicalCritRating = 42.0,
      physicalHitRating = 18.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
