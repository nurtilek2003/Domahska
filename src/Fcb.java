public class Fcb {
    String ball;
    String football;
    int age;
    public Fcb(String ball,String football){
        this.ball=ball;
        this.football=football;
    }
    public Fcb(int age){
        this.age=age;
    }

    @Override
    public String toString() {
        return "Fcb{" +
                "ball='" + ball + '\'' +
                ", football='" + football + '\'' +
                ", age=" + age +
                '}';
    }
}
