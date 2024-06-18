package com.sustent.aplica.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sustent.aplica.domain.Vehiculo;
public interface VehiculoRepository extends JpaRepository<Vehiculo,Long>{}