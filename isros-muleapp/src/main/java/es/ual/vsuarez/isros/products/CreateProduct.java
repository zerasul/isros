package es.ual.vsuarez.isros.products;

import es.ual.isros.pshop.PrestashopConnector;
import es.ual.vsuarez.dolibar.DolibarConnector;
import es.ual.vsuarez.isros.common.IsrosTask;
import es.ual.vsuarez.isros.common.Request;
import es.ual.vsuarez.isros.common.Response;
/**
 * Tarea Asociada a crear un producto
 * @author victor suarez
 * @version 1.0.0
 */
public class CreateProduct implements IsrosTask {

	DolibarConnector dolibarconector;
	PrestashopConnector pshopconector;
	
	public CreateProduct() {
		dolibarconector=new DolibarConnector();
		pshopconector= new PrestashopConnector();
	}
	@Override
	public Response doTask(Response response) {
		Request req = response.getRequest();
		String ref=(String) req.getParameters().get("ref");
		String name = (String) req.getParameters().get("name");
		Float price = (Float) req.getParameters().get("price");
		String description=(String) req.getParameters().get("description");
		pshopconector.createProduct(ref,name,price,description);
		dolibarconector.createProduct(ref,name,price,description);
		return response;
	}

}
