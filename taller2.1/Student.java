public class Student {

    public String name = "";
    public String code = "";
    public String carrer = "";
    public double average = 0.0;

    public Student (String name, String code, String carrer, double average){
        this.name = name;
        this.code = code;
        this.carrer = carrer;
        this.average = average;
    }

    
    public String toString() {
        return "Nombre: " + name + ", Código: " + code + ", Carrera: " + carrer + ", Promedio: " + average;
    }

    
    public String getName(){
        return name;
    }
    public String getCode(){
        return code;
    }
    public String getCarrer(){
        return carrer;
    }
    public double getAverage(){
        return average;
    }

}
