fun main () {
    val sol = Solution()

    val num1 = 3
    val result1 = sol.solution(num1)

    val num2 = 4
    val result2 = sol.solution(num2)

    println("$num1:$result1")
    println("$num2:$result2")
}

class Solution {

    fun solution(num: Int) = if (num % 2 == 0) "Even" else "Odd"



}