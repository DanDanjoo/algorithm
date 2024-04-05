fun main() {
    val sol = Solution()
    
    val numbers1 = (1..10).toList()
    val result1 = sol.solution(numbers1.toIntArray())

    val numbers2 = (89..99).toList()
    val result2 = sol.solution(numbers2.toIntArray())

    println("$numbers1:$result1")
    println("$numbers2:$result2")
}

class Solution {
    fun solution(numbers: IntArray): Double = numbers.average()
}