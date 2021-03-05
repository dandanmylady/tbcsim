package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
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
public class BrutalGladiatorsChainHelm : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34992

  public override var name: String = "Brutal Gladiator's Chain Helm"

  public override var itemLevel: Int = 159

  public override var quality: Int = 4

  public override var icon: String = "inv_helmet128.jpg"

  public override var inventorySlot: Int = 1

  public override var itemSet: ItemSet? = ItemSets.byId(586)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 37,
      stamina = 67,
      intellect = 27,
      physicalCritRating = 30.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.META),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2878)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15818, "Attack Power 66", this),
        Buffs.byIdOrName(39927, "Armor Penetration 84", this)
        )}

}
