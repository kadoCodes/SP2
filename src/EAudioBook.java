public class EAudioBook extends NetTitle implements IAudioBook{
    private int durationInMinutes;

    EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes){
        super(title, literatureType, availability, reach, use);
        this.durationInMinutes = durationInMinutes;
    }

    double calculatePoints(){
        return (getDurationInMinutes()/2) * convertLiteratureType() * getPseudoCopies();
    }

    //Vi mangler at implementere int getDurationInMinutes();
    public int getDurationInMinutes(){
        return durationInMinutes;
    }
}
