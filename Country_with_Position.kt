import java.util.*

fun main() {
    var countries = mutableListOf<String>()
    var sc = Scanner(System.`in`)

    for (i in 1..10) {
        countries.add(sc.nextLine())
    }

    var find = sc.nextLine()

    for (i in 0 until countries.size) {
        if (countries.contains(find)) {
            print("${countries.get(i)} $i")
            break
        } else {
            print("Not Found")
            break
        }

    }
}