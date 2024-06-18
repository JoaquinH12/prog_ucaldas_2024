import java.util.ArrayList;
public class Running {

    ArrayList<shoes> Running_shoes = new ArrayList<shoes>();

    public ArrayList<shoes> addRunningShoes(){
        Running_shoes.add(new shoes("1234", 100f, 41, "ruta1", false, 15));
        Running_shoes.add(new shoes("1324", 200f, 38, "ruta2", true, 8));
        Running_shoes.add(new shoes("0434", 150f, 43, "ruta3", false, 9));
        return Running_shoes ;
    }
    public String showInformation (){
        String information = "";

        for (int i = 0; i < Running_shoes.size(); i++) {
            
            information += Running_shoes.get(i).getReference() + "- Talla: " +
            Running_shoes.get(i).getSize() + " - Precio: " +
            Running_shoes.get(i).getPrice() + "- Fotos: " +
            Running_shoes.get(i).getPhoto_route() + "- Envio a casa: " +
            Running_shoes.get(i).getSend_method() + "- Cantidad de colores: " +
            Running_shoes.get(i).getCant_colors() + "\n__";
        }
        return information;
    }
    
    public String size38 (){ // filtro de talla 38
        String information = "";
        for (int i = 0; i < Running_shoes.size(); i++) {
            if ((Running_shoes.get(i).getSize()) == 38) {
                information += Running_shoes.get(i).getReference() + "- Talla: " +
                Running_shoes.get(i).getSize() + " - Precio: " +
                Running_shoes.get(i).getPrice() + "- Fotos: " +
                Running_shoes.get(i).getPhoto_route() + "- Envio a casa: " +
                Running_shoes.get(i).getSend_method() + "- Cantidad de colores: " +
                Running_shoes.get(i).getCant_colors() + "\n__";
                }
            }
        return information;
    }

    public String precioUSD (){ // filtro precios mas de 150USD
        String information = "";
        for (int i = 0; i < Running_shoes.size(); i++) {
            if ((Running_shoes.get(i).getPrice()) >= 150.0) {
                information += Running_shoes.get(i).getReference() + "- Talla: " +
                Running_shoes.get(i).getSize() + " - Precio: " +
                Running_shoes.get(i).getPrice() + "- Fotos: " +
                Running_shoes.get(i).getPhoto_route() + "- Envio a casa: " +
                Running_shoes.get(i).getSend_method() + "- Cantidad de colores: " +
                Running_shoes.get(i).getCant_colors() + "\n__";
                }
            }
        return information;
    }

    public String envio (){ // filtro envio
        String information = "";
        for (int i = 0; i < Running_shoes.size(); i++) {
            if ( Running_shoes.get(i).getSend_method()== false) {
                information += Running_shoes.get(i).getReference() + "- Talla: " +
                Running_shoes.get(i).getSize() + " - Precio: " +
                Running_shoes.get(i).getPrice() + "- Fotos: " +
                Running_shoes.get(i).getPhoto_route() + "- Envio a casa: " +
                Running_shoes.get(i).getSend_method() + "- Cantidad de colores: " +
                Running_shoes.get(i).getCant_colors() + "\n__";
                }
            }
        return information;
    }
    
    
}
