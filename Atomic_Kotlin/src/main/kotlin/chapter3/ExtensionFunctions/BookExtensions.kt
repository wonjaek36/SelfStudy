package chapter3.ExtensionFunctions

import appendix.atomictest.eq

class Book(val title: String)

fun Book.categorize(category: String) =
    """title: "$title", category: "$category""""

fun main() {
    Book("Dracula").categorize("Vampire") eq
        """title: "Dracula", category: "Vampire""""
}