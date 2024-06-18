package com.proyect.api.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyect.api.user;
import com.proyect.api.Repository.userRepository;

@Service
public class UserService {
    @Autowired
    private userRepository userRepository;

    public List<user> listarusers() {
        return userRepository.findAll();
    }

    public user guardaruser(user user) {
        return userRepository.save(user);
    }

    public user buscarPorId(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public user actualizaruser(Long id, user user) {
        user userExistente = buscarPorId(id);
        if (userExistente != null) {
            userExistente.setNombre(user.getNombre());
            userExistente.setEmail(user.getEmail());
            userExistente.setPassword(user.getPassword());
            return userRepository.save(userExistente);
        }
        return null;
    }
}

