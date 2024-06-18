import java.util.ArrayList;

public class Superheroes {
    ArrayList<Superhero> dc_superheroes = new ArrayList<>();

    public void addSuperHeroes () {
        dc_superheroes.add(new Superhero("Batman", 2, new String[]{"be richest","Intelligent"}, false, 1));
        dc_superheroes.add(new Superhero("Superman", 3, new String[]{"Fly","Laser eyes","Super strength"}, true, 1));
    }

    public void showSupperherosInformation () {
        for (var i = 0; i < dc_superheroes.size(); i++) {
            System.out.println(dc_superheroes.get(i).superhero_name);
        }
    }

}