import java.util.Scanner;

public class AdminUtility
{
    public static void aminLogIn()throws Exception
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter userId : ");
        String userId = sc.nextLine();
        boolean flag=false;
        for (String s:Data.user)
        {
            if(s.equals(userId))
            {
                System.out.println("Enter Password");
                String password=sc.nextLine();
                for (String p:Data.password)
                {
                    if(p.equals(password))
                    {
                        System.out.println("\t\tSucessfully loged in !!!");
                        flag = true;
                        AdminUtility.adminActivity();
                    }
                }
            }
        }
        if (flag==false)
        {
            System.out.println("UserId or Password does not match !!");
        }
    }


    public static void adminActivity() throws Exception
    {
        while (true) {
            Utility.adminMenu();
            String choice = Utility.inputText("Enter choice : ");
            switch (choice) {
                case "1":
                    StuUtility.stuList();
                    break;
                case "2":
                    StuUtility.searchByRollNo();
                    break;
                case "3":
                    StuUtility.searchByName();
                    break;
                case "4":
                    StuUtility.searchByBranch();
                    break;
                case "5":
                    StuUtility.searchByRegistrationNo();
                    break;
                case "6":
                    break;
                default:
                    System.out.println("Wrong choice !!");
                    Utility.adminMenu();
            }
            if(choice.equals("6"))
            {
                break;
            }
        }
    }
}
