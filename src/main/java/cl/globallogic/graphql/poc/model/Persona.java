package cl.globallogic.graphql.poc.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Persona implements Serializable {

	private static final long serialVersionUID = 3409223565395875014L;
	
	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String nombre;
	
	@Email
	@Column(name = "correo", nullable = false)
	private String correo;
	
	@Column
	private String apellidoPaterno;
	
	@Column
	private String apellidoMaterno;
	
	@Column
	private LocalDate fechaNacimiento;
	
}
