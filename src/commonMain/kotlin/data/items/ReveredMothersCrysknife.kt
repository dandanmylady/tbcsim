package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport
import kotlinx.serialization.Serializable
import kotlinx.serialization.modules.SerializersModule

@JsExport
@Serializable
public class ReveredMothersCrysknife : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31758

  public override var name: String = "Revered Mother's Crysknife"

  public override var itemLevel: Int = 94

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_shortblade_12.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 44.08000183105469

  public override var maxDmg: Double = 92.08000183105469

  public override var speed: Double = 1400.0

  public override var stats: Stats = Stats(
      intellect = 9,
      spellCritRating = 19.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14798, "Increase Spell Dam 30", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      ReveredMothersCrysknife::class, serializer()) }
}
