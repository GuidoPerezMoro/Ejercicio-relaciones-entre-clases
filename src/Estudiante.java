import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {
    public List<Inscripcion> formulario;

    public Estudiante(String nombre, Integer legajo) {
        super(nombre, legajo);
    }

    public Estudiante() {
    }

    public void agregarInscripcion(Inscripcion inscripcion){
        if (this.formulario == null)
            this.formulario = new ArrayList<>();
        this.formulario.add(inscripcion);
    }

    public void mostrarDatos(){
        System.out.println("\nESTUDIANTE" +
                "\nNombre: " + this.nombre +
                "\nLegajo: " + this.legajo);
        if (this.formulario != null) {
            System.out.println("Asignaturas en las que está inscripto:");
            for (Inscripcion inscripcion:this.formulario) {
                System.out.println(inscripcion.en.getCodigo());
            }
        } else
            System.out.println("No está inscripto en ninguna materia");
    }

}
