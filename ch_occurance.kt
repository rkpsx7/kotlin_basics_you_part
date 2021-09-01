import java.util.*
import kotlin.collections.LinkedHashMap

fun main() {
    var sc = Scanner(System.`in`)
    var str = sc.nextLine()
    str = str.replace(" ","")
    val hashmap = LinkedHashMap<Char, Int>()
    val strArr = str.toCharArray()
    for (ch in strArr) {
        if (hashmap.containsKey(ch)) {
            hashmap[ch] = hashmap.getValue(ch)+1
        } else hashmap[ch] = 1
    }
    for ((key, value) in hashmap) {
        println("$key - $value")
    }



}