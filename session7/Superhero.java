public class Superhero {
    public String superhero_name = "";
    public int superPowers_number = 0;
    public String[] superPowers = new String[superPowers_number];
    public boolean isALive = false;
    public int universe = 0;

    public Superhero(String superhero_name_param, int superPowers_number_param, String superPowers_param[], boolean isALive_param, int universe_param) {
        this.superhero_name = superhero_name_param;
        this.superPowers_number = superPowers_number_param;
        this.superPowers = superPowers_param;
        this.isALive = isALive_param;
        this.universe = universe_param;
    }

    public void SoutSuperPowers () {
        for(int i = 0; i < superPowers.length; i++) {
            System.out.println(superPowers[i]);
        }
    }
}