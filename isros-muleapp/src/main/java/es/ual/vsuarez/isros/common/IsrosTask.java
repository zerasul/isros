package es.ual.vsuarez.isros.common;

import org.mule.api.annotations.param.Payload;
/**
 * Interfaz que define un método que realizara una tarea al ser asignado como tarea java en Mule.
 * @author victor suarez
 * @version 1.0.0.
 */
public interface IsrosTask {

	/**
	 * Realiza la tarea relacionada
	 * @param response respuesta de la peticion(debe ser el payload).
	 * @return respuesta tras realizar la operacion.
	 */
	public Response doTask(@Payload Response response);
}
