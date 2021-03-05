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
public class TheMaelstromsFury : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32237

  public override var name: String = "The Maelstrom's Fury"

  public override var itemLevel: Int = 141

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_58.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 19.799999237060547

  public override var maxDmg: Double = 128.8000030517578

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 33,
      intellect = 21,
      spellCritRating = 22.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(42111, "Increase Spell Dam 236", this)
        )}

}
