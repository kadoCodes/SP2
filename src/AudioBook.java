public class AudioBook extends PhysicalTitle implements IAudioBook{
    private int durationInMinutes;

    AudioBook(String title, String literatureType, int copies, int durationInMinutes){
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    double calculatePoints(){
        return (getDurationInMinutes() * 0.5) * convertLiteratureType() * copies;
    }

    //Vi mangler at implementere int getDurationInMinutes();
    public int getDurationInMinutes(){
        return durationInMinutes;
    }


}
