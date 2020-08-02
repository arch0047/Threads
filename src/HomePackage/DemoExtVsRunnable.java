package HomePackage;


public class DemoExtVsRunnable
{
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i=0; i<n; i++)
        {
            //Example of extend "Thread"
            ExtendThread object = new ExtendThread();
            object.start();

            //Example of Runnable interface implementation
       //     Thread object = new Thread(new RunnableImpl());
       //     object.start();

        }
    }
}