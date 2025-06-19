
package com.apirest.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.apirest.api.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    
}
