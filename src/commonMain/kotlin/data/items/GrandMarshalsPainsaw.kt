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
public class GrandMarshalsPainsaw : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28949

  public override var name: String = "Grand Marshal's Painsaw"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_halberd_04.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.POLEARM

  public override var minDmg: Double = 164.0

  public override var maxDmg: Double = 246.0

  public override var speed: Double = 2200.0

  public override var stats: Stats = Stats(
      stamina = 42,
      physicalCritRating = 28.0,
      physicalHitRating = 18.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15814, "Attack Power 56", this)
        )}

}
