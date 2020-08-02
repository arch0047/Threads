package HomePackage;

public class ThreadDemo_AB extends Thread
{
    public static void main(String args[])
    {
        // creating two threads
        AThread a1 = new AThread();
        BThread b1 = new BThread();

        // starts second thread after when
        // first thread a1 is died.
        a1.start();
        try
        {
            a1.join();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        // after thread a1 execution finished
        // then b1 thread start
        b1.start();

    }
}