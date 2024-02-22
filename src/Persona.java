public abstract class Persona {
    protected String nombre;
    public Integer legajo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getLegajo() {
        return legajo;
    }

    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }

    protected Persona(String nombre, Integer legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    protected Persona() {
    }

}
