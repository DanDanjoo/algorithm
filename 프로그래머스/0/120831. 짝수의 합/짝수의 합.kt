fun main() {
    val sol = Solution()

    val n1 = 10
    val result1 = sol.solution(n1)

    val n2 = 4
    val result2 = sol.solution(n2)

    println("$n1:$result1")
    println("$n2:$result2")
}

class Solution {
    fun solution(n: Int): Int = (2..n step 2).sum()
}
