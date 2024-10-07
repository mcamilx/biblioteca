
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.app.model.Biblioteca;
import co.edu.uniquindio.poo.app.model.Bibliotecario;
import co.edu.uniquindio.poo.app.model.Estudiante;
import co.edu.uniquindio.poo.app.model.Libro;
import co.edu.uniquindio.poo.app.model.Prestamo;

public class TestBiblioteca {
    private static final Logger LOG = Logger.getLogger(Biblioteca.class.getName());

    @DisplayName("Test Biblioteca")

    @Test
    public void testBiblioteca1 (){

        Estudiante esperado = new Estudiante("Carlos", "109129989", "3124567654", "carloos20@uqvirtual.edu.co");
        final Estudiante resultado = Biblioteca.nuevoEstudiante("Carlos", "109129989", "3124567654", "carloos20@uqvirtual.edu.co");
        Assertions.assertEquals(esperado, resultado);
    }

    @Test
    public void testBiblioteca2 (){
        LOG.info("Iniciado Test agregar estudiante");
        Biblioteca biblioteca = new Biblioteca("El mundo del libro");
        assertThrows(Throwable.class, () -> biblioteca.crearEstudiante(null));
        LOG.info("Finalizado test agregar estudiante");
    }

    @DisplayName("Test estudiante")

    @Test
    public void testEstudiante1(){
        LOG.info("Iniciado Test datos vacios");
        assertThrows(Throwable.class, () -> new Estudiante("", "", "", ""));
        LOG.info("Finalizado test datos vacios");
    }

    @Test 
    public void testEstudiante2(){
        LOG.info("Iniciado Test correo");
        assertThrows(Throwable.class, () -> new Estudiante("Carlos", "109129989", "3124567654", "carloos20uqvirtual.edu.co"));
        LOG.info("Finalizado test correo");
    }

    @DisplayName("Test bibliotecario")

    @Test
    public void testeBibliotecario1(){
        LOG.info("Iniciado Test salario negativo");
        Bibliotecario bibliotecario = new Bibliotecario ("Santiago", "1092852631", "3023130890", "santiago21@uqvirtual.edu.co", 300000);
        int salario = bibliotecario.getSalario();
        assertTrue(salario > 0);
        LOG.info("Finalizado test salario negativo");
    }

    @Test
    public void testBibliotecario2(){
        LOG.info("Iniciado Test datos vacios");
        assertThrows(Throwable.class, () -> new Bibliotecario("", "", "", "", 0));
        LOG.info("Finalizado test datos vacios");
    }

    @DisplayName("Test Prestamo")

    @Test
    public void testPrestamo1(){
        LOG.info("Iniciado Test datos vacios");
        assertThrows(Throwable.class, () -> new Prestamo("", null, null));
        LOG.info("Finalizado test datos vacios");
    }

    @Test
    public void testPrestamo2(){
        LOG.info("Iniciado Test verificar fecha actual");
        Prestamo prestamo = new Prestamo("292929", null, LocalDate.now());
        LocalDate fecha = prestamo.getFechaPrestamo();
        LocalDate esperado = LocalDate.now();
        Assertions.assertEquals(esperado, fecha);
        LOG.info("Finalizado test verificar fecha actual");
    }

    @DisplayName("Test Libro")

    @Test 
    public void testLibro1(){
        LOG.info("Iniciado Test verificar titulo vocal");
        Libro libro = new Libro("1425225", "52425", "Cesar Augusto", "Aristoteles", null, null);
        boolean esperado = true;
        assertEquals(esperado, libro.tituloVocal());
        LOG.info("Finalizado test verificar titulo vocal");
    }

    @Test
    public void testLibro2(){
        LOG.info("Iniciado Test datos vacios");
        assertThrows(Throwable.class, () -> new Libro("", "", "", "", "", null));
        LOG.info("Finalizado test datos vacios");
    }
}
