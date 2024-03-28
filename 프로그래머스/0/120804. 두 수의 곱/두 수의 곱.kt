fun main() {
    val sol = Solution()

    val num1 = 3
    val num2 = 4
    val result1 = sol.solution(num1, num2)

    val num3 = 27
    val num4 = 19
    val result2 = sol.solution(num3, num4)

    println("Result 1: $result1")
    println("Result 2: $result2")
}

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        return num1 * num2
    }
}