package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee1 =new Employee(); 
		employee1.setName("Jhon");
		employee1.setAge(36);
		employee1.setSex('M');
		employee1.setUsCitizen(false);
		
		System.out.println("Employee name: "+employee1.getName()+"\nAge: "+employee1.getAge()
		+"\tSex: "+employee1.getSex()+"\nUS Citizen: "+employee1.isUsCitizen());
		
		
		
	}

}
