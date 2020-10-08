package ar.edu.undec.neutron.service;

import ar.edu.undec.neutron.dto.Response;
import ar.edu.undec.neutron.modelo.Libro;
import ar.edu.undec.neutron.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository librorepo;

    public Response findAll(){
        Response  response = new Response();
        List<Libro> libroList = librorepo.findAll();
        response.setData(libroList);
        return response;
    }

    public Response findOne(Integer libroId) {
        Response response = new Response();
        Libro libro = librorepo.findById(libroId).get();
        response.setData(libro);
        return response;
    }
    public Response save(Libro libro) {
        Response response = new Response();
        librorepo.save(libro);
        response.setData("guardado");
        return response;
    }
}
