public class StuUtility {
    public static void stuList()throws Exception
    {
        System.out.println("+---------------------------------------------------------------------------------------+");
        System.out.printf("|%-12s |%-25s |%-10s |%-10s\n","ROLL NO","STUDENT NAME","BRANCH","REGISTRATION NUMBER");
        System.out.println("+---------------------------------------------------------------------------------------+");
        for (Student s:Data.list)
        {
            System.out.println("+--------------------------------------------------------------------+");
            System.out.printf("|%-12s |%-25s |%-10s |%-10s\n",s.rollNo,s.name,s.branch,s.registrationNo);
            System.out.println("+--------------------------------------------------------------------+");
            try
            {
                long p=Long.parseLong(s.registrationNo);
                if(p%5==0)
                {
                System.out.println("Press enter to continue !!");
                    System.in.read();
                }
            }
            catch(Exception e)
            {

            }
        }
    }

    public static void searchByRegistrationNo()throws Exception
    {
        String registrationNo=Utility.inputText( "Enter your Registration Number :   (Ex: 18105117001)");
        boolean flag=false;
        for (Student s:Data.list)
        {
            if(s.registrationNo.equals(registrationNo))
            {
                flag=true;
                s.showDetails();
            }
        }
        if(flag==false)
        {
            System.out.println("No match found !! ");
        }
    }

    public static void searchByRollNo()throws Exception
    {
        String rollNumber=Utility.inputText( "Enter your Roll No :   (Ex : 2018-CSE-01) ");
        boolean flag=false;
        rollNumber=rollNumber.toUpperCase();
        for (Student s:Data.list)
        {
            if(s.rollNo.equals(rollNumber))
            {
                flag=true;
                s.showDetails();
            }
        }
        if(flag==false)
        {
            System.out.println("No match found !! ");
        }
    }

    public static void searchByName()throws Exception
    {
        String name=Utility.inputText("Enter your Name : ");
        name=name.toUpperCase();
        boolean flag=false;
        for (Student s:Data.list)
        {
            if((s.name).startsWith(name))
            {
                flag=true;
                s.showDetails();
            }
        }
        if(flag==false)
        {
            System.out.println("No match found !! ");
        }
    }

    public static void searchByBranch()throws Exception
    {
        String branch=Utility.inputText("Enter your Branch : ");
        branch=branch.toUpperCase();
        boolean flag=false;
        for (Student s:Data.list)
        {
            if(s.branch.equals(branch))
            {
                flag=true;
                s.showDetails();
                try {
                    long p=Long.parseLong(s.registrationNo);
                    if(p%5==0)
                    {
                        System.out.println("Press enter to continue !!");
                        System.in.read();
                    }
                }
                catch (Exception e)
                {
                }

            }
        }
        if(flag==false)
        {
            System.out.println("No match found !! ");
        }
    }
}
