package ar.edu.undec.neutron.repository;

import ar.edu.undec.neutron.modelo.Prestamoxlibro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrestamoxlibroRepository extends JpaRepository<Prestamoxlibro,Integer> {


}