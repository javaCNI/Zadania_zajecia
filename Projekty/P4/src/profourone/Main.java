package profourone;

public class Main {

    public static void main(String[] args) {
	    Employee employee1 = new Employee();
        Employee employee2 = new Employee();
	    employee1.setName("Pracownik 1");
	    employee1.setSalary(5000);
	    employee1.getEmpID();
        employee2.setName("Pracownik 2");
        employee2.setSalary(5000);
        System.out.println(employee1.getEmpID()+" || "+employee2.getEmpID());
        System.out.println(new String("PracownikXD").equals(new String("PracownikXD")));

	    Boss boss1 = new Boss();
        Boss boss2 = new Boss();
        boss1.setName("x");
        boss1.setSubordinate(10);
        boss2.setSubordinate(50);
        System.out.println(boss1.getEmpID()+" || "+boss2.getEmpID());
        System.out.println(boss1.getDepID()+" || "+boss2.getDepID());
        System.out.println(boss1.equals(boss2));


    }
}
