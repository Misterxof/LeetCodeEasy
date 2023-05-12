package t_n_t_Nim_Game

class NimGame {
    fun canWinNim(n: Int): Boolean {
        return n % 4 != 0
    }
}