/**
 * 
 */
package co.edu.udea.pi.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import co.edu.udea.pi.pojo.Estudiante;

/**
 * @author Duban Camilo Bedoya(dcamilo.bedoya@udea.edu.co)
 */
@Path("mihorario")
public class Horario {

	Estudiante est= new Estudiante();
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String saludo()
	{
		return "Hola PI";
	}
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("info")
	public Estudiante infoUsuario()
	{	
		est.agregarMaterias();
		return est;
	}
}
