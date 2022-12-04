import java.util.*;
import java.io.*;

class Employee{
		
		
		int cust_id;
		String cust_name,email,password,address;
		long contact;
		String nomini_name,relationship;
		
		
		Employee(int cust_id,String cust_name, String email,String password,String address,long contact,String nomini_name,String relationship){
			this.cust_id=cust_id;
			this.cust_name=cust_name;
			this.email=email;
			this.password=password;
			this.address=address;
			this.contact=contact;
			this.nomini_name=nomini_name;
			this.relationship=relationship;	
		}
		
		
		public int get_cust_id() {
			return cust_id;
		}
		public void set_cust_id(int cust_id) {
			this.cust_id = cust_id;
		}
		public String get_cust_name() {
			return cust_name;
		}
		public void set_cust_name(String cust_name) {
			this.cust_name = cust_name;
		}
		public String get_email() {
			return email;
		}
		public void set_email(String email) {
			this.email = email;
		}
		public String get_password() {
			return password;
		}
		public void set_password(String password) {
			this.password= password;
		}
		public String get_address() {
			return address;
		}
		public void set_address(String address) {
			this.address = address;
		}
		public long get_contact() {
			return contact;
		}
		public void set_contact(long contact) {
			this.contact = contact;
		}
		public String get_nomini_name() {
			return nomini_name;
		}
		public void set_nomini_name( String nomini_name) {
			this.nomini_name = nomini_name;
		}
		public String get_relationship() {
			return relationship;
		}
		public void set_relationship(String relationship) {
			this.relationship = relationship;
		}
		
}


public class App{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		List<Employee> empList = new ArrayList<>();
		register(empList);
		
		
		// System.out.println(emp.nomini_name);
		 
	}
	public static void login(List<Employee> empList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("===================================");
		System.out.println("Welcome to Login World");
		System.out.println("Enter Username :");
		String login_name=sc.next();
		System.out.println("Enter Password :");
		String login_password=sc.next();
		for (int i = 0; i< empList.size(); i++) {
			if (empList.get(i).cust_name.equals(login_name) && empList.get(i).password.equals(login_password)) {
				System.out.println("Login successfull");
				break;
			} else {
				System.out.println("Wrong credentials");
				
			}
		}
		
	}
	public static void register(List<Employee> empList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Registration page");
		System.out.println("============================");
		
		ReEnter: {System.out.println("Enter Customer_id");
		 int cust_id=sc.nextInt();
		 //sc.next();
		 System.out.println("Enter Customer_name");
		 String cust_name=sc.next();
		 if(cust_name.length()>50 || cust_name.equals("")) {
			 System.out.println("Invalid Name");
			 break ReEnter;
			 
		 }
		 System.out.println("Enter email");
		 String email=sc.next();
		// System.out.println("Registration successfully");
		 if(!email.matches("^(.+)@(.+)$")) {
			 System.out.println("Invalid Email address"); 
			 break ReEnter;
		 }
		 System.out.println("Enter password");
		 String password=sc.next();
		 if(password.length()>30 || password.equals("")) {
			 System.out.println("Invalid password");
			 break ReEnter;
			 
		 }
		 System.out.println("Enter address");
		 String address=sc.next();
		 if(address.length()>100 || address.equals("")) {
			 System.out.println("Invalid Address");
			 break ReEnter;
			 
		 }
		 
		 long contact=0;
		 try {
			 System.out.println("Enter contact number");
			 contact=sc.nextLong();
			 if(contact<1000000000 || contact > 9999999999L || contact==0) {
				 System.out.println("Invalid contact");
				 break ReEnter;
				 
			 }
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		 System.out.println("Enter nominee");
		 String nomini_name=sc.next();
		 if(nomini_name.length()>50 || nomini_name.equals("")) {
			 System.out.println("Invalid Nominee Name");
			 break ReEnter;
			 
		 }
		 System.out.println("Enter relationship with nominee");
		 String relationship=sc.next();	
		 if(relationship.equals("")) {
			 System.out.println("Mandatory Field ");
			 break ReEnter;
			 
		 }
		 
		 Employee emp=new Employee(cust_id, cust_name, email, password,address,contact, nomini_name, relationship );
		 empList.add(emp);
		
		 
		// for (int i = 0; i < empList.size(); i++) {
			// System.out.println(empList.get(i).cust_name);
		 //}
		 System.out.println("=================================");
		 System.out.println("Customer Registration Details");
		 System.out.println("Customer Id : " + emp.cust_id);
		 System.out.println("Customer Name : " + emp.cust_name);
		 System.out.println("Customer Mail : " + emp.email);
		 System.out.println("Registration successfully");
		 
		 System.out.println("Do you want to proceed to login? Y/N");
		 String login_choice = sc.next();
		 if(login_choice.equals("Y") || login_choice.equals("y")) {
			 login(empList);
		 } else if(login_choice.equals("N") || login_choice.equals("n")) {
			 register(empList);
		 }}
		
	}
	

}




