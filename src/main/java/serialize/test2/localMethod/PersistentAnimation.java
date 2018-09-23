package serialize.test2.localMethod;

/**
 * Created by IFatkullina on 21.09.2018.
 */

import java.io.*;

public class PersistentAnimation implements Externalizable, Runnable {
    transient private Thread animator;
    private int animationSpeed;

    public PersistentAnimation(int animationSpeed) {
        this.animationSpeed = animationSpeed;
        //startAnimation();
    }

    public void run() {
        while (true) {
            // do animation here
        }
    }


    public  void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(out);
    }

    public  void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        // наш "псевдо-конструктор"
        in.readObject();
        // теперь мы вновь получили "живой" объект,
        // поэтому давайте перестроим и запустим его
        //startAnimation();
    }

    private void startAnimation() {
        animator = new Thread(this);
        animator.start();
    }

    public int getAnimationSpeed() {
        return animationSpeed;
    }
}
