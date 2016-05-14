package org.vijay.javabrains;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("messages")
public class StudentserviceImpl {

	Studentservice ss = new Studentservice();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getAll() {
		return ss.getAllStudent();
	}

}
