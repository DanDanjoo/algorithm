class Solution {
    fun solution(numbers: IntArray): Int {
        var answer = 0
        val allNumbers = (0..9).toSet()
        val inputNumbers = numbers.toSet()
        val notExistNumbers = allNumbers - inputNumbers

        for (number in notExistNumbers) {
            answer += number
        }
        return answer
    }
}
