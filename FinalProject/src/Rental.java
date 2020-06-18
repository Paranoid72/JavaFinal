
public class Rental {

	private int res_Code; //kwdikos kratisis
	private String vehicle; //oxhma
	private String customer; //pelaths
	private String branch; //katasthma
	private int pick_Time; //wra paralavis
	private String pick_Date; //hmerominia paralavis
	private String ret_Branch; //katastima epistrofis
	private int ret_Time; //wra epistrofis
	private String ret_Date; //hmerominia epistrofis
	private int total_Cost; //synoliko kostos
	
	// Getters and Setters // 
	
	public int getRes_Code() {
		return res_Code;
	}
	public void setRes_Code(int res_Code) {
		this.res_Code = res_Code;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getPick_Time() {
		return pick_Time;
	}
	public void setPick_Time(int pick_Time) {
		this.pick_Time = pick_Time;
	}
	public String getPick_Date() {
		return pick_Date;
	}
	public void setPick_Date(String pick_Date) {
		this.pick_Date = pick_Date;
	}
	public String getRet_Branch() {
		return ret_Branch;
	}
	public void setRet_Branch(String ret_Branch) {
		this.ret_Branch = ret_Branch;
	}
	public int getRet_Time() {
		return ret_Time;
	}
	public void setRet_Time(int ret_Time) {
		this.ret_Time = ret_Time;
	}
	public String getRet_Date() {
		return ret_Date;
	}
	public void setRet_Date(String ret_Date) {
		this.ret_Date = ret_Date;
	}
	public int getTotal_Cost() {
		return total_Cost;
	}
	public void setTotal_Cost(int total_Cost) {
		this.total_Cost = total_Cost;
	}
	
}
