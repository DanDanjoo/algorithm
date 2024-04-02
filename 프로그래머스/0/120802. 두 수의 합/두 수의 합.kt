fun main(){
    val sol = Solution()

    val num1 = 2
    val num2 = 3
    val result1 = sol.solution(num1,num2)

    val num3 = 100
    val num4 = 2
    val result2 = sol.solution(num3,num4)

    println("result1:$result1")
    println("result2:$result2")


}

class Solution {
    fun solution(num1: Int, num2: Int): Int {
        return num1 + num2

    }
}