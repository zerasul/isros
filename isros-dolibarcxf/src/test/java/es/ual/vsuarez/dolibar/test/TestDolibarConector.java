package es.ual.vsuarez.dolibar.test;

import es.ual.vsuarez.dolibar.DolibarConnector;

import java.util.List;

import org.dolibarr.ns.Thirdparty;
import org.junit.Test;

public class TestDolibarConector {

	@Test
	public void testConector(){
		DolibarConnector d = new DolibarConnector();
		
		List<Thirdparty> a =d.getListThirdParty();
		for (Thirdparty th : a) {
			System.out.println(th.getRef());
		}
	}
}
