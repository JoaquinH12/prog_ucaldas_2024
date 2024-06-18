public class Estudiante extends Persona {
    private String estudiante_id = "";

    public Estudiante(String nombre, String segundoNombre, String documento, String genero, String estudiante_id) {
        //Super = super clase. Los atributos vienen de la super clase (clase padre)
        super(nombre, segundoNombre, documento, genero);
        this.estudiante_id = estudiante_id;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estudiante id: " + estudiante_id;
    }
    

}