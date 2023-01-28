package th_e_th_ransom_note


fun main(args: Array<String>) {
    println("ransomNote = \"a\", magazine = \"b\"  ${Solution().canConstruct("a", "b")}")
    println("ransomNote = \"aa\", magazine = \"ab\"  ${Solution().canConstruct("aa", "ab")}")
    println("ransomNote = \"aa\", magazine = \"aab\"  ${Solution().canConstruct("aa", "aab")}")
}