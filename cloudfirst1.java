import java.io.*;
class cloudfirst1{

    public static void main(String[] args)
    {
        int sum = 0 ;
         long start,stop,total;
		 start=(long)(System.nanoTime())/10000000;

		 for(int i = 1 ; i <= 100000 ; i++){
             sum = sum + i ;
            
             System.out.println(sum) ;
             sum = 0 ;
         }
		 stop=(long)(System.nanoTime())/10000000;
		 total=(long)(stop-start);
		 System.out.println(total/100 + "seconds");
    }}