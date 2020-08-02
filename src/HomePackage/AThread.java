package HomePackage;

public class AThread extends Thread {

    @Override
    public void run()
    {
        for (int i = 1; i <= 4; i++) {
            try
            {
                Thread.sleep(100);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i + "->A->");
        }
    }
}