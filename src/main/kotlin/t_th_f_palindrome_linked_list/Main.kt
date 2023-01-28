package t_th_f_palindrome_linked_list

fun main(args: Array<String>) {
    println("1,2,2,1 ")
    println(Solution().isPalindrome(arrayOf(1,2,2,1)))
    print("1,2,3,1 ")
    println(Solution().isPalindrome(arrayOf(1,2,3,1)))
    print("1,1 ")
    println(Solution().isPalindrome(arrayOf(1,1)))
    print("1 ")
    println(Solution().isPalindrome(arrayOf(1)))
    print("1,2 ")
    println(Solution().isPalindrome(arrayOf(1,2)))
    print("3,3,5,6,5,3,3 ")
    println(Solution().isPalindrome(arrayOf(3,3,5,6,5,3,3)))
    print("3,3,5,6,7,3,3 ")
    println(Solution().isPalindrome(arrayOf(3,3,5,6,7,3,3)))
}