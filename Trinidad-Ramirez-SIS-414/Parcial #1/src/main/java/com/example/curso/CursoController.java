package com.example.curso;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService service;

    public CursoController(CursoService service) {
        this.service = service;
    }

    @GetMapping
    public List<curso.Curso> listar() {
        return service.listar();
    }

    @PostMapping
    public curso.Curso guardar(@RequestBody curso.Curso curso) {
        return service.guardar(curso);
    }

    @GetMapping("/{id}")
    public curso.Curso buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    public curso.Curso actualizar(@PathVariable Long id, @RequestBody curso.Curso curso) {
        curso.setId(id);
        return service.guardar(curso);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
