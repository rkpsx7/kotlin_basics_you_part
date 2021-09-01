fun main() {
    val arr1 = intArrayOf(20, -20, 30, 20, 50)
    repeated(arr1)
    val arr2 = intArrayOf(-2,-1,-2,1,2,33)
    repeated(arr2)
}

fun repeated(arr: IntArray) {
    val list = arrayListOf<Int>()
    for (i in arr) {
        var count =0
        for (j in arr) {
            if (i == j) {
                count++
                if (count > 1) list.add(j)
            }
        }
    }
    if (list.size==0) println("0")
    else{
        println(arr.contentToString())
        for (i in list) print("$i ")
        println()
    }
}