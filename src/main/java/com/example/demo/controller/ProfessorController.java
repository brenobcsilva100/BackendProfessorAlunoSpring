package com.example.demo.controller;

import com.example.demo.persistence.model.Professor;
import com.example.demo.service.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping
    public ResponseEntity<List<Professor>> mostrarProfessorAll(){
        return new ResponseEntity<>(professorService.mostrarAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> mostrarProfessorById(@PathVariable Long id){
        return new ResponseEntity<>(professorService.mostrarById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Professor> cadastrarProfessor(@RequestBody Professor professor){
        return new ResponseEntity<>(professorService.cadastrarProfessor(professor), HttpStatus.CREATED);
    }

}
