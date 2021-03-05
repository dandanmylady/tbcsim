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
public class BattlemaceOfTheHighPriestess : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34790

  public override var name: String = "Battle-mace of the High Priestess"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_mace_34.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 45.310001373291016

  public override var maxDmg: Double = 145.30999755859375

  public override var speed: Double = 2300.0

  public override var stats: Stats = Stats(
      stamina = 9,
      intellect = 13,
      spellHasteRating = 15.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2881)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(35338, "Increase Healing 228", this)
        )}

}
