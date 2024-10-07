package co.edu.uniquindio.poo.app.model;

import java.time.LocalDate;

public class Prestamo {
    
    private String codigo;
    private LocalDate fechaEntrega;
    private LocalDate fechaPrestamo;

    public Prestamo(String codigo, LocalDate fechaEntrega, LocalDate fechaPrestamo){
        this.codigo = codigo; 
        this.fechaEntrega = fechaEntrega;
        this.fechaPrestamo = fechaPrestamo;
        assert !codigo.isBlank();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo [codigo=" + codigo + ", fechaEntrega=" + fechaEntrega + ", fechaPrestamo=" + fechaPrestamo
                + "]";
    }

    

}
