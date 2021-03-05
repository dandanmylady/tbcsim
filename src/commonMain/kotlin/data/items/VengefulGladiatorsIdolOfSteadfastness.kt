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
public class VengefulGladiatorsIdolOfSteadfastness : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33944

  public override var name: String = "Vengeful Gladiator's Idol of Steadfastness"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_relics_idolofhealth.jpg"

  public override var inventorySlot: Int = 28

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.IDOL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(43845, "Vengeful Idol of Steadfastness", this)
        )}

}
