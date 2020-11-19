package cl.globallogic.graphql.poc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.globallogic.graphql.poc.model.Persona;

@Repository
public interface PersonasRepository extends JpaRepository<Persona, Integer> {

}
