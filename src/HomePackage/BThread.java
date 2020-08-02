package HomePackage;

public class BThread extends Thread {

    @Override
    public void run()
    {
        for (char i = 'a'; i <= 'd'; i++) {
            try {
                Thread.sleep(100);
            }
            catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i + "->B->");
        }
    }
}
