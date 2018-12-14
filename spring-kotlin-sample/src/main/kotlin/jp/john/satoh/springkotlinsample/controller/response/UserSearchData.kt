package jp.john.satoh.springkotlinsample.controller.response

/**
 * ユーザの検索結果を外部に渡す際に利用するclassです
 */
data class UserSearchData(
        val name: String?,
        val mailAddress: String?
) {
    companion object {
        fun createEmpty() = UserSearchData(null, null)
    }
}
