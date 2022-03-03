package Carvajal.Reto.Crud;

import Carvajal.Reto.Modelo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productCrud extends JpaRepository<Productos, Integer>{
    
}
