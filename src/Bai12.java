import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);


//        System.out.println("Nhập chuỗi:");
//        var str = input.nextLine();
//        str = str.toLowerCase();
//        var count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
//                count++;
//            }
//        }
//        System.out.println("CHuổi \"" + str + "\"");
//        System.out.println("Số chữ cái : " + count);


//        var check = true;
//        for (int i = n; i < m; i++) {
//            for (var j = 2; j < m; j++) {
//                if (i % j != 0) {
//                    System.out.print(i + " ");
//                }
//            }
//
//
//        }

        System.out.println("Nhập số n: ");
        var n = input.nextInt();
        String str = Integer.toString(n);
        var check = true;
        for (int i = 0; i < Math.floor(str.length() / 2); i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                check = false;
            }

        }
        if (check == true) {
            System.out.println("so dep");
        }else {
            System.out.println("so xau");
        }
    }
}
//
//        System.out.println("Nhập số m: ");
//        var m = input.nextInt();
//
//        boolean check = true;
//
//        for (int i = n; i <= m; i++) {
//            check = true;
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    check = false;
//                }
//            }
//
//            if (check == true) {
//                System.out.print(i + " ");
//
//            }
//        }
//
//
//    }
////        System.out.println("Nhập str: ");
////        var str = input.nextLine();
////        str = str.trim();
////        for (int i = str.length(); i > 0; i--) {
////            System.out.print(str.charAt(i - 1));
////
////        }
//
//
////        var count = 1;
////
////        for (int i = 0; i <str.length() ; i++) {
////            if (str.charAt(i) == ' '){
////                count +=1;
////            }
////        }
////        System.out.println(count);
//
//
////        var sum = 0;
//
////        for (int i = 0; i <= n ; i++) {
////            sum += i;
////        }
//////        System.out.println("Tổng = "+ sum);
////        System.out.println(str.charAt(0));
////        for (int i = 0; i < str.length() ; i++) {
////            if (str.charAt(i) ==' '){
////                System.out.println(str.charAt(i+1));
////            }
////
////        }
//
//
////        if (n != 0) {
////            var sum = 0f;
////
////            for (int i = 1; i <= n; i++) {
////                sum += 1.0 / i;
////            }
////            System.out.printf("S = %10.2f", sum);
////        } else {
////            System.out.println("Nhập n != 0");
////
////        }
//
//}
