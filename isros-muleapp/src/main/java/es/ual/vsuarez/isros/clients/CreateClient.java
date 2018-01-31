package es.ual.vsuarez.isros.clients;

import es.ual.vsuarez.isros.common.IsrosTask;
import es.ual.vsuarez.isros.common.Response;
/**
 * CreateCliente: Tarea asociada a crear un cliente
 * @author victor suarez
 * @version 1.0.0.
 */
import es.ual.vsuarez.isros.sugar.SugarConector;

/**
 * Tarea asocianda a crear un cliente
 * @author victor
 * @version 1.0.0
 */
public class CreateClient implements IsrosTask {
	SugarConector sugarconector;
	public CreateClient() {
		sugarconector = new SugarConector();
	}
	
	@Override
	public Response doTask(Response response) {
		
		return response;
	}

}
