package admin;
import repository.EmployeeDB;
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB edb=new EmployeeDB(5);
		
		Employee e1=EmployeeCreation.Create("GOvardhan",23300.00,1.2);
		Employee e2=EmployeeCreation.Create("Vishwa",2430.00,2.8);
		Employee e3=EmployeeCreation.Create("Ramu",3450.00,1.7);
		Employee e4=EmployeeCreation.Create("Jaga",6530.00,2.0);
		Employee e5=EmployeeCreation.Create("Ravi",26750.00,2.6);
		Employee e6=EmployeeCreation.Create("Ramesh",30000.00,2.6);
		System.out.println(e1.getEmpid());
		System.out.println(e2.getEmpid());
		edb.addEmployee(e1);
		edb.addEmployee(e2);
		edb.addEmployee(e3);
		edb.addEmployee(e4);
		edb.addEmployee(e5);
		edb.addEmployee(e6);
		edb.viewEmployeeRecords();
		Employee e=edb.getEmployee(103);
		System.out.println(e);
		
		
	}

}
