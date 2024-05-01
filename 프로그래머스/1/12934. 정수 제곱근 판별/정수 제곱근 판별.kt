import kotlin.math.* 
class Solution {
    fun solution(n: Long): Long {
        val amu = sqrt(n.toDouble()).toLong()
        return if (amu * amu == n) (amu + 1)*(amu + 1) else -1
    }
}
