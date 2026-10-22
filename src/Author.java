import java.util.ArrayList;

public class Author {
    private String name;
    ArrayList<Title> titles;

    Author(String name){
        this.name = name;
        this.titles = new ArrayList<>();
    }

    void addTitle(Title title){
        titles.add(title);
    }

    String getName(){
        return name;
    }

    double calculateRoyalties(){
        double royalties = 0;
        for (Title list : titles){
            royalties += list.calculateRoyalty();
        }
        return Math.round(royalties*100.0)/100.0;
    }
}
