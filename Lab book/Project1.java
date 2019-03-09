import java.util.*;
class Employee
{
	String empno;
	String empname;
	String designcode;
	String dept;
	int basic;
	int hra;
	int it;
	public Employee(String empno,String empname,String designcode,String dept,int basic,int hra,int it)
	{
		this.empno=empno;
		this.empname=empname;
		this.designcode=designcode;
		this.dept=dept;
		this.basic=basic;
		this.hra=hra;
		this.it=it;
	}
	

	public static void main(String arg[])
	{
		int flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Id of Employee : ");
		String id= s.next();
		Employee emp[]=new Employee[7];
		emp[0] = new Employee("1001","Ashish","e","R&D",20000,8000,3000);
		emp[1] = new Employee("1002","Sushma","c","PM",20000,8000,3000);
		emp[2] = new Employee("1003","Rahul","k","Acct",20000,8000,3000);
		emp[3] = new Employee("1004","Chahat","r","Front desk",20000,8000,3000);
		emp[4] = new Employee("1005","Ranjan","m","Engg",20000,8000,3000);
		emp[5] = new Employee("1006","Suman","e","Manufacturing",20000,8000,3000);
		emp[6] = new Employee("1007","Tanmay","c","PM",20000,8000,3000);
		for(Employee e:emp)
		{
			if(e.empno.equals(id))
			{
				flag=1;
				System.out.println("Employee Details : ");
				System.out.println("Employee number : "+e.empno);
				System.out.println("Employee name : "+e.empname);
				System.out.println("Employee design code : "+e.designcode);
				System.out.println("Employee department : "+e.dept);
				System.out.println("Employee basic salary : "+e.basic);
				System.out.println("Employee hra : "+e.hra);
				System.out.println("Employee IT : "+e.it);
			}
			
		}
		if(flag==0)
		{
				System.out.println("invalid");
			}
	}
}