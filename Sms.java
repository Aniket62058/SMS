import java.util.Optional;

public class Sms {

    public static void main(String[] aniket) throws Exception
    {
        Design.printSms();
        while (true) {
            String choice = Utility.mainMenu();
            switch (choice) {
                case "1":
                    StuUtility.searchByRollNo();
                    break;
                case "2":
                    AdminUtility.aminLogIn();
                    break;
                case "3":
                    Design.printBye();
                    System.exit(0);
                default:
                    System.out.println("Wrong choice !!");
            }
        }
    }

}
