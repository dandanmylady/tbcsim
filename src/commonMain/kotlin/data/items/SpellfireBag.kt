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
public class SpellfireBag : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 21858

  public override var name: String = "Spellfire Bag"

  public override var itemLevel: Int = 95

  public override var quality: Int = 3

  public override var icon: String = "inv_misc_bag_26_spellfire.jpg"

  public override var inventorySlot: Int = 18

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.CONTAINER

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.ENCHANTING_BAG

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
