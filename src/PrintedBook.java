public class PrintedBook extends PhysicalTitle{
    int pages;

    PrintedBook(String title, String literatureType, int copies, int pages){
        super(title, literatureType, copies);
        this.pages = pages;
    }

    double calculatePoints(){
        return pages * convertLiteratureType() * copies;
    }
}
