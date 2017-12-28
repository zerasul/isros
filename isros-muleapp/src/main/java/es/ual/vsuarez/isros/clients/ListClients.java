package es.ual.vsuarez.isros.clients;

import java.rmi.RemoteException;

import org.dolibarr.www.ns.Thirdparty;

import com.google.gson.Gson;

import es.ual.vsuarez.isros.common.IsrosTask;
import es.ual.vsuarez.isros.common.Response;
import es.ual.vsuarez.isros.dolibar.DolibarConnector;

public class ListClients implements IsrosTask {

	DolibarConnector conector;
	public ListClients() {
		conector=new DolibarConnector();
	}
	@Override
	public Response doTask(Response response) {
		try {
			Gson gson = new Gson();
			Thirdparty[] th=conector.listClients();
			response.setResult("OK");
			response.setResponse(gson.toJson(th));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
	}

}
