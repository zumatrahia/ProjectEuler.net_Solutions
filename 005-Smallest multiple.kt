/** 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20? **/

fun main() {
    var count = 20
    var flag = false
    val list = (1..20).toList()
    while (true){
        count++
        if (list.all { count % it == 0 }){
            println(count)
            break
        }
    }
}