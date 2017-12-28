package es.ual.vsuarez.isros.dolibar;

import java.io.IOException;
import java.io.InputStream;
import java.rmi.RemoteException;
import java.util.Properties;

import org.dolibarr.www.ns.Authentication;
import org.dolibarr.www.ns.Filterthirdparty;
import org.dolibarr.www.ns.ThirdPartiesArray2;
import org.dolibarr.www.ns.Thirdparty;
import org.dolibarr.www.ns.WebServicesDolibarrThirdParty;
import org.dolibarr.www.ns.WebServicesDolibarrThirdPartyLocator;
import org.dolibarr.www.ns.WebServicesDolibarrThirdPartyPortType;
import org.dolibarr.www.ns.holders.ResultHolder;
import org.dolibarr.www.ns.holders.ThirdPartiesArray2Holder;

public class DolibarConnector {

	Authentication autentication;
	
	WebServicesDolibarrThirdPartyLocator locator;
	WebServicesDolibarrThirdPartyPortType service;
	
	Properties properties;
	
	public DolibarConnector(){
		properties= loadDolibarProperties();
		locator = new WebServicesDolibarrThirdPartyLocator();
		try{
		service=locator.getWebServicesDolibarrThirdPartyPort();
		}catch(Exception e){
			e.printStackTrace();
		}
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
	public Thirdparty[] listClients() throws RemoteException{
		Filterthirdparty filter= new Filterthirdparty();
		filter.setClient("");
		filter.setSupplier("");
		filter.setCategory("");
		ResultHolder rholder = new ResultHolder();
		ThirdPartiesArray2Holder tpa2h = new ThirdPartiesArray2Holder();
		tpa2h.value = new ThirdPartiesArray2();
		service.getListOfThirdParties(autentication, filter, rholder, tpa2h);
		return tpa2h.value.getThirdparty();
	}
}
