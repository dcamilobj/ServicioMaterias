/**
 * 
 */
package co.edu.udea.pi.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Duban Camilo Bedoya(dcamilo.bedoya@udea.edu.co)
 *
 */
@XmlRootElement
public class Estudiante {

	//Atributos
	private String identificacion;
	private String correoInstitucional; 
	private List<Materia> materias;
	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}
	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	/**
	 * @return the correoInstitucional
	 */
	public String getCorreoInstitucional() {
		return correoInstitucional;
	}
	/**
	 * @param correoInstitucional the correoInstitucional to set
	 */
	public void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = correoInstitucional;
	}
	/**
	 * @return the materias
	 */
	public List<Materia> getMaterias() {
		return materias;
	}
	/**
	 * @param materias the materias to set
	 */
	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	} 
	
	public void agregarMaterias()
	{
		List<Integer>ingresados = new ArrayList<>();
		List<Materia> materias = new ArrayList<>();
		List<String> nombres = new ArrayList<>();
		nombres.add("Ingeniería Web");
		nombres.add("Fundamentos de sistemas");
		nombres.add("Laboratorio de física");
		nombres.add("Comunicaciones II");
		nombres.add("Geometría Euclidiana");
		nombres.add("Calidad de software");
		nombres.add("Gestión de proyectos");
		nombres.add("Lógica 1");
		nombres.add("Lógica 2");
		nombres.add("Lógica 3");
		List<String> horarios = new ArrayList<>();
		horarios.add("MJ12-14");
		horarios.add("M14-16 V10-12");
		horarios.add("MJ16-18");
		horarios.add("W8-14");
		horarios.add("WV14-16");
		horarios.add("S8-12");
		horarios.add("MJ6-8");
		horarios.add("WV8-10");
		horarios.add("MJ10-12");
		horarios.add("WV6-8");
		List<String> aulas = new ArrayList<>();
		aulas.add("18-210");
		aulas.add("19-212");
		aulas.add("6-228");
		aulas.add("18-325");
		aulas.add("10-106");
		aulas.add("19-220");
		aulas.add("19-304");
		aulas.add("20-204");
		aulas.add("19-307");
		aulas.add("19-307");
		List<String>niveles = new ArrayList<>();
		niveles.add("8");
		niveles.add("6");
		niveles.add("7");
		niveles.add("6");
		niveles.add("1");
		niveles.add("7");
		niveles.add("8");
		niveles.add("1");
		niveles.add("2");
		niveles.add("3");
		for(int i=0;i<5;i++)
		{
			Materia mat = new Materia();
			int random = 1 + (int)(Math.random() * 9); 
			for(int j=0;j<ingresados.size();j++)
			{
				if(random == ingresados.get(j))
				{
					random = 1 + (int)(Math.random() * 9); 
					j=0;
				}
			}
			ingresados.add(random);
			mat.setCodigo(Integer.toString(random));
			mat.setNombre(nombres.get(random));
			mat.setHorario(horarios.get(random));
			mat.setAula(aulas.get(random));
			mat.setNivel(niveles.get(random));
			materias.add(mat);		
		}
		this.setCorreoInstitucional("dcamilo.bedoya@udea.edu.co");
		this.setIdentificacion("01203");
		this.setMaterias(materias);
	}
	
}
