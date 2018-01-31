package es.ual.isros.pshop;

public class Product{
	private String ref;
	private String name;
	private float prize;
	private String description;
	
	public Product(){
		
	}
	
	public String getRef(){
		return this.ref;
	}
	
	public void setRef(String ref){
		this.ref=ref;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public float getPrize(){
		return this.prize;
	}
	
	public void setPrize(float prize){
		this.prize=prize;
	}
	
	public String getDescription(){
		return this.description;
	}
	
	public void setDescription(String description){
		this.description=description;
	}
}