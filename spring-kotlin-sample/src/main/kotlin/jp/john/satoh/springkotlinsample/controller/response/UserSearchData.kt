package jp.john.satoh.springkotlinsample.controller.response

data class UserSearchData(
        val name: String?,
        val mailAddress: String?
) {
    companion object {
        fun createEmpty() = UserSearchData(null, null)
    }
}
