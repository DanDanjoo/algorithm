fun main (){
    val sol = Solution()
    val arr1 = intArrayOf(1, 2, 3, 4)
    val arr2 = intArrayOf(5, 5)

    println(sol.solution(arr1))
    println(sol.solution(arr2))

}

class Solution {
    fun solution(arr: IntArray): Double {
        val sum = arr.sum()
        return sum.toDouble() / arr.size


    }
    }