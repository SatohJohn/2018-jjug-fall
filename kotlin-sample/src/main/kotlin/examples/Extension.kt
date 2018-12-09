package examples

class Account

fun Account?.isExist() = true

fun main(args: Array<String>) {

    val account = if (args.size > 1) Account() else null

    if (account.isExist()) {
        print("存在するアカウントだよ")
    } else {
        print("アカウント")
    }
}
