data class Mana(var current: Int, var max: Int) {

    operator fun plus(other: Mana): Mana {
        return Mana(
            current + other.current,
            maxOf(this.max, other.max)
        )
    }

    operator fun inc(): Mana {
        this.current = (this.current + 10).coerceAtMost(this.max)
        return this
    }

    operator fun minus(value: Int): Mana {
        return Mana(
            (this.current - value).coerceAtLeast(0),
            this.max
        )
    }
}

fun main() {
    var mana1 = Mana(50, 100)
    val mana2 = Mana(20, 50)

    println(mana1 + mana2)

    mana1++
    println(mana1)

    println(mana1 - 30)
}
