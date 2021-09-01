import java.util.*

fun main(){
    var sc = Scanner(System.`in`)
    var left = sc.nextInt()
    var right = sc.nextInt()
    for (i in 1..left){
        for (j in 1..right){
            println("$i.$j")
        }
    }
}