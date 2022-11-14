package lotto

import camp.nextstep.edu.missionutils.Randoms
import camp.nextstep.edu.missionutils.Console

class Seller {
    var judgment = Judgment()

    fun generateLotto(LottoCnt: Int) {
        println("${LottoCnt}개를 구매했습니다.")
        for (cnt in 0 until LottoCnt) {
            var randLotto = Randoms.pickUniqueNumbersInRange(1, 45, LOTTO_SIZE).sorted()
            println(randLotto)
            allRandomRotto.add(randLotto)
        }
    }

    fun getWinningNumber() {
        println("당첨 번호를 입력해 주세요.")
        var winningLottoNumber = Console.readLine()
        winningLottoNumber.split(",").forEach() {
            it.toIntOrNull()?.let { it -> winningNumber.add(it) }
        }
        winningNumber.sort()
        if (judgment.checkWinningNumber(winningNumber)) {
            getBonusNumber()
        }
    }

    fun getBonusNumber() {
        println("보너스 번호를 입력해 주세요.")
        bonusNumber = Console.readLine()
        judgment.checkBonusNumber(bonusNumber, winningNumber)
    }
    companion object {
        var winningNumber = mutableListOf<Int>()
        var bonusNumber = ""
        var allRandomRotto = mutableListOf<List<Int>>()
    }
}

