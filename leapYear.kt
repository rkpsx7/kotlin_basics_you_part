import java.util.*

fun main() {
    var sc = Scanner(System.`in`)
    var year = sc.nextInt();

    var isTrue = false
    if (year%400==0)
        isTrue = true
    else if (year%100==0)
        isTrue = false
    else if(year%4==0)
        isTrue = true

    if (isTrue)
        print("Leap Year")
    else
        print("Not a leap year")

}