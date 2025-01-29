package e_z_f_Unique_Morse_Code_Words

class UniqueMorseCodeWords {
    val morse = arrayOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    )

    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val set = HashSet<String>()
        val string = StringBuilder()

        for (i in words.indices) {
            string.clear()
            for (j in words[i].indices) {
                string.append(morse[words[i][j] - 'a'])
            }
            set.add(string.toString())
        }

        return set.size
    }
}