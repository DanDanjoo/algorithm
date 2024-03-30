fun main() {
    val sol = Solution()
    println(sol.solution(40))  // 출력: 1983
    println(sol.solution(23))  // 출력: 2000
}

class Solution{
fun solution(age: Int): Int{  // solution 함수는 선생님의 출생 연도를 계산하는 함수, age 매개변수는 함수가 받는 입력 값으로 선생님의 나이를 뜻함
    val amuamu = 2022 // 현재 연도 2022년으로 설정
    val mumumu = amuamu - age + 1 // 출생 연도 계산
    return mumumu // 출생 연도 반환
}
}