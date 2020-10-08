package ar.edu.undec.neutron.controller;

import ar.edu.undec.neutron.dto.Response;
import ar.edu.undec.neutron.service.PrestamoxlibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/prestamoxlibro")
public class PrestamoxlibroController {
    @Autowired
    PrestamoxlibroService prestamoxlibroService;

    @GetMapping("/{id}")
    public ResponseEntity<Response> getPrestamosxlibro(@PathVariable(value = "id")Integer prestamoxlibroid)throws  Exception{
        Response response = prestamoxlibroService.findOne(prestamoxlibroid);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<Response> getTodosLosPrestamos(){
        Response response = prestamoxlibroService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
   
}
