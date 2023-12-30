package chapter2.Maps

import appendix.atomictest.eq
import appendix.atomictest.capture

fun main() {
    val map = mapOf('a' to "attempt")
    map['b'] eq null
    capture {
        map.getValue('b')
    } eq "NoSuchElementException: Key b is missing in the map."

    map.getOrDefault('a', "??") eq "attempt"
    map.getOrDefault('b', "??") eq "??"
}