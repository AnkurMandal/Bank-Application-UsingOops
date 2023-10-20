import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{

    private String name;
    private String accountNo;//unique UUID
    private String password;
    private double balance;
    final double roi=7.1;
    final String IFSCCode="HDFC34543";

    //default constructor
    public HDFCAccount() {
    }

    //parameteriesed constructor
    public HDFCAccount(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo= String.valueOf(UUID.randomUUID());
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your Balance is "+this.balance;

        }
        return "Password is incorrect!!";
    }

    @Override
    public String addMoney(double amount) {
        this.balance+=amount;
        return "Amount Added Successfully, New Balance is "+this.balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals(password)){
            if(this.balance>=amount){
                this.balance-=amount;
                return "Withdraw Money Successfully, New Balance is "+this.balance;
            }
            return "Insufficient Amount";
        }
        return "Incorrect Password!!";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return "Password change successfully";

        }
        return "Incorrect Password!!!";
    }

    @Override
    public double calInterest(int year) {

        return (this.balance*this.roi*year)/100.0;
    }

    @Override
    public String toString() {
        return "HDFCAccount{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", roi=" + roi +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
