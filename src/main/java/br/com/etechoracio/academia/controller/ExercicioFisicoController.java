package br.com.etechoracio.academia.controller;

import br.com.etechoracio.academia.dto.response.ExercicioFisicoResponse;
import br.com.etechoracio.academia.service.ExercicioFisicoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicios-fisicos")
public class ExercicioFisicoController {

    private final ExercicioFisicoService service;

    public ExercicioFisicoController(ExercicioFisicoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ExercicioFisicoResponse>> listar() {
        return ResponseEntity.ok(service.listarAprovados());
    }
}