package es.ual.isros.pshop;


public class SaleProduct{
	private Product product;
	private Integer count;
	
	public Product getProduct(){
		return this.product;
	}
	
	public void setProduct(Product product){
		this.product=product;
	}
	
	public Integer getCount(){
		return this.count;
	}
	
	public void setCount(Integer count){
		this.count=count;
	}
}