import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

//        var level = "";
//        var amout = 0;
//
//        System.out.println("Nhập điểm trung bình: ");
//        var avg = input.nextDouble();
//        if (avg >= 3.6) {
//            level = "Cuất Sắc";
//            amout = 10_000_000;
//        } else if (avg >= 3.2) {
//            level = "Giỏi";
//            amout = 5_000_000;
//
//        } else if (avg >= 3.0) {
//            level = "Khá";
//            amout = 1_000_000;
//        } else {
//            System.out.println("Không được học bổng");
//        }
//        System.out.println("Loại học bổng: " + level);
//        System.out.println("Tiền thưởng : " + amout + " VND");
//

        System.out.println("Nhập x:");
        var x = input.nextInt();
        System.out.println("Nhập y:");
        var y = input.nextInt();
        input.nextLine();
        System.out.println("Nhập z:");
        var z = input.nextInt();
        input.nextLine();


        if(x < 0 || y< 0|| z<0){
            System.out.println("INVALID INpUT");
        }else {
            System.out.println((double) ((x+y)*z/2));
//
//        var sosanh = "";


//        if(x%2 == 0){
//            System.out.println("Chẵn");
//        }else {
//            System.out.println("Lẻ");
//        }

//        if (x > y) {
//            sosanh = ">";
//        } else if (x < y) {
//            sosanh = "<";
//
//        } else {
//            sosanh = "=";
//        }
//        System.out.println(x + " " + sosanh + " " + y);

//    }
//        System.out.println("Nhập string 1: ");
//        var str1 = input.nextLine();
//
//        var dau = str1.charAt(0);
//        System.out.println(dau);
//        var cuoi = str1.charAt((str1.length()-1));
//        System.out.println(cuoi);
//        if (dau == cuoi) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");


//        if (str1.startsWith(" ")){
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//
//        }


//        System.out.println("Nhập string 2: ");
//        var str2 = input.nextLine();
//
//
////        if (str1.matches("^[a-zA-Z\\s]+$")) {
////            System.out.println("Hợp lệ");
////        } else {
////            System.out.println("Ko hợp lệ");
////        }
//        var result = str1.compareTo(str2);
//        var sosanh = "";
//        System.out.println(result);
//        if (result > 1) {
//            sosanh = " dứng trước ";
//
//        } else if (result == 0) {
//            sosanh = " tương dương ";
//        } else {
//            sosanh = " dung sau ";
//        }
//
//
//        System.out.println(str1 + sosanh + str2);

//        if (x + y <= z || x + z <= y || y + z <= x) {
//            System.out.println("no");
//        } else {
//            System.out.println("yes");
//
//        }
        }
    }
}
