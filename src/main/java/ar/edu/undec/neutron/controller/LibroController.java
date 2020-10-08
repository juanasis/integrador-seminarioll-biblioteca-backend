package ar.edu.undec.neutron.controller;

import ar.edu.undec.neutron.dto.Response;
import ar.edu.undec.neutron.modelo.Libro;
import ar.edu.undec.neutron.service.LibroService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/libros")
public class LibroController  {
    private static final Logger LOG = LoggerFactory.getLogger(LibroController.class);

    @Autowired
    private LibroService libroService;

    // Consulto solo uno por identificador
    @GetMapping("/{id}")
    public ResponseEntity<Response> getLibroById(@PathVariable(value = "id")Integer libroId )throws Exception{
        Response response = libroService.findOne(libroId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    // Consulto por todos
    @GetMapping()
    public ResponseEntity<Response> getLibros() {
        Response response;
        response = libroService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    //ingresar una fila

    @PostMapping("/agregarlibro")
    public ResponseEntity<Response> save(@Valid @RequestBody Libro libro  ){
        Response response = libroService.save(libro);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
