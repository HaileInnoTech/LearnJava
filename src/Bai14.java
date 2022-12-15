import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
//        System.out.println("Nhap vao so nhuyen duong n");
//        var n = input.nextInt();
//        // vd 1 kiem tra n co phai so dep hay ko
//        // kirm tra
//        var m = n;
//        var rev = 0;
//        while (m > 0) {
//            rev = rev * 10 + m % 10;
//            m /= 10;
//
//        }
//        if (n == rev) {
//            System.out.println("n la so dep");
//        } else {
//            System.out.println("n ko phai la so dep");
//        }
        // vd 2
        // choise cho tinh toan
//        System.out.println("Nhap vao 2 so thuc a va b");
//        var a = input.nextDouble();
//        var b = input.nextDouble();
//        var choice = 0;
//
//        do {
//            System.out.println("chon chuc nang:");
//            System.out.println("1. Sum 2 so");
//            System.out.println("2. Sub 2 so");
//            System.out.println("3. Mul 2 so");
//            System.out.println("4. Div 2 so");
//            System.out.println("0. Thoat chuong trinh");
//            choice = input.nextInt();
//
//            switch (choice) {
//                case 0:
//                    System.out.println("Cam on va hen gap lai");
//                    break;
//                case 1:
//                    var sum = a + b;
//                    System.out.println(a + " + " + b + " = " + sum);
//                    break;
//                case 2:
//                    var sub = a - b;
//                    System.out.println(a + " - " + b + " = " + sub);
//                    break;
//                case 3:
//                    var mul = a * b;
//                    System.out.println(a + " * " + b + " = " + mul);
//                    break;
//                case 4:
//                    var div = a / b;
//                    System.out.println(a + " / " + b + " = " + div);
//                    break;
//                default:
//                    System.out.println("Sai chuc nang vui long nhap lai");
//                    break;
//            }
//            System.out.println("============================================");
//        }
//        while (choice != 0);
        var choice = 0 ;
        do {
            System.out.println("Nhap thang: ");

            System.out.println("0. Thoat chuong trinh");
            choice = input.nextInt();
            var zodiac = "";
            switch (choice) {
                case 0:
                    System.out.println("Cam on va hen gap lai");
                    break;
                case 1:
                    zodiac = "Ti";

                    break;
                case 2:
                    zodiac = "Suu";
                    break;
                case 3:
                    zodiac = "Dan";
                    break;
                case 4:
                    zodiac = "Mau";
                    break;
                default:
                    System.out.println("Sai chuc nang vui long nhap lai");
                    break;
            }
            System.out.println("============================================");
            if(!zodiac.isEmpty()){
                System.out.println("Thang "+ choice + " la "+ zodiac );
            }
        }
        while (choice != 0);
    }
}
