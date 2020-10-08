package ar.edu.undec.neutron.service;

import ar.edu.undec.neutron.dto.Response;
import ar.edu.undec.neutron.modelo.Persona;
import ar.edu.undec.neutron.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personarepo;
    
    public Response findAll(){
        Response  response = new Response();
        List<Persona> personaList = personarepo.findAll();
        response.setData(personaList);
        return response;
    }

    public Response findOne(Integer personaId) {
        Response response = new Response();
        Persona persona = personarepo.findById(personaId).get();
        response.setData(persona);
        return response;
    }
    public Response save(Persona persona) {
        Response response = new Response();
        personarepo.save(persona);
        response.setData("guardado");
        return response;
    }
}
