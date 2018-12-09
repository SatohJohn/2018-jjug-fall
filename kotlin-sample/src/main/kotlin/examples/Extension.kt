package examples

class Account

fun Account?.isExist() = this != null

fun main(args: Array<String>) {

    val account: Account? = if (args.isNotEmpty()) Account() else null

    if (account.isExist()) {
        print("存在するアカウントだよ")
    } else {
        print("存在しないアカウントだよ")
    }
}
