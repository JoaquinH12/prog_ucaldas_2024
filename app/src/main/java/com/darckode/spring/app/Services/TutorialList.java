package com.darckode.spring.app.Services;
import java.util.List;

import com.darckode.spring.app.Domain.Tutorial;

public interface TutorialList {

    List <Tutorial> listaTuto();
    void GuardarTuto(Tutorial lista);
    void EliminarTuto(Tutorial lista);
    Tutorial mostrarTuto(Long id);
    
}
