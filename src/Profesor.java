import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    public List<Asignatura> curso;

    public Profesor() {
    }

    public Profesor(String nombre, Integer legajo) {
        super(nombre, legajo);
    }

    public void agregarAsignatura(Asignatura asignatura){
        if (this.curso == null)
             this.curso = new ArrayList<>();
        this.curso.add(asignatura);
    }

    public void mostrarDatos(){
        System.out.println("\nPROFESOR" +
                "\nNombre: " + this.nombre +
                "\nLegajo: " + this.legajo);
        if (this.curso != null) {
            System.out.println("Asignaturas dadas:");
            for (Asignatura a:this.curso)
                System.out.println(a.getCodigo());
        } else
            System.out.println("No imparte clases en ninguna asignatura");
    }
}
