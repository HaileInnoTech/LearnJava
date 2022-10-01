import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
//        String message = "   hello   "; // kiểu String sẽ tạo ra 1 object
//
//
//        System.out.println(message.charAt(0));//gọi các phương thức trong String
//        System.out.println(message.length());
//        System.out.println(message.trim().toUpperCase());//trim loại bỏ toàn khỏng trắng
//        System.out.println(message.charAt(4));
//        System.out.println(message.replace(" ", "#"));
//        System.out.println(message.replace("", "#"));
//
//
//        String lan = "Lan";
//        String other = "loan";
//        System.out.println(lan.compareTo(other));
//        System.out.println(other.compareTo(lan));
//        System.out.println(lan.compareToIgnoreCase(other));
//
//        String fullname;
        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập họ:");
//        fullname = input.nextLine();
//
//        System.out.println("Nhập tên đệm:");
//        String middle = input.nextLine();
//
//        System.out.println("Nhập tên :");
//        String firstname = input.nextLine();
//
//        System.out.println("Hello " + fullname + " " + middle + " " + firstname);
//        System.out.printf("Hello %s %s %s", fullname, middle, firstname);

//        String mesg;
//        System.out.println("Nhập chuỗi:");
//        mesg = input.nextLine();
//        System.out.println(mesg.length());
//        System.out.println(mesg.toUpperCase());
////        System.out.println(mesg.replace(" ","*"));
//
//        String str1;
//        String str2;
//        System.out.println("Nhập chuỗi 1:");
//        str1 = input.nextLine();
//
//        System.out.println("Nhập chuỗi 2:");
//        str2 = input.nextLine();
//
//        System.out.println(str1.indexOf(str2));
//        System.out.println(str1.lastIndexOf(str2));
//        System.out.println(str1.replace(" "," "));
//
//        String result = str1.trim(); // loại bỏ space từ dầu 2 phía
//        result = result.replaceAll("\\s+"," "); // thay thế khoảng trắng trong chuỗi string
//        System.out.println(result);

        String fullname;
        System.out.println("Nhập Họ và tên:");
        fullname = input.nextLine();

        int firstSpaceIndex = fullname.indexOf(" ");
        int lastSpaceIndex = fullname.lastIndexOf(" ");

        String lastName = fullname.substring(0, firstSpaceIndex);
        String middleName = fullname.substring(firstSpaceIndex+1, lastSpaceIndex);
        String firstname = fullname.substring(lastSpaceIndex + 1);

        System.out.println("Họ: " + lastName);
        System.out.println("Dệm: " + middleName);
        System.out.println("Tên: " + firstname);
    }
}
