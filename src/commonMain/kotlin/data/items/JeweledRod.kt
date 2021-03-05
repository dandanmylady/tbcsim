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
public class JeweledRod : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32831

  public override var name: String = "Jeweled Rod"

  public override var itemLevel: Int = 109

  public override var quality: Int = 3

  public override var icon: String = "inv_wand_11.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.WAND

  public override var minDmg: Double = 152.0

  public override var maxDmg: Double = 284.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 18
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9344, "Increase Spell Dam 15", this)
        )}

}
