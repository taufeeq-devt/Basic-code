public class TrafficLight {
    enum Color {
        RED,
        YELLOW,
        GREEN
    }

    public static void main(String[] args) throws InterruptedException {
        Color color = Color.RED;

        while (true) {
            switch (color) {
                case RED:
                    System.out.println("STOP! The light is RED.");
                    Thread.sleep(5000); // wait for 5 seconds
                    color = Color.GREEN;
                    break;
                case YELLOW:
                    System.out.println("CAUTION! The light is YELLOW.");
                    Thread.sleep(2000); // wait for 2 seconds
                    color = Color.RED;
                    break;
                case GREEN:
                    System.out.println("GO! The light is GREEN.");
                    Thread.sleep(5000); // wait for 5 seconds
                    color = Color.YELLOW;
                    break;
            }
        }
    }
}
 
