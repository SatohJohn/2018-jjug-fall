fun Account?.isNotMember() = true

fun main(args: Array<String>) {

    val accountService = AccountService()

    val account = accountService.findById()
    // この時点ではAccount!となり、Accountはnullを返す可能性もある型だし、そうでもないし、、、みたいな何なのかわからない状態になる
    if (account.isNotMember()) {
        print("アカウント見つからなかったよ")
    } else {
        print("アカウント見つかったよ")
    }

}