fun main (){
    val sol = Solution()

    val n1 = 12
    val result1 = sol.solution(n1)

    val n2 = 5
    val result2 = sol.solution(n2)

    println("$n1:$result1")
    println("$n2:$result2")

}

class Solution {
    fun solution(n: Int): Int {
        var sum = 0
        for (i in 1..n) {
            if (n % i == 0) {  
                sum += i
            }
        }

        return sum
    }
}