public class shoes {

    String reference = "";
    float  price = 0f;
    int size = 0;
    String photo_route = "";
    boolean send_method = false;
    int cant_colors = 0;

    public shoes (String reference_param, float price_param, int size_param,String photo_route_param, boolean send_method_param_, int cant_colors_param){
        this.reference = reference_param;
        this.price = price_param;
        this.size = size_param;
        this.photo_route = photo_route_param;
        this.send_method= send_method_param_;
        this.cant_colors = cant_colors_param;
    }
    public String getReference(){
        return reference;
    }
    public float getPrice(){
        return price;
    }
    public int getSize(){
        return size;
    }
    public String getPhoto_route(){
        return photo_route;
    }
    public boolean getSend_method(){
        return send_method;
    }
    public int getCant_colors(){
        return cant_colors;
    }

    
}
