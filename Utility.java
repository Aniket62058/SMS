
/*public static int inputInt(String message)throws Exception {

            Scanner sc = new Scanner(System.in);
            System.out.println(message);
            int inputData = sc.nextInt();
            return inputData;
        }*/
import java.util.Scanner;

public class Utility {
    public static String inputText(String message)throws Exception
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(message);
        String inputData=sc.nextLine();

        return inputData;
    }




    public static String mainMenu()throws Exception
    {
        System.out.println("\t\t\tPress 1 for Student acess \n\t\t\tPress 2 for Admin acess\n\t\t\t" +
                "Press 3 Exit");
        String  choice=Utility.inputText("Enter Choice : ");
        return choice;
    }

    public static void adminMenu()throws Exception
    {
        String m="\t\t\tpress 1 for list all students \n"+
                "\t\t\tPress 2 for search students by roll no \n"+
                "\t\t\tPress 3 for search students by name \n"+
                "\t\t\tpress 4 for search students by branch \n"+
                "\t\t\tPress 5 for search students by registration number \n"+
                "\t\t\tpress 6 Exit";

        System.out.println("\n\n"+m+"\n");

    }
}

