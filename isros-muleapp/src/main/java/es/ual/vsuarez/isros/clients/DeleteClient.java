package es.ual.vsuarez.isros.clients;

import es.ual.isros.pshop.PrestashopConnector;
import es.ual.vsuarez.dolibar.DolibarConnector;
import es.ual.vsuarez.isros.common.IsrosTask;
import es.ual.vsuarez.isros.common.Response;

public class DeleteClient implements IsrosTask {

	DolibarConnector dolibarconector;
	PrestashopConnector prestashopconector;
	public DeleteClient() {
		dolibarconector= new DolibarConnector();
		prestashopconector= new PrestashopConnector();
	}
	@Override
	public Response doTask(Response response) {
		
		return null;
	}

}
