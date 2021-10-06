package build;
import java.util.*;
class lnt{

	public static void data_entry(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter personal details");
		String name,gender,aadhaar,pan,password;int age;
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter gender");
		gender=sc.nextLine();	
		System.out.println("Enter aadhaar");
		aadhaar=sc.nextLine();	
		System.out.println("Enter pan");
		pan=sc.nextLine();	
		System.out.println("Enter age");
		age=sc.nextInt();	
		System.out.println("Enter password");
		password=sc.nextLine();	

		System.out.println("Are you Landlord");
		boolean is_landlord=sc.nextBoolean();

		if(is_landlord==true){
			System.out.println("enter rent you want to keep");
			int rent=sc.nextInt();
			System.out.println("enter number of rooms");
			int rooms=sc.nextInt();
			System.out.println("are you open for negotiations with the tenants");
			boolean bool=sc.nextBoolean();
			System.out.println("is your house available for renting");
			boolean empty=sc.nextBoolean();
			System.out.println("Enter location of your house");
			String location=sc.nextLine();
			System.out.println("Would you like to add some additional Description");
			String description=sc.nextLine();
			Landlord l=new Landlord(name,gender,aadhaar,pan,age,rent,bool,empty,location,description,password);
		}
		else{
			System.out.println("Rooms looking for");
			int rooms=sc.nextInt();
			System.out.println("Rent Willing to Pay");
			int cost=sc.nextInt();
			System.out.println("Enter family members");
			int fm=sc.nextInt();
			System.out.println("Add additional description");
			String desc=sc.nextLine();
			System.out.println("Add your Occupation");
			String occupation=sc.nextLine();
			Tenant t=new Tenant(name,gender,aadhaar,pan,age,rooms,cost,fm,desc,occupation,password);
		}
	}

	
	public static void  main(String[]args){

			//write main function for data creation 
		




		

	}
}
