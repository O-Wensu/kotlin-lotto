package lotto
import camp.nextstep.edu.missionutils.Console

class Buyer {
    fun getPurchaseAmount(){
        println("구입금액을 입력해 주세요.")
        var money = Console.readLine()
        var judgment = Judgment()
        judgment.checkPurchaseAmount(money)
    }
}