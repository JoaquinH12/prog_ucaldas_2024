package com.sustent.aplica.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sustent.aplica.Repository.VehiculoRepository;
import com.sustent.aplica.domain.Vehiculo;

@Service

public class VehiculoServices {
    @Autowired

    private VehiculoRepository VehiculoRepository;

    public void create (Vehiculo Vehiculo){
        VehiculoRepository.save(Vehiculo);

    }

    public List<Vehiculo> read(){
        return VehiculoRepository.findAll();

    }
    
    public void update(Vehiculo Vehiculo){
        if(VehiculoRepository.existsById(Vehiculo.getId())){
            VehiculoRepository.save(Vehiculo);
        

        }
      
    }
    public void delete(Long id){
		if (VehiculoRepository.existsById(id)) {
			VehiculoRepository.deleteById(id);

		}
	}
}
