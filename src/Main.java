public class Main {

    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();
        Player player = new Player("Вася",box);
        Toy toy = new Toy("Бурундук", box);

        player.start();
        toy.start();
        player.join();
        toy.interrupt();
    }
}