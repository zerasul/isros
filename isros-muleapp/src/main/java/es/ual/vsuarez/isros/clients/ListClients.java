package es.ual.vsuarez.isros.clients;

import java.util.List;

import org.dolibarr.ns.Thirdparty;

import com.google.gson.Gson;

import es.ual.vsuarez.dolibar.DolibarConnector;
import es.ual.vsuarez.isros.common.IsrosTask;
import es.ual.vsuarez.isros.common.Response;


public class ListClients implements IsrosTask {

	DolibarConnector conector;
	public ListClients() {
		conector=new DolibarConnector();
	}
	@Override
	public Response doTask(Response response) {
			
			Gson gson = new Gson();
			List<Thirdparty> th=conector.getListThirdParty();
			response.setResult("OK");
			response.setResponse(gson.toJson(th));
		
		
		return response;
	}

}
