package es.ual.isros.pshop;

import java.util.Date;

public class Sale{
	private String ref;
	private Date date;
	private Client client;
	private SaleProduct[] saleproduct;
	
	public String getRef(){
		return this.ref;
	}
	
	public void setRef(String ref){
		this.ref=ref;
	}
	
	public Date getDate(){
		return this.date;
	}
	
	public void setDate(Date date){
		this.date=date;
	}
	
	public Client getClient(){
		return this.client;
	}
	
	public void setClient(Client client){
		this.client=client;
	}
	
	public SaleProduct[] getSalesProduct(){
		return this.saleproduct;
	}
	
	public void setSalesProduct(SaleProduct[] saleproduct){
		this.saleproduct=saleproduct;
	}
}