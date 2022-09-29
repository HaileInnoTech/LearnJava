import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int age;
        float avgGrade = 0.0f;
        long balance;

        String fullname;
        String address;

        final double PI = 3.141592; // hằng số
        final int MAX_VALUE = 500;// hằng số
        String MONDAY = "MONDAY";

        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tuổi của bạn:");
        age = input.nextInt();
        input.nextLine(); // dọc bỏ dòng thừa
        System.out.println("Nhập tên của bạn: ");
        fullname = input.nextLine();

        System.out.println("Số dư là: ");
        balance = input.nextLong();


//        System.out.println("Hello " + fullname);
//        System.out.println("Bạn" + age  + " tuổi");
//        System.out.println("Số dư của bạn là: " + balance + "$");

        System.out.printf("Hello %s!\n", fullname);
        System.out.printf("Tuổi của bạn là %d\n", age);
        System.out.printf("Số dư là %d$\n", balance);
        System.out.printf("Hello %s!\n", MONDAY);


    }
}

