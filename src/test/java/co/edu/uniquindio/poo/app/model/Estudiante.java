package co.edu.uniquindio.poo.app.model;

public class Estudiante extends Persona {

    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        assert !nombre.isBlank();
        assert !cedula.isBlank();
        assert !telefono.isBlank();
        assert !correo.isBlank();
        assert correo.contains("@");

    }

    public Estudiante nuevoEstudiante(String string, String string2, String string3, String string4) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'nuevoEstudiante'");
    }



    

    
}


