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
public class CosmicInfuser : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30317

  public override var name: String = "Cosmic Infuser"

  public override var itemLevel: Int = 175

  public override var quality: Int = 5

  public override var icon: String = "inv_mace_48.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 14.15999984741211

  public override var maxDmg: Double = 220.16000366210938

  public override var speed: Double = 2800.0

  public override var stats: Stats = Stats(
      stamina = 40,
      intellect = 40,
      spirit = 40
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36411, "Increased Mana Regen", this),
        Buffs.byIdOrName(36387, "Increase Healing 600", this),
        Buffs.byIdOrName(36488, "Infernal Protection", this)
        )}

}
