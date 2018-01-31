package es.ual.isros.pshop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class PrestashopConnector{
	
		Properties properties;
	public PrestashopConnector(){
		properties=loadProperties();
	}
	private Properties loadProperties(){
	Properties p = new Properties();
	try{
		InputStream im = PrestashopConnector.class.getResourceAsStream("/pshop.properties.properties");
		p.load(im);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return p;
	}
}