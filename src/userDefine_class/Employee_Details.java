package userDefine_class;

class Employee1 {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSalary;
	private double grossSalary;

	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	public Employee1(int employeeId, String employeeName, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public void displayDetails() {
		System.out.println("Employee ID: " + employeeId);
		System.out.println("Employee Name: " + employeeName);
		System.out.println("Basic Salary: " + basicSalary);
		System.out.println("HRA: " + hra);
		System.out.println("Medical: " + medical);
		System.out.println("PF: " + pf);
		System.out.println("PT: " + pt);
		System.out.println("Net Salary: " + netSalary);
		System.out.println("Gross Salary: " + grossSalary);
	}

	public void calculateSalary() {
		hra = 0.5 * basicSalary;
		medical = 200;
		pf = 0.12 * basicSalary;
		pt = 200;
		grossSalary = basicSalary + hra + medical;
		netSalary = grossSalary - (pt + pf);
	}
}

public class Employee_Details {
	public static void main(String[] args) {
		Employee1 employee1 = new Employee1(101, "akshay", 50000.0);
		employee1.calculateSalary();
		employee1.displayDetails();
		System.out.println("get the gross salary of the employee  " + employee1.getGrossSalary());
	}
}
