public class Player extends Thread{
    private final Box box;

    public Player(String name, Box box) {
        super(name);
        this.box = box;
    }

    @Override
    public void run() {
        box.on();
    }
}
