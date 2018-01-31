package es.ual.isros.pshop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.List;
import java.util.ArrayList;



public class PrestashopConnector{
	
		Properties properties;
	public PrestashopConnector(){
		properties=loadProperties();
	}
	private Properties loadProperties(){
	Properties p = new Properties();
	try{
		InputStream im = PrestashopConnector.class.getResourceAsStream("/pshop.properties");
		p.load(im);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return p;
	}
	
	public List<Product> listProducts(){
		return new ArrayList<Product>();
	}
	
	public Product createProduct(String ref, String name, float prize, String description){
		Product p = new Product();
		return p;
	}
}