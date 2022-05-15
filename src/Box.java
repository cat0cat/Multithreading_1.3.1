public class Box {
    private volatile boolean toggle;
    private static final int PLAYER_SLEEP = 2000;
    private static final int TOY_SLEEP = 1000;
    private static final int OPEN_LIMIT = 10;
    private int currentOpen = 0;

    public void on() {

        while (currentOpen < OPEN_LIMIT) {
            if (!toggle) {
                toggle = true;
                System.out.println(Thread.currentThread().getName() + " включил тумблер. Коробка открылась");
                try {
                    Thread.sleep(PLAYER_SLEEP);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.interrupted();
            }
        }
    }


    public void off() {
        while (!Thread.currentThread().isInterrupted()) {
            if (toggle) {
                toggle = false;
                System.out.println(Thread.currentThread().getName() + " выключил тумблер и закрыл коробку");
                currentOpen++;
                try {
                    Thread.sleep(TOY_SLEEP);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
