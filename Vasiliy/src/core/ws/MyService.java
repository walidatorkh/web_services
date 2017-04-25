package core.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("service1")
public class MyService {
	@Path("sum")
	@GET
	public String sum (@QueryParam("a")int a, @QueryParam("b")int b){
		return String.valueOf(a+b);
	}

}
