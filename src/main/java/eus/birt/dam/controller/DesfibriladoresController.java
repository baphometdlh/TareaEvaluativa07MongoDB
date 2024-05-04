package eus.birt.dam.controller;

import eus.birt.dam.domain.Desfibriladores;
import eus.birt.dam.repository.DesfibriladoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@CrossOrigin (origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class DesfibriladoresController {

    @Autowired
    DesfibriladoresRepository desfibriladoresRepository;

    /**
     * Endpoint principal de desfibriladores
     * @return
     */
    @GetMapping("/desfibriladores")
    public ResponseEntity<List<Desfibriladores>> index(){
        try{
            List<Desfibriladores> desfibriladores = desfibriladoresRepository.findAll();
            return new ResponseEntity<List<Desfibriladores>>(desfibriladores, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            return new ResponseEntity<List<Desfibriladores>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/municipiosGuipuzcoa")
    public ResponseEntity<List<String>> getMunicipiosGui(){
        try{
            List<Desfibriladores> desfibriladores = desfibriladoresRepository.findAll();
            Set<String> municipiosGuip = new HashSet<>();
            for(Desfibriladores desfibrilador : desfibriladores){

                if(desfibrilador.getProperties().getProvincia().equals("Gipuzkoa")){
                    municipiosGuip.add(desfibrilador.getProperties().getMunicipio());
                }
            }
            List<String> sortedMunicipios = new ArrayList<>(municipiosGuip);
            Collections.sort(sortedMunicipios);
            return new ResponseEntity<List<String>>(sortedMunicipios, HttpStatus.OK);
        } catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<List<String>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/numSerie/{num}")
    public ResponseEntity<List<Desfibriladores>> getNumSerie(@PathVariable String num){
        try{
            List<Desfibriladores> desfibriladores = desfibriladoresRepository.findAll();
            List<Desfibriladores> numSerie = new ArrayList<>();
            for(Desfibriladores desfibrilador : desfibriladores) {

                if (desfibrilador.getProperties().getNumserie().startsWith(num)) {
                    numSerie.add(desfibrilador);
                }
            }

            return new ResponseEntity<List<Desfibriladores>>(numSerie, HttpStatus.OK);
        } catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<List<Desfibriladores>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/desfibriladores/{ciudad}")
    public ResponseEntity<List<Desfibriladores>> getDesfiCiudad(@PathVariable String ciudad){
        try{
            List<Desfibriladores> desfibriladores = desfibriladoresRepository.findAll();
            List<Desfibriladores> municipio = new ArrayList<>();
            for (Desfibriladores desfibrilador : desfibriladores) {
                if (desfibrilador.getProperties().getMunicipio().equals(ciudad)) {
                    municipio.add(desfibrilador);
                }
            }

            return new ResponseEntity<List<Desfibriladores>>(municipio, HttpStatus.OK);

        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<List<Desfibriladores>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
