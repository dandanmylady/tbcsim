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
public class ScryersBladeOfFocus : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34895

  public override var name: String = "Scryer's Blade of Focus"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_78.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 18.760000228881836

  public override var maxDmg: Double = 129.75999450683594

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 42,
      intellect = 28
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(43455, "Increase Spell Dam 247", this)
        )}

}
