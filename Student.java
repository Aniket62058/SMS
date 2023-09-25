public class Student {
    String rollNo;
    String name;
    String branch;
    String registrationNo;
    public Student()
    {

    }

    public Student(String registrationNo,String rollNo,String name,String branch )
    {
        this.rollNo=rollNo;
        this.name=name;
        this.branch=branch;
        this.registrationNo=registrationNo;
    }

    public void showDetails()throws Exception
    {
        System.out.println("+----------------------------------+");
        System.out.println("Roll Number : "+rollNo);
        System.out.println("Name : "+name);
        System.out.println("Branch : "+branch);
        System.out.println("Registration Number : "+registrationNo);
        System.out.println("+----------------------------------+");
    }
}
