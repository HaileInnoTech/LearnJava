public class Bai11 {
    public static void main(String[] args) {
        int n = 109;
        boolean isDivisiable;
        isDivisiable = (n % 2 == 0) ? true : n%3==0?true:n%5==0?true:false;
        System.out.println(isDivisiable);



    }
}