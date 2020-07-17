import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nev = sc.nextLine();
        System.out.println(nev);
        String cim = sc.nextLine();
        System.out.println(cim);
        int kor = sc.nextInt();
        System.out.println(kor);
    }
}
