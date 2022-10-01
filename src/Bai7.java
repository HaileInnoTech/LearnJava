import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("Nhập tuổi của bạn: ");
        var age = input.nextInt();
        System.out.println(age);
        System.out.println(((Object)age).getClass().getName());

    }
}
