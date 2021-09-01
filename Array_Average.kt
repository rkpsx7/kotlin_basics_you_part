fun main(){
    var arr = intArrayOf()
    print(average(arr))
}
fun average(array: IntArray): Int {
    var sum = 0
    if (array.isNotEmpty()){
        for (i in array.indices){
            sum += array[i]
        }
    }else
        return 0

    return sum/array.size
}