public abstract class Title {
    String title;
    String literatureType;
    double rate;

    Title(String title, String literatureType){
        this.title = title;
        this.literatureType = literatureType;
        this.rate = 0.067574; //Vi skal assigne en værdi til raten som vi ikk får i fortsættelses klassediagrammet - så tænker at bruge den samme fra forrige
    }

    abstract double calculatePoints();


    double convertLiteratureType(){
        switch(literatureType){
            case "BI":
                return 3;
            case "TE":
                return 3;
            case "LYRIK":
                return 6;
            case "SKØN":
                return 1.7;
            case "FAG":
                return 1;
            default:
                return 0;

        }
    }


    double calculateRoyalty(){
        return calculatePoints() * rate;
    }
}
