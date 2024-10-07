package co.edu.uniquindio.poo.app;

import java.time.LocalDate;

import co.edu.uniquindio.poo.app.model.Biblioteca;
import co.edu.uniquindio.poo.app.model.Bibliotecario;
import co.edu.uniquindio.poo.app.model.Estudiante;
import co.edu.uniquindio.poo.app.model.Libro;
import co.edu.uniquindio.poo.app.model.Prestamo;

public class App {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("El mundo del libro");
        Bibliotecario bibliotecario1 = new Bibliotecario("Santiago", "1092852631", "3023130890", "santiago21@uqvirtual.edu.co", 300000);
        Bibliotecario bibliotecario2 = new Bibliotecario("Camila", "1091203555", "3108233101", "camila22@uqvirtual.edu.co", 100000);
        Estudiante estudiante1 = new Estudiante("Camilo", "62762722", "3209873873", "camilo98@uqvirtual.edu.co");
        Estudiante estudiante2 = new Estudiante("Isabela", "4265252", "3217627622", "isabela6326@uqvirrual.edu.co");
        Prestamo prestamo1 = new Prestamo("36226", LocalDate.now(), LocalDate.now());
        Libro libro1 = new Libro("2525562", "62728", "Carlos", "Cien años de Soledad", "librosuq", LocalDate.now());
        Libro libro2 = new Libro("36627", "i2822", "Sebastian", "Game of Throns", "libreriaar", LocalDate.now());
        Libro libro3 = new Libro("28772782", "wuwy7272", "Castro", "Aristoteles", "libreriaaa", LocalDate.now());  

       
    }



}