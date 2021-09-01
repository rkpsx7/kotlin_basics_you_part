import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var str = sc.nextLine()
    val hashmap = LinkedHashMap<String, Int>()
    val strArr = str.split(" ".toRegex()).toTypedArray()
    for (ch in strArr) {
        if (hashmap.containsKey(ch)) {
            hashmap[ch] = hashmap[ch]!! + 1
        } else hashmap[ch] = 1
    }
    for ((key, value) in hashmap) {
        if (value == 1) print("$key ")
    }
}