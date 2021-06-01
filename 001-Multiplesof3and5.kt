
/** If we list all the natural numbers below 10 that are multiples of 3 or 5,
we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000. **/

fun main(){
    val number = 999
    var result = 0
    var list = mutableListOf<Int>()
    for (i in 0..number){
        if (i % 3 == 0)
            list.add(i)
        if (i % 5 == 0)
            list.add(i)
    }
    list = list.toSet().toMutableList()
    for (i in list)
        result += i
    println(result)
}