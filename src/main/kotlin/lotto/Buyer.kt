package lotto

import camp.nextstep.edu.missionutils.Console

class Buyer {
    var judgment = Judgment()

    fun getPurchaseAmount() {
        println("구입금액을 입력해 주세요.")
        var money = Console.readLine()

        if (judgment.checkPurchaseAmount(money)) {
            println("구매 개수 : ${judgment.getPurchaseNumber(money)}")
        }
    }
}