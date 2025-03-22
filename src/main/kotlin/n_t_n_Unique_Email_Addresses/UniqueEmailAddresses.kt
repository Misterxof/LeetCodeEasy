package n_t_n_Unique_Email_Addresses

class UniqueEmailAddresses {
    fun numUniqueEmails(emails: Array<String>): Int {
        val set = HashSet<String>()

        emails.forEach {
            val parts = it.split("@")
            val name = parts[0].split("+")[0].replace(".","")
            val domain = parts[1].split(".com")[0]
            set.add("$name@$domain")
        }

        return set.size
    }
}