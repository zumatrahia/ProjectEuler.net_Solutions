/** By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number? **/

fun main(){
    primeCheck(	9223372036854775807, 10001)

}

fun primeCheck(high: Long,breakPoint: Int){
    var low = 2L
    var flag:Int
    var breakControl = 0
    var list = mutableListOf<Long>()
    while (low < high) {
        flag = 0

        for (i in 2L..low / 2L) {
            if (low % i == 0L) {
                flag = 1
                break
            }
        }

        if (flag == 0) {
            breakControl++
            list.add(low)
            if (breakPoint == breakControl )
                break
        }
        low++
    }
    println(list[list.lastIndex])
}