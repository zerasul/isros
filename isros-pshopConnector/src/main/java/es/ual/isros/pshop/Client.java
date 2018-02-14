package es.ual.isros.pshop;


public class Client{
	
	private String ref;
	private String nif;
	private String name;
	private String lastname;
	private String email;
	private String phone;
	
	
	public String getRef(){
		return this.ref;
	}
	
	public void setRef(String ref){
		this.ref=ref;
	}
	
	public String getNif(){
		return this.nif;
	}
	
	public void setNif(String nif){
		this.nif=nif;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getLastName(){
		return this.lastname;
	}
	
	public void setLastName(String lastname){
		this.lastname=lastname;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	public void setEmail(String email){
		this.email=email;
	}
	
	public String getPhone(){
		return this.phone;
	}
	
	public void setPhone(String phone){
		this.phone=phone;
	}
}