
package com.proyectofinalargprog.backend.Repository;

import com.proyectofinalargprog.backend.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}
