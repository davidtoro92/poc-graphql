package cl.globallogic.graphql.poc.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

import cl.globallogic.graphql.poc.model.Persona;
import cl.globallogic.graphql.poc.service.PersonaService;

@Component
public class PersonaMutationResolver implements GraphQLMutationResolver {

	@Autowired
	private PersonaService personaSvc;
	
	public Persona registrarPersona(final String nombre, String correo, 
			final String apellidoPaterno, final String apellidoMaterno, final String fechaNacimiento) {
		return personaSvc.registrarPersona(nombre, correo, apellidoPaterno, apellidoMaterno, fechaNacimiento);
	}
	
//	public Persona eliminarPersona(final String correo) {
//		return personaSvc.eliminarPersona(correo);
//	}
}
