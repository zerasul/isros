package es.ual.vsuarez.isros.common;

import org.mule.api.annotations.param.Payload;

public interface IsrosTask {

	public Response doTask(@Payload Response response);
}
