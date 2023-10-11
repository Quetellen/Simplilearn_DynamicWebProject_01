package model;

public class Participant {
	private int p_id;
    private String p_name;
    private String phone;
    private String email;
    private Batch b_id;
    
    
    Participant() {
    	super();
    	// TODO Auto-generated constructor stub
    }
      
    
	Participant(int p_id, String p_name, String phone, String email, Batch b_id) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.phone = phone;
		this.email = email;
		this.b_id = b_id;
	}
	
	
	
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Batch getB_id() {
		return b_id;
	}
	public void setB_id(Batch b_id) {
		this.b_id = b_id;
	}
    
	

}
