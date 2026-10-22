public class EBook extends NetTitle {
    int characters;
    boolean illustrated;

    EBook(String title, String literatureType, int availability, int reach, int use, int characters, boolean illustrated){
        super(title, literatureType, availability, reach, use);
        this.characters = characters;
        this.illustrated = illustrated;
    }

    double calculatePages(){

        if (illustrated){
            return ((characters / 1800) + 20)*1.1; //tilføjer 10% oveni hvis bogen er illustreret
        }

        return (characters / 1800) + 20;
    }

    double calculatePoints(){
        return calculatePages() * convertLiteratureType() * getPseudoCopies();
    }
}
