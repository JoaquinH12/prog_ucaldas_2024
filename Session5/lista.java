public class Lista {
    public String NombreTarea;
    public String Duracion;
    public String NombreEncargado;
    public int Estado;

    public Lista(String NombreTarea_param, String Duracion_param, String NombreEncargado_param, int Estado_param) { 
        this.NombreTarea = NombreTarea_param;
        this.Duracion = Duracion_param;
        this.NombreEncargado = NombreEncargado_param;
        this.Estado = Estado_param;
    }

    public String getNombreTarea() {
        return NombreTarea;
    }
    
    public String getDuracion() {
        return Duracion;
    }

    public String getNombreEncargado() {
        return NombreEncargado;
    }
    
    public int getEstado() {
        return Estado;
    }
    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

}