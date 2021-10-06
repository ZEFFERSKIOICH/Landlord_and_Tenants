package build;
class Tenant extends Person{
	public int rooms,money,family_members;
	public String description,occupation;

	Tenant(String name,String gender,String aadhaar,String pan,int age,int r,int m,int f,String description,String occupation,String password){
		super(name,gender,aadhaar,pan,password,age);
		this.rooms=r;
		this.money=m;
		this.family_members=f;
		this.description=description;
		this.occupation=occupation;
		Admin.register_tenant(this);
	}

	public void filter_by_rooms(int num){
		Admin.filter_rooms(num);
	}

	public void filter_by_cost(int cost){
		Admin.filter_cost(cost);
	}
}


