import java.util.Scanner;

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
        System.out.println("Nhap so nguyen duong n");
        var n = input.nextInt();
        if (n > 0) {
            var sum = 0.0;
            for (int i = 1; i < n; i++) {
                sum += 1.0 / i;

            }
            System.out.println("S = "+sum);
        } else {
            System.out.println("Nhap65 n la so nguyen duong ");
        }

    }
}
