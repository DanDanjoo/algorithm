fun main() {
    val sol = Solution()

    val N1 = 123
    val result1 = sol.solution(N1)

    val N2 = 987
    val result2 = sol.solution(N2)

    println("$N1: $result1") // 출력: 123: 6
    println("$N2: $result2") // 출력: 987: 24
}

class Solution {
    fun solution(n: Int): Int {
        var number = n
        var sum = 0

        while (number > 0) {
            sum += number % 10 // 현재 자릿수를 더합니다.
            number /= 10 // 다음 자릿수로 넘어갑니다.
        }

        return sum
    }
}