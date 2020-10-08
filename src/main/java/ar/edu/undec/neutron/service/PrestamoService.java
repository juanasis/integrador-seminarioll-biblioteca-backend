package ar.edu.undec.neutron.service;

import ar.edu.undec.neutron.dto.Response;
import ar.edu.undec.neutron.modelo.Prestamo;
import ar.edu.undec.neutron.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {
    @Autowired
    PrestamoRepository prestamorepo;

    public Response findAll(){
        Response response = new Response();
        List<Prestamo> prestamoList = prestamorepo.findAll();
        response.setData(prestamoList);
        return  response;
    }
    public Response findOne(Integer prestamoId){
        Response response = new Response();
        Prestamo prestamo = prestamorepo.findById(prestamoId).get();
        response.setData(prestamo);
        return response;
    }
    public Response save(Prestamo prestamo){
        Response response = new Response();
        prestamorepo.save(prestamo);
        response.setData("Prestamo realizado con exito");
        return response;
    }
}
