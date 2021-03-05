package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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
public class BrutalGladiatorsFelweaveHandguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 35011

  public override var name: String = "Brutal Gladiator's Felweave Handguards"

  public override var itemLevel: Int = 159

  public override var quality: Int = 4

  public override var icon: String = "inv_gauntlets_49.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(615)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 56,
      intellect = 23,
      spellCritRating = 26.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33063, "Fear Cast Pushback Reduction", this),
        Buffs.byIdOrName(17493, "Increase Spell Dam 44", this)
        )}

}
