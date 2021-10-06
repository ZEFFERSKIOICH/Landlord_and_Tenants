package build;
import java.util.HashMap;
class Landlord extends Person{
	public  String location,description;
	public boolean open_for_negotiation,is_empty;
	public int  money,rooms;
	private HashMap<Integer,Tenant> tenant_list=new HashMap<>();

	
	Landlord(String name,String gender,String aadhaar,String pan,int age,int money,boolean n,boolean ie,String location,String description,String password){
		super(name,gender,aadhaar,pan,password,age);
		this.money=money;
		this.rooms=rooms;
		this.open_for_negotiation=n;
		this.is_empty=ie;
		this.location=location;
		this.description=description;
		Admin.register_landlord(this);
	}

	public void add_tenant(Tenant t){//only Landlord
		if(check_password()==false) return;
		int first=System.identityHashCode(t);
		tenant_list.put(first,t);
	}


	public void remove_tenant(Tenant t){//only landlord
		if(check_password()==false) return;
		int first=System.identityHashCode(t);
		Tenant ret=tenant_list.remove(first);
		Admin.register_tenant(ret);
		if(ret==null){
			System.out.println("No such tenant in the House");
			return;
		}
		else{
			tenant_list.remove(first);
			System.out.println("Tenant");
			ret.show_basic_details();
			System.out.println("has been removed");
		}
	}



	public void show_list(Landlord l){//only landlord
		check_password();
		for(Integer it:tenant_list.keySet()){
			tenant_list.get(it).show_basic_details();
		}
	}

}


