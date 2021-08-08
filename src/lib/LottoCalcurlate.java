package lib;

import java.util.ArrayList;

public class LottoCalcurlate {
    ArrayList<Integer> balls;

    public LottoCalcurlate(ArrayList<Integer> numbers) {
        this.balls = numbers;
    }

    public int Lotto_Sum() {
        int sum = 0;
        for (int i = 0; i < balls.size(); i++) {
            sum = sum + balls.get(i);
        }
        return sum;
    }
}
