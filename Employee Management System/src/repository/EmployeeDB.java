package repository;
import admin.Employee;
public class EmployeeDB {
	
	private Employee[] empdb;
	private int index=0;
	public EmployeeDB(int size) {
		empdb=new Employee[size];
	}
	
	public void addEmployee(Employee e) {
		if(index < empdb.length) {
			empdb[index++]=e;
			System.out.println("Employee added successfully");
			
		}
		else {
			System.out.println("Data is full,unable to add Employee");
		}
	}
	
	public void viewEmployeeRecords() {
		for(Employee e : empdb) {
			if(e!=null) {
				System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getSal()+" "+e.getExp());
			}
		}
	}
	public Employee getEmployee(int id) {
		Employee emp=null;
		for(Employee e:empdb) {
			if(e!=null && e.getEmpid()==id) {
				emp=e;
				System.out.println("Employee found in DB");
				break;
			}
		}
		return emp;
	

}
}
