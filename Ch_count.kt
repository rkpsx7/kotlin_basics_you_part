fun main() {
    val array = arrayOf<String>("HTML", "CSS", "JAVA", "JS", "ANDROID")
    var sum = 0;
    for (i in array.indices) {
        sum += array[i].length;
    }
    println(sum)
}