public class Ufc {
    String fighters;
    String trainer;
    int round;
    public Ufc(String fighters, String trainer){
        this.fighters=fighters;
        this.trainer=fighters;
    }
    public Ufc(int round){
        this.round=round;
    }

    @Override
    public String toString() {
        return "Ufc{" +
                "fighters='" + fighters + '\'' +
                ", trainer='" + trainer + '\'' +
                ", round=" + round +
                '}';
    }
}
