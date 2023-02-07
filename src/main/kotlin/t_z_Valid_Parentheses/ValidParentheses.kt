package t_z_Valid_Parentheses

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val deque: ArrayDeque<Char> = ArrayDeque()

        s.forEach {
            if (it == '{' || it == '(' || it == '[') {
                deque.addFirst(it)
                return@forEach
            }

            if (deque.isNotEmpty()) {
                if ((it == '}' && deque.first() == '{') || (it == ')' && deque.first() == '(') || (it == ']' && deque.first() == '['))
                    deque.removeFirst()
                else return false
            } else {
                return false
            }
        }

        return deque.isEmpty()
    }
}

fun main() {
    println(ValidParentheses().isValid("()"))
    println(ValidParentheses().isValid("()[]{}"))
    println(ValidParentheses().isValid("(])"))
}