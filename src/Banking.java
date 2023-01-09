public class Banking {
    public String id, card_holder, card_type, bank_name, expired_date, valid_date;
    public long balance;

    public Banking(String id, String card_holder) {
        this.id = id;
        this.card_holder = card_holder;
    }

    public Banking() {
        this.id = "";
        this.card_holder = "";
        this.card_type = "";
        this.balance = 0;
        this.bank_name = "";
        this.expired_date = "";
        this.valid_date = "";
    }

    public boolean Deposit(long amount) {
        System.out.println(card_holder + "gửi" + amount + "$");
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean Withdraw(long amount) {
        System.out.println(card_holder + "rút" + amount + "$");

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(id + "có" + balance + "$");

            return true;

        }
        return false;
    }

    public boolean Transfer(long amount, Banking other) {
        System.out.println(card_holder + " gửi " + amount + " $ cho " + id);

        if (amount < 0 && amount <= balance) {
            balance -= amount;
            other.balance += amount;
            System.out.println("thành Công");
            System.out.println(id + "có" + balance + "$");
            return true;
        }
        return false;
    }

    public void CheckBalance() {
        System.out.println(id + "có" + balance + "$");

    }

}

