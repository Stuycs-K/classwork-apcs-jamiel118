import java.util.Random;

public class Driver{

    public static void border(int color) {
        System.out.print(Text.CLEAR_SCREEN + Text.HIDE_CURSOR);
        for (int i = 0; i < 30; i++) {
            Text.color(Text.background(color));
            if (i == 0 || i == 29) {
                Text.go(i+1, 1);
                for (int j = 0; j < 80; j++) {
                System.out.print(".");
                }
            } else {
                Text.go(i+1,1);
                System.out.print(".");
                Text.go(i+1,80);
                System.out.print(".");
            }
        }
    }

    public static int[] random3() {
        int[] result = new int[3];
        Random random = new Random();
        for (int i = 0; i < result.length; i++) {
            int randomNumber = random.nextInt(100);
            result[i] = randomNumber;
        }
        return result;
    }

    public static void printInt() {
        System.out.println(Text.HIDE_CURSOR);
        int[] ary = random3();
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] < 25) {
                Text.color(Text.RED);
            }
            else if (ary[i] > 75) {
                Text.color(Text.GREEN);
            } else {
                Text.color(Text.WHITE);
            }
            Text.go(1,20 * (i+1));
            System.out.print(ary[i]);
        }
    }

    public static void main(String[] args) {
        border(Text.CYAN);
        System.out.println(Text.RESET);
        printInt();
        Text.go(31, 1);
        System.out.println(Text.RESET);
    }
}