package es.ual.vsuarez.dolibar;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Properties;

import org.dolibarr.ns.Authentication;
import org.dolibarr.ns.Filterthirdparty;
import org.dolibarr.ns.GetListOfThirdPartiesRequestType;
import org.dolibarr.ns.GetListOfThirdPartiesResponseType;
import org.dolibarr.ns.ThirdPartiesArray;
import org.dolibarr.ns.Thirdparty;
import org.dolibarr.ns.WebServicesDolibarrThirdParty;
import org.dolibarr.ns.WebServicesDolibarrThirdPartyPortType;



public class DolibarConnector {
	
	Authentication autentication;
	Properties properties;
	
	public DolibarConnector() {
		properties=loadDolibarProperties();
		autentication = new Authentication();
		autentication.setDolibarrkey(properties.getProperty("dolibar-key"));
		autentication.setLogin(properties.getProperty("dolibar-login"));
		autentication.setPassword(properties.getProperty("dolibar-passwd"));
		autentication.setSourceapplication("");
		autentication.setEntity("");
		
	}
	
	private Properties loadDolibarProperties(){
		Properties p = new Properties();
		try{
			InputStream im = DolibarConnector.class.getResourceAsStream("/dolibar.properties");
			p.load(im);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
		
	}
	
	public List<Thirdparty> getListThirdParty(){
		URL url=null;
		try {
			url = new URL("http://localhost:8888/dolibarr/htdocs/webservices/server_thirdparty.php?wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebServicesDolibarrThirdParty service = new WebServicesDolibarrThirdParty(url);
		
		WebServicesDolibarrThirdPartyPortType porttype = service.getWebServicesDolibarrThirdPartyPort();
		GetListOfThirdPartiesRequestType requesttype = new GetListOfThirdPartiesRequestType();
		Filterthirdparty th= new Filterthirdparty();
		th.setCategory("");
		th.setClient("");
		th.setSupplier("");
		requesttype.setAuthentication(autentication);
		requesttype.setFilterthirdparty(th);
		
		GetListOfThirdPartiesResponseType reponse=porttype.getListOfThirdParties(requesttype);
		return reponse.getThirdparties().getThirdparty();
	}
}
