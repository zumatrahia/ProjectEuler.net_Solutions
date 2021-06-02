/**The sum of the squares of the first ten natural numbers is,385
The square of the sum of the first ten natural numbers is,3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 2640
Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.**/

fun main() {
    val list = (1..100).toList()
    var sumOfTheSquares = 0
    var squareOfTheSum = 0
    for (i in list) {
        sumOfTheSquares += i * i
    }
    for (i in list) {
        squareOfTheSum += i
    }
    squareOfTheSum *= squareOfTheSum
    println(squareOfTheSum - sumOfTheSquares)
}