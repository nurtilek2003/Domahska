public class Food {
    String potato;
    String ace;
    String marking;
    public Food(String potato,String ace, String marking){
        this.potato=potato;
        this.marking=marking;
        this.ace=ace;
    }

    @Override
    public String toString() {
        return "Food{" +
                "potato='" + potato + '\'' +
                ", ace='" + ace + '\'' +
                ", marking='" + marking + '\'' +
                '}';
    }
}
