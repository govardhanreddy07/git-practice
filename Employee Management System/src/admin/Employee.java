package admin;

public class Employee {
	private final int empid;
	private String empname;
	private double sal;
	private double exp;
	
	public Employee(int empid, String empname, double sal, double exp) {
		this.empid = empid;
		this.empname = empname;
		this.sal = sal;
		this.exp = exp;
	}
	public int getEmpid() {
		return empid;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", sal=" + sal + ", exp=" + exp + "]";
	}
	

}
