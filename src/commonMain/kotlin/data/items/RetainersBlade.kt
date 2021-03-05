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
public class RetainersBlade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29125

  public override var name: String = "Retainer's Blade"

  public override var itemLevel: Int = 100

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_29.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 97.0

  public override var maxDmg: Double = 146.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      agility = 22,
      stamina = 21
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
