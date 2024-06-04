class Solution {
     fun solution(s: String) : String {
         var answer = ""

         var answerList = s.toMutableList()
         answerList.sortDescending()

         for( i in answerList.indices){
             answer += answerList[i]
         }
            return  answer
     }
 }