import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Inscripcion {
    private Date fecha;
    public Estudiante inscripto;
    public Asignatura en;

    public Inscripcion(Estudiante inscripto, Asignatura en) {
        //TODO: Llenar con la fecha actual
        //this.fecha =
        this.inscripto = inscripto;
        this.en = en;
        inscripto.agregarInscripcion(this);
    }

    //TODO: Completar inscripción manual
    public Inscripcion(List<Asignatura> asignaturas){
        //Estudiante
        //TODO: Agregar opción de crear estudiante nuevo o usar uno ya creado
        System.out.println("Ingrese el nombre del estudiante");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Ingrese el legajo del estudiante");
        Integer legajo = new Scanner(System.in).nextInt();
        Estudiante e = new Estudiante(nombre, legajo);
        this.inscripto = e;

        //Asignatura
        System.out.println("Ingrese el código de la asignatura");
        Integer codigo = new Scanner(System.in).nextInt();
        boolean encontrado = false;
        for (Asignatura asignatura:asignaturas) {
            if (asignatura.getCodigo().equals(codigo)) {
                encontrado = true;
                this.en = asignatura;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Materia ingresada inválida");
            new Inscripcion(asignaturas);
        }

    }

    public void mostrarDatos(){
        System.out.println("Estudiante " + this.inscripto.getNombre() +
                " (legajo: " + this.inscripto.getLegajo() + ") " +
                "inscripto en la materia " + this.en.getCodigo());
    }
}
