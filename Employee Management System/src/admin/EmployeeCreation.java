package admin;

public class EmployeeCreation {
	private static int initid=101;
	static Employee Create(String empname,double sal,double exp) {
		Employee e1=new Employee(initid++,empname,sal,exp);
		return e1;
	}
}
