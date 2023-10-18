public class Threads extends Thread
{


    String task1;
    String task2;

    Threads(String task1 ,String task2)
    {
        this.task1=task1;
        this.task2=task2;
    }


    public  void run()
    {

        for(int i=0;i<=5;i++)
        {
            System.out.println(task1 + "" +i);
            System.out.println(task2);
            try
            {
                Thread.sleep(1000);

            }
            catch (InterruptedException e)
            {
                System.out.println(e.getMessage());
            }


        }




    }


    public static void main(String[] args)
    {

        Threads threads=new Threads("Cutting the tickets","Showing the seats");
        Thread thread=new Thread(threads);
        thread.start();


    }



}
