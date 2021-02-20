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

public class Nethershard : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29457

  public override var name: String = "Nethershard"

  public override var itemLevel: Int = 94

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 40.9900016784668

  public override var maxDmg: Double = 98.98999786376953

  public override var speed: Double = 1700.0

  public override var stats: Stats = Stats(
      stamina = 15,
      intellect = 18,
      spellCritRating = 6.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(33233, "Increase Spell Dam 61", this)
        )}

}