package StructuralPatterns.Composite;

public class CompositePattern {
	public static void main(String[] args) {
		   
	      Employee CEO = new Employee("Shivani","CEO", 80000);

	      Employee CTO = new Employee("Shreya","CTO", 70000);

	      Employee CIO = new Employee("Sunidhi","CIO", 20000);

	      Employee clerk1 = new Employee("Latha","Marketing", 10000);
	      Employee clerk2 = new Employee("Usha","Marketing", 10000);

	      Employee salesExecutive1 = new Employee("Vani","Sales", 10000);
	      Employee salesExecutive2 = new Employee("Durga","Sales", 10000);

	      CEO.add(CTO);
	      CEO.add(CIO);

	      CTO.add(salesExecutive1);
	      CTO.add(salesExecutive2);

	      CIO.add(clerk1);
	      CIO.add(clerk2);

	      //print all employees of the organization
	      System.out.println(CEO); 
	      
	      for (Employee headEmployee : CEO.getSubordinates()) {
	         System.out.println(headEmployee);
	         
	         for (Employee employee : headEmployee.getSubordinates()) {
	            System.out.println(employee);
	         }
	      }		
	   }

}
