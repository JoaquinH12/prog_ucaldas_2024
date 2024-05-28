package com.darckode.spring.app.Services;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.darckode.spring.app.Domain.Tutorial;
@Service
public class TutorialService implements TutorialList {
    private List <Tutorial> tuto = new ArrayList<>();

    @Override
    public List<Tutorial> listaTuto() {
        if (tuto == null) {
            return new ArrayList<>();
            return tuto;
        }
    }

    @Override
    public void GuardarTuto(Tutorial lista) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'GuardarTuto'");
    }

    @Override
    public void EliminarTuto(Tutorial lista) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'EliminarTuto'");
    }

    @Override
    public Tutorial mostrarTuto(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarTuto'");
    }

    
}
