import java.util.UUID;

public class SBIAccount implements BankAccountInterface{

    private  String name;
    private String AccNo;
    private double balance;

    private String password;

    final double roi=6.5;
    final String IFSC="SBI34543";
    public SBIAccount() {
    }

    public SBIAccount(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.AccNo= String.valueOf(UUID.randomUUID());
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your balance is "+this.balance;
        }
        return "Incorrect Password!!";
    }

    @Override
    public String addMoney(double amount) {
        this.balance+=amount;
        return "Amount Added Successfully";
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals(password)){
            if(this.balance-1000.00>=amount){
                this.balance-=amount;
                return "Amount Debuted Successfully";
            }
            return"Insufficient balance";
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return "Password Changed Successfully";
        }
        return "Incorrect Password";
    }

    @Override
    public double calInterest(int year) {
        return this.balance*roi*year/100.00;
    }

    @Override
    public String toString() {
        return "SBIAccount{" +
                "name='" + name + '\'' +
                ", AccNo='" + AccNo + '\'' +
                ", balance=" + balance +
                ", password='" + password + '\'' +
                ", roi=" + roi +
                ", IFSC='" + IFSC + '\'' +
                '}';
    }
}
