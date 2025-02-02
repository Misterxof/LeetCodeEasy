package ImplementStackQueues

import java.util.*

class ImplementStackQueues {
    val queueFirst: Queue<Int> = ArrayDeque()
    val queueSecond: Queue<Int> = ArrayDeque()

    fun push(x: Int) {
        while (queueFirst.isNotEmpty())
            queueSecond.add(queueFirst.poll())

        queueFirst.add(x)

        while (queueSecond.isNotEmpty())
            queueFirst.add(queueSecond.poll())
    }

    fun pop(): Int {
        return queueFirst.poll()
    }

    fun top(): Int {
        return queueFirst.peek()
    }

    fun empty(): Boolean {
        return queueFirst.isEmpty()
    }
}