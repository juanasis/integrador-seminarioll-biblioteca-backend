package ar.edu.undec.neutron.service;

import ar.edu.undec.neutron.dto.PrestamoxLibroDTO;
import ar.edu.undec.neutron.dto.Response;
import ar.edu.undec.neutron.modelo.Prestamo;
import ar.edu.undec.neutron.modelo.Prestamoxlibro;
import ar.edu.undec.neutron.repository.LibroRepository;
import ar.edu.undec.neutron.repository.PersonaRepository;
import ar.edu.undec.neutron.repository.PrestamoRepository;
import ar.edu.undec.neutron.repository.PrestamoxlibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PrestamoxlibroService {
    @Autowired
    PrestamoxlibroRepository prestamoxlibroRepository;
    PrestamoRepository prestamoRepository;
    PersonaRepository personaRepository;
    LibroRepository libroRepository;

    public Response findAll(){
        Response response = new Response();
        List<Prestamoxlibro> prestamoxlibros = prestamoxlibroRepository.findAll();
        response.setData(prestamoxlibros);
        return response;
    }

   /*public Response findAllLibrosYPersonas(){
        Response response = new Response();
        PrestamoxLibroDTO prestamoxlibrosypersonas = new PrestamoxLibroDTO();
        ArrayList<PrestamoxLibroDTO> prestamos = new ArrayList<PrestamoxLibroDTO>() {};
        List<Prestamo> prestamosrepo = new ArrayList<>();
        prestamosrepo =  prestamoRepository.findAll();
        for ( Prestamo prestamo: prestamosrepo ) {
              prestamoxlibrosypersonas.setId(prestamo.getId());
              prestamoxlibrosypersonas.setNombre(personaRepository.findById(prestamo.getPersonaid()).get().getNombre());
              prestamoxlibrosypersonas.setApellido(personaRepository.findById(prestamo.getPersonaid()).get().getApellido());
              prestamoxlibrosypersonas.setTitulo(libroRepository.findById(prestamoxlibroRepository.findById(prestamo.getId()).get().getLibroid()).get().getTitulo());
              prestamos.add(prestamoxlibrosypersonas);
        }
        response.setData(prestamos);
        return response;
    }

*/

    public Response findOne(Integer libroid){
        Response response = new Response();
        response.setData(prestamoxlibroRepository.findById(libroid).get());
        return response;

    }
    public Response save(Prestamoxlibro prestamoxlibro){
        Response response = new Response();
        prestamoxlibroRepository.save(prestamoxlibro);
        response.setData("Ok");
        return  response;
    }
}
