import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {

        //vd ve hinh chu nhat dac
        var input = new Scanner(System.in);
//        System.out.println("Nhap vao kich thuoc hinh chu nhat: ");
//        var m = input.nextInt();
//        var n = input.nextInt();
//
//        if (m > 0 && n > 0) {
//            for (int i = 1; i <= m; i++) {
//                for (int j = 1; j <= n; j++) {
//                    System.out.print(" * ");
//
//                }
//                System.out.println();
//
//            }
//
//        }

//        System.out.println("Nhap vao kich thuoc hinh chu nhat: ");
//        var m = input.nextInt();
//        var n = input.nextInt();
//
//        if (m > 0 && n > 0) {
//            for (int i = 1; i <= m; i++) {
//                for (int j = 1; j <= n; j++) {
//                    if (i == 1 || j == 1 || i == m || j == n) {
//                        System.out.print(" * ");
//                    } else {
//                        System.out.print("   ");
//                    }
//                }
//                System.out.println();
//
//            }
//        } else {
//            System.out.println("Sai kich thuoc");
//        }


        System.out.println("Nhap chieu cao tam giac ");
        var h = input.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j < 2 * h; j++) {
                if (j < h - i + 1 || j > h + i - 1) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();



    }}}
