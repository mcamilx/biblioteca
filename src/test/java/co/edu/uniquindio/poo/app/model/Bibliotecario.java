package co.edu.uniquindio.poo.app.model;

public class Bibliotecario extends Persona {

    private int salario;


    public Bibliotecario(String nombre, String cedula, String telefono, String correo, int salario) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        assert !nombre.isBlank();
        assert !cedula.isBlank();
        assert !telefono.isBlank();
        assert !correo.isBlank();
        
        
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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + salario;
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Bibliotecario other = (Bibliotecario) obj;
        if (salario != other.salario)
            return false;
        return true;
    }

    



    

   

    


    
}
