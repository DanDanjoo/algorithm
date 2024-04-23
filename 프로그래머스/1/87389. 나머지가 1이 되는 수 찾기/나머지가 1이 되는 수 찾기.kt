fun main() {
    val sol = Solution()

    val n1 = 10
    val result1 = sol.solution(n1)

    val n2 = 12
    val result2 = sol.solution(n2)

    println("$n1: $result1")
    println("$n2: $result2")
}

class Solution {
    fun solution(n: Int): Int {
        var x = 1
        while (true) {
            if (n % x == 1) {
                return x
            }
            x++
        }
    }
}