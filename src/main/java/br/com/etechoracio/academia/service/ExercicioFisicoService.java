package br.com.etechoracio.academia.service;

import br.com.etechoracio.academia.dto.response.ExercicioFisicoResponse;
import br.com.etechoracio.academia.mapper.ExercicioFisicoMapper;
import br.com.etechoracio.academia.repository.ExercicioFisicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercicioFisicoService {

    private final ExercicioFisicoRepository repository;
    private final ExercicioFisicoMapper mapper;

    public ExercicioFisicoService(
            ExercicioFisicoRepository repository,
            ExercicioFisicoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ExercicioFisicoResponse> listarAprovados() {
        return repository.findByAprovadoTrue()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }
}