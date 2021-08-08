import java.util.ArrayList;
import lib.LottoCalcurlate;

public class App {
    public static int getNumber() {
        int ball = (int) Math.floor(Math.random() * 44) + 1;
        return ball;
    }

    public static ArrayList<Integer> getLotto() {
        ArrayList<Integer> balls = new ArrayList<Integer>();

        int i = 0;
        while (i < 6) {
            int ball = getNumber();
            if (balls.indexOf(ball) == -1) {
                balls.add(ball);
                i++;
            }
        }

        return balls;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> balls = getLotto();
        LottoCalcurlate LottoCalcurlate = new LottoCalcurlate(balls);

        System.out.println(balls);

        int sum = LottoCalcurlate.Lotto_Sum();
        System.out.println(sum);
    }
}
