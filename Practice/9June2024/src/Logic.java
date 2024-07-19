import java.util.Scanner;

public class Logic {
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer();
		customer1.firstName = "Abhay";
		customer1.lastName = "Rajawat";
		customer1.age = 21;
		customer1.salary = 15000;
		customer1.isMarried = false;
		customer1.aadharCardNumber = 23456;
		customer1.panCardNumber = "XYZ789";
		
		Logic obj1 = new Logic();
		obj1.openTheAccountRequirement(customer1);
		
		
		Scanner sc = new Scanner(System.in);
		
		
		Customer customer2 = new Customer();
		
		System.out.println("Enter your first name : ");
		customer2.firstName = sc.next();
		
		System.out.println("Enter your last name : ");
		customer2.lastName = sc.next();
		
		System.out.println("Enter your age : ");
		customer2.age = sc.nextInt();
		
		System.out.println("Enter your salary : ");
		customer2.salary = sc.nextLong();
		
		customer2.isMarried = true;
		
		System.out.println("Enter your Aadhar card number : ");
		customer2.aadharCardNumber = sc.nextLong();
		
		customer2.panCardNumber = "XYZ789";
		
		obj1.openTheAccountRequirement(customer2);
		
		
	}
	
	
	AccountOpenInformation openTheAccountRequirement(Customer customer1) {
		
		if(customer1.age>18) {
			System.out.println("Yes you are eligible to open account as you are adult");
		}
		
		if(customer1.salary>10000){
            System.out.println("You can open account as you have a valid salary");
        }
		
		if(customer1.isMarried == true){
            System.out.println("You are married");
        } else {
            System.out.println("You are unmarried");
        }
		
		if(customer1.aadharCardNumber == 12345){
            System.out.println("Conditon 1 is true");
        } else if(customer1.aadharCardNumber == 23456){
            System.out.println("Condition 2 is true");
        } else if(customer1.aadharCardNumber == 34567){
            System.out.println("Conditon 3 is true");
        } else{                                   
            System.out.println("None of the condition is true");
        }
		
		if(customer1.panCardNumber == "ABC123"){
            System.out.println("Conditon 1 is true");
        } else if(customer1.panCardNumber == "PQR456"){
            System.out.println("Condition 2 is true");
        } else if(customer1.panCardNumber == "XYZ789"){
            System.out.println("Conditon 3 is true");
        }
		
		System.out.println("Hi " + customer1.firstName + " " + customer1.lastName + " we are happy to see you use my code");
		
		return new AccountOpenInformation();
	}
}
