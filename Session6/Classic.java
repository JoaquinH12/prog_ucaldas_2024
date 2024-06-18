import java.util.ArrayList;
public class Classic {

    ArrayList<shoes> Classic_shoes = new ArrayList<shoes>();

    public ArrayList<shoes> addRunningShoes(){
        Classic_shoes.add(new shoes("5678", 120f, 39, "ruta4", false, 8));
        Classic_shoes.add(new shoes("4444", 220f, 38, "ruta5", true, 2));
        Classic_shoes.add(new shoes("5555", 170f, 44, "ruta6", false, 5));
        return Classic_shoes ;
    }
    public String showInformation (){
        String information = "";
        for (int i = 0; i <Classic_shoes.size(); i++) {
            information += Classic_shoes.get(i).getReference() + "- Talla: " +
            Classic_shoes.get(i).getSize() + " - Precio: " +
            Classic_shoes.get(i).getPrice() + "- Fotos: " +
            Classic_shoes.get(i).getPhoto_route() + "- Envio a casa: " +
            Classic_shoes.get(i).getSend_method() + "- Cantidad de colores: " +
            Classic_shoes.get(i).getCant_colors() + "\n__";
        }
        return information;
    }

    public String colors5 (){  // filtro de cantidad de colores
        String information = " ";
        for (int i = 0; i < Classic_shoes.size(); i++) {
            if (Classic_shoes.get(i).getCant_colors() >=5) {
                information += Classic_shoes.get(i).getReference() + "- Talla: " +
                Classic_shoes.get(i).getSize() + " - Precio: " +
                Classic_shoes.get(i).getPrice() + "- Fotos: " +
                Classic_shoes.get(i).getPhoto_route() + "- Envio a casa: " +
                Classic_shoes.get(i).getSend_method() + "- Cantidad de colores: " +
                Classic_shoes.get(i).getCant_colors() + "\n__";
            }
        }
        return information;
    
}

public String precioUSD (){ // filtro precios mas de 150USD
    String information = "";
    for (int i = 0; i < Classic_shoes.size(); i++) {
        if ((Classic_shoes.get(i).getPrice()) >= 150.0) {
            information += Classic_shoes.get(i).getReference() + "- Talla: " +
            Classic_shoes.get(i).getSize() + " - Precio: " +
            Classic_shoes.get(i).getPrice() + "- Fotos: " +
            Classic_shoes.get(i).getPhoto_route() + "- Envio a casa: " +
            Classic_shoes.get(i).getSend_method() + "- Cantidad de colores: " +
            Classic_shoes.get(i).getCant_colors() + "\n__";
            }
        }
    return information;
}





}
