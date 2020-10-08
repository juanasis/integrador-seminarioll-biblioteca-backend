package ar.edu.undec.neutron.controller;

import ar.edu.undec.neutron.dto.Response;
import ar.edu.undec.neutron.modelo.Prestamo;
import ar.edu.undec.neutron.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/prestamos")
public class PrestamoController {
    @Autowired
    PrestamoService prestamoService;

    @GetMapping("/{id}")
    public ResponseEntity<Response> getPrestamoById(@PathVariable( value = "id")Integer prestamoid) throws Exception{
        Response response = prestamoService.findOne(prestamoid);
        return new ResponseEntity<>(response , HttpStatus.OK);
    }
    @GetMapping()
    public ResponseEntity<Response> getPrestamos(){
        Response response = new Response();
        response.setData(prestamoService.findAll());
        return new ResponseEntity<>(response,HttpStatus.OK);

    }
    @PostMapping("/realizarprestamo")
    public ResponseEntity<Response> save(@Valid @RequestBody Prestamo prestamo){
       Response response = prestamoService.save(prestamo);
       return new ResponseEntity<>(response, HttpStatus.OK);
    }

}
