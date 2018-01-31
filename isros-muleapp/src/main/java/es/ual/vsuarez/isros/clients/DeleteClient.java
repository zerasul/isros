package es.ual.vsuarez.isros.clients;

import es.ual.isros.pshop.PrestashopConnector;
import es.ual.vsuarez.dolibar.DolibarConnector;
import es.ual.vsuarez.isros.common.IsrosTask;
import es.ual.vsuarez.isros.common.Response;
import es.ual.vsuarez.isros.sugar.SugarConector;
/**
 * Tarea asociada a borrar un cliente
 * @author victor suarez Garcia
 * @version 1.0.0
 */
public class DeleteClient implements IsrosTask {

	DolibarConnector dolibarconector;
	PrestashopConnector prestashopconector;
	SugarConector sugarconector;
	public DeleteClient() {
		dolibarconector= new DolibarConnector();
		prestashopconector= new PrestashopConnector();
		sugarconector= new SugarConector();
	}
	@Override
	public Response doTask(Response response) {
		String ref = (String) response.getRequest().getParameters().get("ref");
		sugarconector.deleteClient(ref);
		response.setResult("OK");
		return response;
	}

}
