package dhiyan;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/book")
public class Book {

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHello() {
		String hel = "<h1>hello dhiyan</h1>";
		return hel;
	}
}
