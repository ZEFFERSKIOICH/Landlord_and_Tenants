package build;
import java.util.*;
class Person{
	private String name,gender,password;
	private int age;
	private String aadhaar,pan;

	//one time setter method is constructor
	Person(String name,String gender,String aadhaar,String pan,String password,int age){
		this.name=name;
		this.gender=gender;
		this.aadhaar=aadhaar;
		this.pan=pan;
		this.age=age;
		this.password=password;	//hashed();
	}

	//getter methods of basic details
	public void show_basic_details(){
		System.out.println("Name   :"+name);
		System.out.println("Age    :"+age);
		System.out.println("Gender :"+gender);
	}
	
	public boolean  check_password(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter password");
		String chk_pass=sc.nextLine();
		if(chk_pass.equals(this.password)==true){
			System.out.println("Access Granted");
			return true;
		}
		else {
			System.out.println("Access Revoked");
			return false;
		}
	}


	
	public void show_personal_details(){
		//slef + Landlord
	}
}
