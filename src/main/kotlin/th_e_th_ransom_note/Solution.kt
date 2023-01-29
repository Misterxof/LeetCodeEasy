package th_e_th_ransom_note

class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var result = ransomNote
        var builder = magazine.toCharArray()
        
        builder.forEach {char ->
            result = result.replaceFirst(char.toString(),"")
        }

        return result.isBlank()
    }
}