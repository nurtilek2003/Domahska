import java.util.Objects;

public class Muzsik {
    String nota;
    String sound;
    public Muzsik(String nota,String sound){
        this.nota=nota;
        this.sound=sound;
    }

    @Override
    public String toString() {
        return "Muzsik{" +
                "nota='" + nota + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}

