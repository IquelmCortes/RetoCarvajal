package Carvajal.Reto.Servicios;

import Carvajal.Reto.Crud.productCrud;
import Carvajal.Reto.Modelo.Productos;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosService {
    
    @Autowired
    private productCrud crud;
    
    public Productos save(Productos products){
        return crud.save(products);
    }
    
    public List<Productos> getP(){
        return crud.findAll();
    }
    
    public void borrar(Integer id){
        crud.deleteById(id);
    }
    
    public Optional<Productos> getPById(Integer id){
        return crud.findById(id);
    }
}
