package resttest.first;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import resttesst.appresponse.appresponse;
import resttest.dbdata.dbdata;
import resttest.exception.appexception;
import resttest.models.personall;


@Path("/people")
public class people {

	@Produces(MediaType.APPLICATION_JSON)
	@GET
	@Path("/all")
	public appresponse getall(){
		appresponse resp = new appresponse();
		
		try {
			dbdata dbb = new dbdata();
			List<personall> person = dbb.getall();
		
			resp.setPaylod(person);
		} catch (appexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.setStatus(appresponse.error);
		}
		return resp;
	}
	
	
	@GET
	@Path("/person/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public appresponse getone(@PathParam("id")int pathid){
		appresponse resp = new appresponse();
		
		try {
			dbdata dbb = new dbdata();
			personall person = dbb.getone(pathid);
			
			resp.setPaylod(person);
		} catch (appexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.setStatus(appresponse.error);
		}
		return resp;
	}

	
	@POST
	@Path("/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public appresponse postadd(personall person){
		appresponse resp = new appresponse();
		try {
			dbdata dbb = new dbdata();
			 person = dbb.addone(person);
			
			resp.setPaylod(person);
		} catch (appexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resp.setStatus(appresponse.error);
		}
		return resp;
	}
}
