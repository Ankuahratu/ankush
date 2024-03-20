public class Customer {
    String name;
    int balance, pin, bankcode;
    boolean pancard;
    long phnumber;

    Customer(String n, int bal, int b, int p, boolean pc, long ph) {
        this.name = n;
        this.balance = bal;
        this.bankcode = b;
        this.pancard = pc;
        this.phnumber = ph;
        this.setpin(p);
    }
//set pin
    void setpin(int p) {
        if (p >= 1000 && p <= 9999) {
            this.pin = p;
        } else {
            System.out.println("PIN must be 4 digits");
        }
    }
//    updatephonenumber
    void updatePhoneNumber(long newPhoneNumber) {
        long oldPhoneNumber = this.phnumber;
        this.phnumber = newPhoneNumber;
        System.out.println("Phone number updated from " + oldPhoneNumber + " to " + newPhoneNumber);
    }
//withdraw
    void withdraw(int PIN, int amount) {
        if (this.pin == PIN) {
            if (amount <= this.balance) {
                if (this.pancard && amount <= 50000) {
                    this.balance =  this.balance-amount;
                    System.out.println(amount + " has been withdrawn");
                } else {
                    System.out.println("Link PAN card");
                }
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }
//deposite
    void deposit(int PIN, int amount) {
        if (this.pin == PIN) {
            if (this.pancard || amount <= 100000) {
                this.balance =    this.balance+amount;
                System.out.println(amount + " deposited successfully");
            } else {
                System.out.println("Link PAN card");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }
//    checkbalance

    void checkBalance(int PIN) {
        if (this.pin == PIN) {
            System.out.println("Current balance: " + this.balance);
            if ((this.bankcode == 2 || this.bankcode == 3) && this.balance < 10000) {
                System.out.println("Low minimum balance");
                System.out.println((10000 - this.balance) + " must be deposited");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }
   

    public static void main(String[] args) {
        Customer C1 = new Customer("ankush", 77112, 3, 1122, true, 9988776655L);
        C1.deposit(1122,30000);
        C1.checkBalance(1122);
        C1.updatePhoneNumber(44556677889l);
    }


		
		
	

	}

