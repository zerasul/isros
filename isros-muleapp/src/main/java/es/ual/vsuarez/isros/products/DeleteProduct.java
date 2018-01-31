package es.ual.vsuarez.isros.products;

import es.ual.isros.pshop.PrestashopConnector;
import es.ual.vsuarez.dolibar.DolibarConnector;
import es.ual.vsuarez.isros.common.IsrosTask;
import es.ual.vsuarez.isros.common.Response;
/**
 * Tarea asociada a borrar un producto.
 * @author victor suarez
 * @version 1.0.0
 */
public class DeleteProduct implements IsrosTask {

	DolibarConnector dolibarConector;
	PrestashopConnector prestashopconector;
	public DeleteProduct() {
		dolibarConector= new DolibarConnector();
		prestashopconector= new PrestashopConnector();
	}
	
	@Override
	public Response doTask(Response response) {
		// TODO Auto-generated method stub
		return null;
	}

}
