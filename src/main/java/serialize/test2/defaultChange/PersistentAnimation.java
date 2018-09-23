package serialize.test2.defaultChange;

/**
 * Created by IFatkullina on 21.09.2018.
 */

import java.io.*;

public class PersistentAnimation implements Serializable, Runnable {
    private static final long serialVersionUID = -2752245097479646960L;
    transient private Thread animator;
    private int animationSpeed;

    public PersistentAnimation(int animationSpeed) {
        this.animationSpeed = animationSpeed;
        startAnimation();
    }

    public void run() {
        while (true) {
            // do animation here
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.flush();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        // наш "псевдо-конструктор"
        in.defaultReadObject();
        // теперь мы вновь получили "живой" объект,
        // поэтому давайте перестроим и запустим его
        startAnimation();
    }

    //Чтобы остановить автоматическую сериализацию
//    private void writeObject(ObjectOutputStream out) throws IOException {
//        throw new NotSerializableException("Не сегодня!");
//    }
//
//    private void readObject(ObjectInputStream in) throws IOException {
//        throw new NotSerializableException("Не сегодня!");
//    }

    private void startAnimation() {
        animator = new Thread(this);
        animator.start();
    }

    public int getAnimationSpeed() {
        return animationSpeed;
    }
}
