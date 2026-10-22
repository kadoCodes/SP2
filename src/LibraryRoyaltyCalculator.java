public class LibraryRoyaltyCalculator {

    void main(){
        /*
        Author a1 = new Author("Benny Hansen");

        a1.addTitle(new AudioBook("The Whales", "BI", 45, 24));
        a1.addTitle(new PrintedBook("Nature beyond our eyes", "FAG", 124, 31));
        a1.addTitle(new PrintedBook("The Hidden Duck", "TE", 96, 29));

        System.out.println(a1.getName()+": "+ a1.calculateRoyalties()+" DKK");

         */



        Author test = new Author("Olga Ravn");

        test.addTitle(new PrintedBook("Celestine", "SKØN", 166, 140));
        test.addTitle(new AudioBook("Celestine", "SKØN", 192, 140));

        System.out.println(test.getName()+": "+test.calculateRoyalties()+" DKK");


        //Til vores udvidet klassediagram, manglede vi at assigne en rate i vores "Title" class. Ellers kan vi ikke kalkulere royalties
        //Klassediagrammet manglede også at implementere metoden "int getDurationInMinutes();" i "IAudioBook" interfacen
        System.out.println();
        EBook book1 = new EBook("Dogs and Cats", "FAG", 97, 50, 205, 360000, false);
        System.out.println(book1.calculatePoints()+" points");

    }
}
