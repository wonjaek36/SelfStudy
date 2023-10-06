package chapter2.Constructors

class MutableNameAlien(var name: String)

class FixedNameAlien(val name: String)

fun main() {
    val alien1 = MutableNameAlien("Reverse Giraffe")
    val alien2 = FixedNameAlien("Krombopolis Michael")
    alien1.name = "Parasite"
    // alien2.name = "Parasite"  // Val cannot be reassigned
}
