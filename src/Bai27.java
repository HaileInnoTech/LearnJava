import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Nhanvien hai = new Nhanvien("sws00129", "Lê Hoàng Hải", "79/74 Cộng Hòa"
                , 21, "0702917344", 2000, 1);
        Banking acc = new Banking();
        var input = new Scanner(System.in);
        System.out.println("Nhập số tài khoản của bạn: ");
        acc.id = input.nextLine();
        System.out.println("Nhập tên tài khoản: ");
        acc.card_holder = input.nextLine();
        System.out.println("Nhập số tiền muốn gửi vào TK: ");
        acc.Deposit(input.nextLong());
        // thực hiện các thanh toán khác:
        System.out.println("Nhập số tiền muốn rút: ");
        var amount = input.nextLong();

        if (acc.Withdraw(amount)) {
            System.out.println("Rút thành công");
            acc.CheckBalance();
        } else {
            System.out.println("Số dư của bạn không đủ thực hiện giao dịch này");
        }
        System.out.println("Bạn có muốn thực hiện giao dịch khác không? ");
        var dec = input.nextLine(); // nhập có/không

    }
}
