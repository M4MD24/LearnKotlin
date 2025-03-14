package _2_solve._2_2_codeforces._2_2_1_assiut_sheet._2_2_1_11_sheet_8._2_2_1_11_m_the_new_year_meeting_friends

fun main() {
    val (
        firstFriendPosition,
        secondFriendPosition,
        thirdFriendPosition
    ) = readln()
        .split(' ')
        .map { it.toByte() }
        .sorted()
    print(
        getMinimumTotalDistanceFriendsNeedToTravelInOrderToMeetTogether(
            thirdFriendPosition,
            secondFriendPosition,
            firstFriendPosition
        )
    )
}

private fun getMinimumTotalDistanceFriendsNeedToTravelInOrderToMeetTogether(
    thirdFriendPosition: Byte,
    secondFriendPosition: Byte,
    firstFriendPosition: Byte
) = (thirdFriendPosition - secondFriendPosition) + (secondFriendPosition - firstFriendPosition)

// >
/*
fun main() {
    val (
        firstFriend,
        secondFriend,
        thirdFriend
    ) = readln()
        .split(' ')
        .map { it.toByte() }
        .sorted()
    print(thirdFriend - firstFriend)
}
*/