package Carvajal.Reto.Controller;

import Carvajal.Reto.Modelo.Productos;
import Carvajal.Reto.Servicios.ProductosService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/productos/")
public class ProductsController {
    
    @Autowired
    private ProductosService servicios;
    
    @GetMapping(path = "all")
    private List<Productos> GetProducts(){
        return servicios.getP();
    }
    
    @PostMapping(path = "nuevo")
    private ResponseEntity<Productos> NuevoP(@RequestBody Productos prod){
        Productos produ = servicios.save(prod);
        return new ResponseEntity<>(produ, HttpStatus.CREATED);
    }
    
    @GetMapping(path = "{id}")
    public Optional<Productos> getById(@PathVariable("id") Integer id){
        return servicios.getPById(id);
    }
    
    @DeleteMapping(path="delete/{id}")
    public ResponseEntity<Productos> deleteUsers(@PathVariable("id") Integer id){
        servicios.borrar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
