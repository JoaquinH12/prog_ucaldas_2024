public class Profesor extends Persona {
    private float salario_profesor = 0f;

    public Profesor(String nombre, String numero_telefono, String correo_electronico, float salario_profesor) {
        super(nombre, numero_telefono, correo_electronico);
        this.salario_profesor = salario_profesor;
    }

    public Profesor(String nombre, String numero_telefono, String correo_electronico) {
        super(nombre, numero_telefono, correo_electronico);
    }
    

}
