fun main(){
    val sol=Solution()

    val num1 = 2
    val num2 = 11
    val result1 = sol.solution(num1, num2)

    val num3 = 11
    val num4 = 11
    val result2 = sol.solution(num3, num4)

    val num5 = 7
    val num6 = 99
    val result3 = sol.solution(num5, num6)


    println("result1:$result1")
    println("result2:$result2")
    println("result3:$result3")
}

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        return if (num1 == num2) {
            1
        } else {
            -1
        }
    }
}