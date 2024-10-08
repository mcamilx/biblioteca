package co.edu.uniquindio.poo.app.model;

import java.time.LocalDate;

public class Libro {

    private String codigo;
    private String isbn;
    private String autor;
    private String titulo;
    private String editorial;
    private LocalDate fecha;

    public Libro (String codigo, String isbn, String autor, String titulo, String editorial, LocalDate fecha){
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fecha = fecha;
        assert !codigo.isBlank();
        assert !isbn.isBlank();
        assert !autor.isBlank();
        assert !titulo.isBlank();
        assert !editorial.isBlank();
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Libro [codigo=" + codigo + ", isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo + ", editorial="
                + editorial + ", fecha=" + fecha + "]";
    }

    public boolean tituloVocal(){
        String titulo = getTitulo().toLowerCase();
        boolean verficiacion = false;
        if (titulo.charAt(0) == 'a' || titulo.charAt(0) == 'e' || titulo.charAt(0) == 'i' || titulo.charAt(0) == 'o' || titulo.charAt(0) == 'u' ){
            verficiacion = true;
        }
        return verficiacion;
    }
        


}
    
    
    

