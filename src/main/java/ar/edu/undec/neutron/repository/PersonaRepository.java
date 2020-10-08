package ar.edu.undec.neutron.repository;

import ar.edu.undec.neutron.modelo.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository  extends JpaRepository<Persona,Integer> {
}
