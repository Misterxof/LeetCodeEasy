package fi_z_z_Keyboard_Row

class KeyboardRow {
    private val firstRow = hashSetOf('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p')
    private val secondRow = hashSetOf('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l')
    private val thirdRow = hashSetOf('z', 'x', 'c', 'v', 'b', 'n', 'm')

    fun findWords(words: Array<String>): Array<String> {
        val result = mutableListOf<String>()
        var currentRow: Int

        words.forEach outer@{
            currentRow = checkRow(it[0].lowercaseChar())
            it.forEach { letter ->
                if (currentRow != checkRow(letter.lowercaseChar()))
                    return@outer
            }
            result.add(it)
        }

        return result.toTypedArray()
    }

    private fun checkRow(letter: Char): Int {
        when {
            firstRow.contains(letter) -> return 1
            secondRow.contains(letter) -> return 2
            thirdRow.contains(letter) -> return 3
        }
        return 0
    }
}

fun main() {
    println(KeyboardRow().findWords(arrayOf("Hello", "Alaska", "Dad", "Peace")).joinToString())
}