import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai13 {
    public static void main(String[] args) {   //vd1 dem so luong chu cai nhap tu ban phim
        var input = new Scanner(System.in);
//        System.out.println("Nhap vao chuoi ki tu");
//        var str = input.nextLine();
//        str = str.toLowerCase();
//        var count = 0; //dem so ki tu la chu cai
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                count++;
//            }
//        }
//        System.out.println("Chuoi: " + str);
//        System.out.println("So chu cai: " + count);
//

        //vd 2 tinh tong 1 >> 1/n, n nhaopp tu ban phim
//        System.out.println("Nhap so nguyen duong n");
//        var n = input.nextInt();
//        if (n > 0) {
//            var sum = 0;
//            for (int i = 1; i <= n; i++) {
//                sum += i;
//
//            }
//            System.out.println("S = "+sum);
//        } else {
//            System.out.println("Nhap n la so nguyen duong ");
//        }


//        System.out.println("Nhap vao chuoi ki tu");
//        var str = input.nextLine();
//        str = str.trim(); // loại bỏ các dấu cách thừa
//        // thay thế các chỗ có 1 hoặc nhiều khoảng trắng bằng 1 dấu cách
//        str = str.replace("\\s+", "");
//        System.out.println("Chuỗi sau chuẩn hóa: " + str);
//        for (int i = 0; i < str.length(); i++) {
//            if (i == 0) { // in ra chữ cái đầu từ đầu tiên
//                System.out.println(str.charAt(i));
//            }
//            if (str.charAt(i) == ' ') { // in ra chữ cái đầu từ tiếp theo
//                System.out.println(str.charAt(i + 1));
        // Tim so nguyen to trong doan tu a < b
        System.out.println("Nhap so a");
        var a = input.nextInt();
        System.out.println("Nap so b");
        var b = input.nextInt();

        for (int i = a; i <= b; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
            }
            System.out.print(isPrime ? i + ", " : "");
        }

    }
}


