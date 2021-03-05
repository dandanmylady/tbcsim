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
public class SummonersBlade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 31002

  public override var name: String = "Summoner's Blade"

  public override var itemLevel: Int = 109

  public override var quality: Int = 3

  public override var icon: String = "inv_sword_04.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 54.91999816894531

  public override var maxDmg: Double = 159.9199981689453

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      stamina = 10,
      intellect = 20,
      spellCritRating = 11.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(36430, "Increase Spell Dam 103", this)
        )}


  public override fun itemSerializersModule() = SerializersModule { polymorphic(Item::class,
      SummonersBlade::class, serializer()) }
}
