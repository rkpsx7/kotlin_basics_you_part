import java.util.*

fun main(){
    var sc = Scanner(System.`in`)
    val string = sc.next()
    var reverse = ""
    for (i in string.length - 1 downTo 0) reverse += string[i]
    println(reverse)

}