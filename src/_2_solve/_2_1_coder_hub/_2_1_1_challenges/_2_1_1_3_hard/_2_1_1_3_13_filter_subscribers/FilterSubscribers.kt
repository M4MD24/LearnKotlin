package _2_solve._2_1_coder_hub._2_1_1_challenges._2_1_1_3_hard._2_1_1_3_13_filter_subscribers

fun main() {
    println(
        filterSubscribers(
            mutableListOf("user@gmail.com", "admin@company.com", "info@yahoo.com", "user@gmail.com", "support@company.com", "sales@business.org"),
            mutableListOf("gmail.com", "yahoo.com")
        )
    )
    println(
        filterSubscribers(
            mutableListOf("info@domain.com", "info@domain.com", "sales@business.com"),
            mutableListOf()
        )
    )
    println(
        filterSubscribers(
            mutableListOf("tester@Gmail.com", "tester@gmail.com", "dev@yahoo.com", "user@mySite.org"),
            mutableListOf("gmail.com", "yahoo.com")
        )
    )
    print(
        filterSubscribers(
            mutableListOf("admin@company.com", "admin@Company.com", "admin@company.com"),
            mutableListOf("outlook.com")
        )
    )
}

private fun filterSubscribers(
    emails: MutableList<String>,
    excludedEmailDomains: MutableList<String>
): MutableList<String> {
    val targetEmails = mutableListOf<String>()
    for (currentEmail in emails) {
        var isContained = true
        val currentEmailDomain = getEmailDomain(currentEmail)
        for (currentExcludedEmailDomain in excludedEmailDomains) {
            if (
                currentEmailDomain.equals(
                    currentExcludedEmailDomain,
                    true
                )
            ) {
                isContained = false
                break
            }
        }
        if (isContained)
            targetEmails.add(currentEmail)
    }
    return targetEmails
        .distinctBy { it.lowercase() }
        .toMutableList()
}

private fun getEmailDomain(email: String) = email.substringAfter('@')