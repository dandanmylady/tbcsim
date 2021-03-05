package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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
public class HauberkOfTheWarBringer : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34799

  public override var name: String = "Hauberk of the War Bringer"

  public override var itemLevel: Int = 110

  public override var quality: Int = 4

  public override var icon: String = "inv_chest_chain_17.jpg"

  public override var inventorySlot: Int = 5

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 24,
      stamina = 25,
      intellect = 17,
      physicalHasteRating = 20.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2936)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15824, "Attack Power 76", this)
        )}

}
