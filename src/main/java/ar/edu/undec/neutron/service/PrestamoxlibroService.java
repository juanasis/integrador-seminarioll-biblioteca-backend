package ar.edu.undec.neutron.service;

import ar.edu.undec.neutron.dto.Response;
import ar.edu.undec.neutron.modelo.Prestamoxlibro;
import ar.edu.undec.neutron.repository.PrestamoxlibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoxlibroService {
    @Autowired
    PrestamoxlibroRepository prestamoxlibroRepository;

    public Response findAll(){
        Response response = new Response();
        List<Prestamoxlibro> prestamoxlibros = prestamoxlibroRepository.findAll();
        response.setData(prestamoxlibros);
        return response;
    }
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
