package co.edu.uniquindio.poo.app.model;

public class Bibliotecario extends Persona {

    private int salario;


    public Bibliotecario(String nombre, String cedula, String telefono, String correo, int salario) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
    }


    public int getSalario() {
        return salario;
    }


    public void setSalario(int salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Bibliotecario [salario=" + salario + "]";
    }



    

   

    


    
}
