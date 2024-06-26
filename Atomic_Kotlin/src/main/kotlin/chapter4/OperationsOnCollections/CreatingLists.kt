package chapter4.OperationsOnCollections

import appendix.atomictest.eq

fun main() {
    val list1 = List(10) { it }
    list1 eq "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]"

    val list2 = List(10) { 0 }
    list2 eq "[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]"

    val list3 = List(10) { 'a' + it }
    list3 eq "[a, b, c, d, e, f, g, h, i, j]"

    val list4 = List(10) { list3[it % 3] }
    list4 eq "[a, b, c, a, b, c, a, b, c, a]"
}