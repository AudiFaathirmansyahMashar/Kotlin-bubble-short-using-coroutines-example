import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        val arr = intArrayOf(5,3,6,9,1,2,4,8,7)
        var temp = 0

        println("Before")
        arr.forEach {
            print("${it} ")
            delay(300)
        }

        for (i in 0..arr.size){
            for (j in 1..i-1){
                if (arr[j-1] > arr[j]){
                    temp = arr[j-1]
                    arr[j-1] = arr[j]
                    arr[j] = temp
                }
            }
        }

        println("\n==========================")
        println("After")
        arr.forEach {
            print("${it} ")
            delay(1000)
        }
    }

    println("Coroutines Example")
}
