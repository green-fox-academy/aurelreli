import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int a, b, c, d, e, sum;
        double average;
        Scanner be = new Scanner(System.in);
        a = be.nextInt();
        b = be.nextInt();
        c = be.nextInt();
        d = be.nextInt();
        e = be.nextInt();
        sum = a+b+c+d+e;
        System.out.println(sum);
        average = sum/5;
        System.out.println(average);
    }
}
