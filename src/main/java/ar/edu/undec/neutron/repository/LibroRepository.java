package ar.edu.undec.neutron.repository;

import ar.edu.undec.neutron.modelo.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

        }