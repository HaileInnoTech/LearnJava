import java.text.DecimalFormat;

public class Bai5 {
    public static void main(String[] args) {
//        float x =(float) 3.14152;
//        int y = (int) x;
//        System.out.println(y);
        int a = 3;
        Integer aObj = a; // tạo object từ lớp bao Integer
        int b = 8;

        int t = aObj;
        double x = (double) a / b;
        System.out.println(aObj);
        System.out.printf("%100.2f",x); //100 tương dương 100 kí tự, 2 là có 2 chữ số phần thập phân

        DecimalFormat format = new DecimalFormat("###.####");
        System.out.println(format.format(x));

    }
}
