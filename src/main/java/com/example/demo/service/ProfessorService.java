package com.example.demo.service;

import com.example.demo.controller.ProfessorController;
import com.example.demo.exceptions.ObjectNotFoundException;
import com.example.demo.persistence.model.Aluno;
import com.example.demo.persistence.model.Professor;
import com.example.demo.persistence.repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<Professor> mostrarAll() {
        return professorRepository.findAll();
    }

    public Professor cadastrarProfessor(Professor professor) {
        return professorRepository.save(professor);
    }

    public Professor mostrarById(Long id) {
        Optional<Professor> byId = professorRepository.findById(id);
        return byId.orElseThrow(()-> new ObjectNotFoundException("Object nao encontrado" + id + " Tipo: " + Professor.class.getName()));
    }
}
