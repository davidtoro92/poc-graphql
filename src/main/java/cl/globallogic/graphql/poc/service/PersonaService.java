package cl.globallogic.graphql.poc.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import cl.globallogic.graphql.poc.model.Persona;
import cl.globallogic.graphql.poc.repository.PersonasRepository;

@Service
public class PersonaService {

	private PersonasRepository repo;
	
	public PersonaService(PersonasRepository repo) {
		this.repo = repo;
	}
	
	public Persona registrarPersona(final String nombre, final String correo
			, final String apellidoPaterno, final String apellidoMaterno, final String fechaNacimiento) {
		Optional<String> fecnac = Optional.ofNullable(fechaNacimiento);
		return repo.save(Persona.builder()
				.nombre(nombre)
				.correo(correo)
				.apellidoPaterno(apellidoPaterno)
				.apellidoMaterno(apellidoMaterno)
				.fechaNacimiento(fecnac.isPresent() ? LocalDate.parse(fecnac.get()) : LocalDate.now())
				.build());
	}
	
	public Optional<Persona> persona(final int id) {
		return repo.findById(id);
	}
	
	public List<Persona> personas(final int cantidad) {
		return repo.findAll().parallelStream().limit(cantidad).collect(Collectors.toList());
	}
}
