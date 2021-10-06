package build;
import java.util.HashMap;

class Admin{
	 private  static HashMap<Integer,Landlord> registered_landlords=new HashMap<>();
	private static HashMap<Integer,Tenant> homeless_tenants=new HashMap<>();
	
	private Admin(){}  //constructor can be called only from within this class 
	public static void register_landlord(Landlord l){
		int first=System.identityHashCode(l);
		if(registered_landlords.get(first)!=null){
			System.out.println(":andlord is already registered.Please Recheck!!");
			return;
		}
		registered_landlords.put(first,l);
		System.out.println("Landlord Registered");
	}

	public static void register_tenant(Tenant t){
		int first=System.identityHashCode(t);
		if(homeless_tenants.get(first)!=null) {
			System.out.println("Tenant already registered.Please Recheck!!");
			return;
		}
		homeless_tenants.put(first,t);
		System.out.println("Tenant registered");
	}

	public static void show_landlord_list(){
		System.out.println("List of Registered Landlords\n");
		for(Integer it:registered_landlords.keySet()){
			registered_landlords.get(it).show_basic_details();
		}
	}

	public static void show_homeless_tenant_list(){
		System.out.println("List of Homeless Tenants\n");
		for(Integer it:homeless_tenants.keySet()){
			homeless_tenants.get(it).show_basic_details();
		}
	}	

	public static void filter_rooms(int num){
		for(Integer it:registered_landlords.keySet()){
			Landlord l=registered_landlords.get(it);
			if(l.rooms==num){
				l.show_basic_details();
				System.out.println("===========");
			}
		}
	}

	public static void filter_cost(int cost){
		for(Integer it:registered_landlords.keySet()){
			Landlord l=registered_landlords.get(it);
			if(l.money==cost){
				l.show_basic_details();
				System.out.println("===========");
			}
		}
	}

		
			


		


	//can have remove tenants data or landlords data (if ill behaving metric) assigned by the admin




}

	
