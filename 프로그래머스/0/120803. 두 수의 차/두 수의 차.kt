fun main() {
    val sol = Solution()
    
    val num1 = 2
    val num2 = 3
    val result1 = sol.solution(num1, num2)
    println("#1 출력 아무무")
    
    val num3 = 100
    val num4 = 2
    val result2 = sol.solution(num3, num4)
    println("#2 출력 아무아무 ")
}


class Solution {
    fun solution(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}
