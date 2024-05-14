class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return Array(arr1.size) { one ->
            IntArray(arr1[0].size) { two ->
                arr1[one][two] + arr2[one][two]
            }
        }
    }
}