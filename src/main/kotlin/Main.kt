fun main() {
    print(lonelyInteger(arrayOf(1, 2, 3, 4, 2, 3, 4, 1, 5)))
}

fun lonelyInteger(a: Array<Int>): Int {
    val map = HashMap<Int, Int>()

    for (i in a.indices) {
        if (map.contains(a[i])) {
            map[a[i]] = map[a[i]]!!.inc()
        } else {
            map[a[i]] = 1
        }
    }

    map.forEach {
        if (it.value == 1)
            return it.key
    }

    return -1
}