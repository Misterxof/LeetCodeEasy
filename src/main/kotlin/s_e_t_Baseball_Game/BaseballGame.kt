package s_e_t_Baseball_Game

import java.util.Stack

class BaseballGame {
    fun calPoints(operations: Array<String>): Int {
        var result = 0
        val stack = ArrayDeque<Int>()

        for (i in operations.indices) {
            when(operations[i]) {
                "+" -> {
                    if (stack.size > 1)
                        stack.addLast(stack.last() + stack[stack.lastIndex - 1])
                }
                "C" -> {
                    stack.removeLast()
                }
                "D" -> {
                    stack.addLast(stack.last() * 2)
                }
                else -> {
                    stack.addLast(operations[i].toInt())
                }
            }
        }

        stack.forEach { result += it }

        return result
    }
}