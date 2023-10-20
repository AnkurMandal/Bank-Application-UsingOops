public class Main {
    public static void main(String[] args) {
        SBIAccount ankurAcc=new SBIAccount("Ankur",100000,"ankur@12");
        System.out.println(ankurAcc);
        System.out.println("\n");

        //Testing fetchBalance
        System.out.println(ankurAcc.fetchBalance("random"));
        System.out.println(ankurAcc.fetchBalance("ankur@12"));
        System.out.println("\n");

        //testing addMoney
        System.out.println(ankurAcc.addMoney(5000.00));
        System.out.println("\n");

        //testing withdrawMoney
        System.out.println(ankurAcc.withdrawMoney(10000000.00,"lakfj"));
        System.out.println(ankurAcc.withdrawMoney(10000000.00,"ankur@12"));
        System.out.println(ankurAcc.withdrawMoney(5000.00,"ankur@12"));
        System.out.println("\n");

        //testing changePwd
        System.out.println(ankurAcc.changePassword("afjkkafj","ajflfa"));
        System.out.println(ankurAcc.changePassword("ankur@12","@nkur12"));
        System.out.println("\n");

        //testing calInterest
        System.out.println(ankurAcc.calInterest(5));
    }
}