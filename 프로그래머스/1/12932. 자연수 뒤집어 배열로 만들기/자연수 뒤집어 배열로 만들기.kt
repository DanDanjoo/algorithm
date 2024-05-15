class Solution {
    fun solution(n: Long): IntArray {
        val str = n.toString()
        val result = IntArray(str.length)
        for (i in str.indices) {
            result[i] = str[str.length - 1 - i] - '0'
        }
        return result
    }
}