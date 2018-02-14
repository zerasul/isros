package es.ual.vsuarez.isros.products;

import java.util.List;

import com.google.gson.Gson;

import es.ual.isros.pshop.PrestashopConnector;
import es.ual.vsuarez.dolibar.DolibarConnector;
import es.ual.vsuarez.isros.common.IsrosTask;
import es.ual.vsuarez.isros.common.Response;
import org.dolibarr.ns.Product;

/**
 * Tarea asociada a listarProductos
 * @author victor suarez
 * @version 1.0.0
 */
public class ListProducts implements IsrosTask {

	DolibarConnector dolibarConnector;
	PrestashopConnector pshopconnector;
	@Override
	public Response doTask(Response response) {
		// TODO Auto-generated method stub
		Gson gson = new Gson();
		List<Product> products=dolibarConnector.getListProduct();
		response.setResult("OK");
		response.setResponse(gson.toJson(products));
		return response;
	}

}
