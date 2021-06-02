/** A palindromic number reads the same both ways.
The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.**/

fun main(){
    palindromeControl()
}

fun palindromeControl(){
    var control : Int
    var list = mutableListOf<Int>()
    for (i in 999 downTo 1){
        for (j in 999 downTo 1){
            control = i * j
            if (control == control.toString().reversed().toInt()){
                list.add(control)
            }
        }
    }
    println(list.sortedDescending())
}