package co.edu.uniquindio.poo.app.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.time.LocalDate;

public class Biblioteca{
     
    private String nombre;
    private List<Libro> listaLibros = new LinkedList<Libro>();
    private List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    private Map<String, Bibliotecario> mapaBibliotecarios = new HashMap<>();
    private Stack<Prestamo> pilaPrestamo = new Stack<Prestamo>();


    public Biblioteca (String nombre){
        this.nombre = nombre;
        this.listaLibros = new LinkedList<Libro>();
        this.listaEstudiantes = new ArrayList<Estudiante>();
        this.mapaBibliotecarios = new HashMap<>();
        this.pilaPrestamo = new Stack<Prestamo>();

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public List<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(List<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public Map<String, Bibliotecario> getMapaBibliotecarios() {
        return mapaBibliotecarios;
    }

    public void setMapaBibliotecarios(Map<String, Bibliotecario> mapaBibliotecarios) {
        this.mapaBibliotecarios = mapaBibliotecarios;
    }

        public Stack<Prestamo> getPilaPrestamo() {
        return pilaPrestamo;
    }

    public void setPilaPrestamo(Stack<Prestamo> pilaPrestamo) {
        this.pilaPrestamo = pilaPrestamo;
    }
    
    //libro

    public String crearLibro (Libro nuevoLibro){
        String mensaje = "";
        Libro libroEncontrado = null;

        libroEncontrado = buscarLibro(nuevoLibro.getIsbn());

            if (libroEncontrado != null){
                mensaje = "\n El libro ya se encuentra registrado";
            }else{
                listaLibros.add(nuevoLibro);
                mensaje = "\nEl libro se ha almacenado de manera exitosa";
            }
            return mensaje;
    }

    public Libro nuevoLibro(String codigo, String isbn, String autor, String titulo, String editorial, LocalDate fecha){
        Libro nuevoLibro = new Libro(codigo, isbn, autor, titulo, editorial, null);
        return nuevoLibro;
    }

    public Libro buscarLibro(String isbn){
        Libro libroEncontrado = null;

        for (Libro libro : listaLibros) {
            Libro libroAux = libro;
            if(libroAux!=null){
                if(libroAux.getIsbn().equals(isbn)){
                    libroEncontrado = libroAux;
                    return libroEncontrado;
                }
            }
        }
        return libroEncontrado;
    }


    public String eliminarLibro(String isbn){
        String mensaje = "\nEl libro no existe";

        for (Libro libro : listaLibros) {
            Libro libroAux = libro;
            if(libroAux!=null){
                if(libroAux.getIsbn().equals(isbn)){
                    listaLibros.remove(libroAux);
                mensaje = "\nEl libro ha sido eliminado exitosamente";
                return mensaje;
                }
            }
        }
        return mensaje;
    }

    public String actualizarLibro(String codigo, String isbn, String autor, String titulo, String editorial, LocalDate fecha){
        String mensaje = "\nEl libro no se encuentra registrado";
        Libro libroEncontrado = buscarLibro(isbn);
        if (libroEncontrado != null){
            libroEncontrado.setCodigo(codigo);
            libroEncontrado.setIsbn(isbn);
            libroEncontrado.setAutor(autor);
            libroEncontrado.setTitulo(titulo);
            libroEncontrado.setEditorial(editorial);
            libroEncontrado.setFecha(fecha);
            mensaje = "\nLa información del libro ha sido actualizada";
            return mensaje;
        }
        return mensaje;
    }

    //Estudiante


    public Estudiante nuevoEstudiante(String nombre, String cedula, String telefono, String correo){
        Estudiante nuevoEstudiante = new Estudiante(nombre, cedula, telefono, correo);
        return nuevoEstudiante;
    }

    public String crearEstudiante (Estudiante nuevoEstudiante){
        String mensaje = "";
        Estudiante estudianteEncontrado = null;

        estudianteEncontrado = buscarEstudiante(nuevoEstudiante.getCedula());

            if (estudianteEncontrado != null){
                mensaje = "\n El estudiante ya se encuentra registrado";
            }else{
                listaEstudiantes.add(nuevoEstudiante);
                mensaje = "\nEl estudiante se ha registrado de manera exitosa";
            }
            return mensaje;
    }

    public Estudiante buscarEstudiante(String cedula){
        Estudiante estudianteEncontrado = null;

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante estudianteAux = listaEstudiantes.get(i);
            if(estudianteAux!=null){
                if(estudianteAux.getCedula().equals(cedula)){
                    estudianteEncontrado = estudianteAux;
                    return estudianteEncontrado;
                }
            }
        }
        return estudianteEncontrado;
    }


    public String eliminarEstudiante(String cedula){
        String mensaje = "\nEl Estudiante no existe";

        for (int i = 0; i<listaEstudiantes.size(); i++) {
            Estudiante estudianteAux = listaEstudiantes.get(i);
            if(estudianteAux!=null){
                if(estudianteAux.getCedula().equals(cedula)){
                    listaEstudiantes.remove(estudianteAux);
                mensaje = "\nEl estudiante ha sido eliminado exitosamente";
                return mensaje;
                }
            }
        }
        return mensaje;
    }


    public String actualizarEstudiante(String nombre, String Cedula, String telefono, String correo){
        String mensaje = "\nEl estudiante no se encuentra registrado";
        Estudiante estudianteEncontrado = buscarEstudiante(Cedula);
        if(estudianteEncontrado != null){
            estudianteEncontrado.setNombre(nombre);
            estudianteEncontrado.setCedula(Cedula);
            estudianteEncontrado.setTelefono(telefono);
            estudianteEncontrado.setCorreo(correo);
            mensaje = "\nLa información se actualizó de manera exitosa";
            return mensaje;
        }
        return mensaje;
    }



    // Prestamo

    public Prestamo nuevoPrestamo(String codigo, LocalDate fechaEntrega, LocalDate fechaPrestamo){
        Prestamo nuevoPrestamo = new Prestamo(codigo, fechaEntrega, fechaPrestamo);
        return nuevoPrestamo;
    }

    public String crearPrestamo(Prestamo nuevoPrestamo){
        String mensaje = "";
        Prestamo prestamoEncontrado = null;

        prestamoEncontrado = buscarPrestamo(nuevoPrestamo.getCodigo());

            if (prestamoEncontrado != null){
                mensaje = "\n El prestamo ya se encuentra registrado";
            }else{
                pilaPrestamo.push(nuevoPrestamo);
                mensaje = "\nEl prestamo se ha registrado de manera exitosa";
            }
            return mensaje;
    }

    public Prestamo buscarPrestamo(String codigo){
        Prestamo prestamoEncontrado = null;

        for (Prestamo prestamo : pilaPrestamo) {
            Prestamo prestamoAux = prestamo;
            if(prestamoAux!=null){
                if(prestamoAux.getCodigo().equals(codigo)){
                    prestamoEncontrado = prestamoAux;
                    return prestamoEncontrado;
                }
            }
        }
        return prestamoEncontrado;
    }

    public String eliminarPrestamo(String codigo){
        String mensaje = "\nEl prestamo no está registrado";

        for (Prestamo prestamo : pilaPrestamo) {
            Prestamo prestamoAux = prestamo;
            if(prestamoAux!=null){
                if(prestamoAux.getCodigo().equals(codigo)){
                    pilaPrestamo.remove(prestamoAux);
                    mensaje = "\nEl prestamo ha sido eliminado";
                    return mensaje;
                }
            }
        }
        return mensaje;
    }

    public String actualizarPrestamo(String codigo, LocalDate fechaEntrega, LocalDate fechaPrestamo){
        String mensaje = "\nEl prestamo no se encuentra registrado";
        Prestamo prestamoEncontrado = buscarPrestamo(codigo);
        if(prestamoEncontrado != null){
            prestamoEncontrado.setCodigo(codigo);;
            prestamoEncontrado.setFechaEntrega(fechaEntrega);;
            prestamoEncontrado.setFechaPrestamo(fechaPrestamo);
            mensaje = "\nLa información se actualizó de manera exitosa";
            return mensaje;
        }
        return mensaje;
    }

    //Bibliotecario





    


}















