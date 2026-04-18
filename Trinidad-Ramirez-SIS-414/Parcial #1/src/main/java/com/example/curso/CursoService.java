package com.example.curso;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {

    private final CursoRepository repo;

    public CursoService(CursoRepository repo) {
        this.repo = repo;
    }

    public List<curso.Curso> listar() {
        return repo.findAll();
    }

    public curso.Curso guardar(curso.Curso curso) {
        return repo.save(curso);
    }

    public curso.Curso buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}