package package_live;
import package_music.Playable;
import package_music.string.Veena;
import package_music.wind.Sexophone;;
public class Test {
    public static void main(String[] args) {
        Veena vn = new Veena();
        // vn.play();
        // Output : Veena will play something.

        Sexophone sp = new Sexophone();
        // sp.play();
        //Output : Playing Sexophone.

        Playable px = vn;
        px.play();
        //Output : Veena will play something.

        Playable pxx = sp;
        pxx.play();
        //Output : Playing Sexophone.

    }
}
