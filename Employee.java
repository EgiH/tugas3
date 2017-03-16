package tugas;
/**
 *
 * @author WIN7_UL_Sp1
 */
public class Employee {
	private String name;
	private double salary;
	private int NoRek;

	public Employee(String name, double salary, int NoRek) {
		setName(name);
		setSalary(salary);
		setNoRek(NoRek);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNoRek() {
		return this.NoRek;
	}

	public void setNoRek(int NoRek) {
		this.NoRek = NoRek;
	}

	public void getDetails() {
		System.out.println("Nama: " + getName());
		System.out.println("Gaji: " + getSalary());
		System.out.println("NoRek: " + getNoRek());
	}
}

public class Manager {
	private String name;
	private double salary;
	private int NoRek;
	private String department;

	public Manager(String name, double salary, int NoRek, String department) {
		setName(name);
		setSalary(salary);
		setNoRek(NoRek);
		setDepartment(department);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getNoRek() {
		return this.NoRek;
	}

	public void setNoRek(int NoRek) {
		this.NoRek = NoRek;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void getDetails() {
		System.out.println("Nama: " + getName());
		System.out.println("Gaji: " + getSalary());
		System.out.println("NoRek: " + getNoRek());
		System.out.println("Department: " + getDepartment());
	}
}

