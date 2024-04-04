fun main() {
    val sol = Solution()

    val angle1 = 70
    val result1 = sol.solution(angle1)


    val angle2 = 91
    val result2 = sol.solution(angle2)

    val angle3 = 180
    val result3 = sol.solution(angle3)


    println("$angle1:$result1")
    println("$angle2:$result2")
    println("$angle3:$result3")
}

class Solution {
    fun solution(angle: Int): Int {
      return when {
          angle in 1 until 90 -> 1
          angle in 91 until 180 -> 3
          angle == 180 -> 4
          else -> 2

      }
    }
}
