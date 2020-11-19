package cl.globallogic.graphql.poc.resolvers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import cl.globallogic.graphql.poc.model.Persona;
import cl.globallogic.graphql.poc.service.PersonaService;

@Component
public class PersonaQueryResolver implements GraphQLQueryResolver {

	@Autowired
	private PersonaService personaSvc;
	
	public List<Persona> personas(final int cantidad) {
		return personaSvc.personas(cantidad);
	}
	
	public Optional<Persona> persona(final int id) {
		return personaSvc.persona(id);
	}
}
