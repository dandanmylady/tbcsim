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
public class MercilessGladiatorsSilkRaiment : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32050

  public override var name: String = "Merciless Gladiator's Silk Raiment"

  public override var itemLevel: Int = 136

  public override var quality: Int = 4

  public override var icon: String = "inv_chest_leather_01.jpg"

  public override var inventorySlot: Int = 20

  public override var itemSet: ItemSet? = ItemSets.byId(579)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 57,
      intellect = 21,
      spellCritRating = 30.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2951)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14055, "Increase Spell Dam 35", this)
        )}

}
