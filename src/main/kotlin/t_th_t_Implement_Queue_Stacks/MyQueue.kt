package t_th_t_Implement_Queue_Stacks

import java.util.Stack

class MyQueue() {
    val pushStack = Stack<Int>()
    val popStack = Stack<Int>()

    fun push(x: Int) {
        pushStack.push(x)
    }

    fun pop(): Int {
        peek()
        return popStack.pop()
    }

    fun peek(): Int {
        if (popStack.isEmpty()) {
            while (pushStack.isNotEmpty())
                popStack.push(pushStack.pop())
        }
        return popStack.peek()
    }

    fun empty(): Boolean {
        return pushStack.isEmpty() && popStack.isEmpty()
    }

}