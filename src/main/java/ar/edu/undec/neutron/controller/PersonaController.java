package ar.edu.undec.neutron.controller;

import ar.edu.undec.neutron.dto.Response;
import ar.edu.undec.neutron.modelo.Persona;
import ar.edu.undec.neutron.service.PersonaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/personas")
public class PersonaController {
    private static final Logger LOG = LoggerFactory.getLogger(LibroController.class);

    @Autowired
    PersonaService personaService;
//consulto por solo una persona
    @GetMapping("/{id}")
    public ResponseEntity<Response> getPersonaById(@PathVariable(value = "id")Integer personaId)throws Exception{
        Response response = personaService.findOne(personaId);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    //consulto por todas las personas
    @GetMapping
    public ResponseEntity<Response> getPersonas(){
        Response response;
        response = personaService.findAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    //ingresar una fila
    @PostMapping("/registrarpersona")
    public ResponseEntity<Response> save(@Valid @RequestBody Persona persona){
        Response response = personaService.save(persona);
        return  new ResponseEntity<>(response, HttpStatus.OK);
    }

}
