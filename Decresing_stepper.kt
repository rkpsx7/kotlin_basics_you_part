import java.util.*

fun main(){

    var sc = Scanner(System.`in`)
    var start = sc.nextInt()
    var decre = sc.nextInt()

    for (i in start downTo 0 step decre){
        print("$i ")
    }

}