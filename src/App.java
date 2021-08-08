import java.util.ArrayList;

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
        System.out.println(balls);
    }
}
