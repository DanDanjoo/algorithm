fun main() {
    val sol = Solution()

    val x1 = 2
    val n1 = 5
    val answer1 = sol.solution(x1, n1)

    val x2 = 4
    val n2 = 3
    val answer2 = sol.solution(x2, n2)

    val x3 = -4
    val n3 = 2
    val answer3 = sol.solution(x3, n3)
    
    println(answer1.joinToString(", "))
    println(answer2.joinToString(", "))
    println(answer3.joinToString(", ")) 
}


class Solution {
    fun solution(x: Int, n: Int): LongArray {
        val result = LongArray(n) 
        var current = x.toLong() 

        for (i in 0 until n) {
            result[i] = current 
            current += x
        }

        return result
    }
}