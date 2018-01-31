package es.ual.vsuarez.isros.sugar;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SugarConector {

	Properties properties;
	public SugarConector() {
		properties= loadProperties();
	}
	
	private Properties loadProperties(){
	Properties p = new Properties();
	try{
		InputStream im = SugarConector.class.getResourceAsStream("/sugar.properties");
		p.load(im);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return p;
	}
	
	public Boolean deleteClient(String ref){
		
		return Boolean.TRUE;
	}
	
	public void createClient(String ref, String name, String nif, String phone, String email){
		
	}
	
	public List  listClients(){
		return new ArrayList();
	}
}
