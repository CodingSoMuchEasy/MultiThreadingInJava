// Dealing with two threads - by inheritance method

class newthread extends Thread
{
     newthread()
     {
          super();
     }
     public void run()
     {
          try
          {
               for(int i=1;i<=5;i++)
               {
                    System.out.println("Child thread : "+i);
                    sleep(500);
               }
          }
          catch(InterruptedException e)
          {
               System.out.println("Child thread is interruppted");
          }
     }
}

class DemoTwoThreads     
{
     public static void main(String args[])
     {
          newthread t1=new newthread();
          t1.start();
          try 
          {
               for(int i=1;i<=5;i++)
               {
                    System.out.println("Main thread : "+i);
                    Thread.sleep(1000);
               }
            }
          catch(InterruptedException e)
          {
               System.out.println("Main thread interrupted");
          }
      }
}
