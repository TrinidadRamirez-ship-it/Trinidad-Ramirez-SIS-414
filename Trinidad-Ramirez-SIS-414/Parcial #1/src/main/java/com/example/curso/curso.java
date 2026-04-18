package com.example.curso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.*;
public class curso {

    @Entity
    public class Curso {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;
        private int duracion;
        private String nivel;
        private String instructor;
        private double costo;

        public Curso() {}

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }

        public int getDuracion() { return duracion; }
        public void setDuracion(int duracion) { this.duracion = duracion; }

        public String getNivel() { return nivel; }
        public void setNivel(String nivel) { this.nivel = nivel; }

        public String getInstructor() { return instructor; }
        public void setInstructor(String instructor) { this.instructor = instructor; }

        public double getCosto() { return costo; }
        public void setCosto(double costo) { this.costo = costo; }
    }
}
