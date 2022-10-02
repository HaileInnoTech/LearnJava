import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        System.out.println("nhập 2 số nguyên a, b:");

        var a = input.nextInt();
        var b = input.nextInt();

        System.out.println("Nhập lựa chọn:");
        System.out.println("1 Cộng:");
        System.out.println("2 Trừ");
        System.out.println("3 Nhân");
        System.out.println("4 Chia");
        System.out.println("0 Thóat");
        var choice = input.nextInt();
        switch (choice) {
            case 0:
                System.out.println("Thoát");
                break;
            case 1:
                System.out.println("a + b = " + (a + b));
                break;
            case 2:
                System.out.println("a - b = " + (a - b));
                break;
            case 3:
                System.out.println("a * b = " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Mẫu = 0. Lỗi");
                } else {
                    System.out.println("a / b = " + ((double) a / b));

                }
                break;
            default:
                System.out.println("Chức năng ko hợp lệ");
                break;
        }

        int x = 9;
        switch (x) {
//            case 1:
//                System.out.println("Chủ nhật");
//                break;
//            case 2:
//                System.out.println("Thứ 2");
//                break;
//            case 3:
//                System.out.println("Thứ 3");
//                break;
//            case 4:
//                System.out.println("Thứ 4");
//                break;
//            default:
//                System.out.println("Vui lòng nhập đúng");
////                break;
//            case 1:
//            case 3:
//            case 5:
//            case 7:
//                System.out.println("Ngày chẵn");
//                break;
//            case 2:
//            case 4:
//            case 6:
//                System.out.println("Ngày lẻ");
//                break;
//            default:
//                System.out.println("Vui lòng nhập đúng");
//                break;

        }
    }
}
