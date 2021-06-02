/** The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ? **/

fun main() {
    val number = readLine().toString().toLong()
    val list = primeFactorFinder(number)
    println(list)

}

fun primeFactorFinder(high: Long): MutableList<Long> {
    var low = 2L
    var flag:Int
    var control = 1L
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

            if (high % low == 0L){
                list.add(low)
                control *= low
                if (control == high){
                    break
                }
            }
        }
        low++
    }
    return list
}