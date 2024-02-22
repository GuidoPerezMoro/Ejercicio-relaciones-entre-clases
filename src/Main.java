import java.util.ArrayList;
import java.util.List;



public class Main {
    public static List<Asignatura> asignaturas = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("-------------------------------INICIO PROGRAMA-------------------------------");

        //Creamos profesores
        Profesor p1 = new Profesor("Guido", 1001);
        Profesor p2 = new Profesor("Juampa", 1002);

        //Creamos asignaturas
        Asignatura a1 = new Asignatura(101);
        Asignatura a2 = new Asignatura(102);
        Asignatura a3 = new Asignatura(103);
        asignaturas.add(a1); asignaturas.add(a2); asignaturas.add(a3);

        //Asigamos a los profesores sus asignaturas
        p1.agregarAsignatura(a1);

        //Creamos estudiantes
        Estudiante e1 = new Estudiante("Genaro", 2004);
        Estudiante e2 = new Estudiante("Ramiro", 2002);
        Estudiante e3 = new Estudiante("Lucas", 2003);

        //Realizamos inscripciones
        Inscripcion i1 = new Inscripcion(e1,a1);
        Inscripcion i2 = new Inscripcion(e1,a2);
        Inscripcion i3 = new Inscripcion(e2,a1);
        Inscripcion i4 = new Inscripcion(e3,a3);
        //Inscripcion manual
        //TODO: COMPLETAR INSCRIPCIÓN MANUAL
        Inscripcion i5 = new Inscripcion(asignaturas);

        //Mostramos los datos
        System.out.println("\nPROFESORES");
        p1.mostrarDatos();
        p2.mostrarDatos();

        System.out.println("\nESTUDIANTES");
        e1.mostrarDatos();
        e2.mostrarDatos();
        e3.mostrarDatos();

        System.out.println("\nINSCRIPCIONES");
        i1.mostrarDatos();
        i2.mostrarDatos();
        i3.mostrarDatos();
        i4.mostrarDatos();
    }


}