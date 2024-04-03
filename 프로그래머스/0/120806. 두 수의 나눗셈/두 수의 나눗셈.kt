fun main() {
    val sol = Solution()

    val num1 = 3
    val num2 = 2
    val result1 = sol.solution(num1, num2)

    val num3 = 7
    val num4 = 3
    val result2 = sol.solution(num3, num4)

    val num5 = 1
    val num6 = 16
    val result3 = sol.solution(num5, num6)

    println("result1: $result1")
    println("result2: $result2")
    println("result3: $result3")
}

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        return ((num1.toDouble() / num2) * 1000).toInt() 
    }
}