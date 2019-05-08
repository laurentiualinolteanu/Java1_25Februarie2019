import java.util.Random;
import java.util.Scanner;

public class RandomEx
{
    public static void main(String[] args)
    {
        //java.util.Random r=new java.util.Random();//importare din alt pachet varianta 2
        
        Random r=new Random();
        System.out.println(r.nextInt());//in tot spectrul lui int
         System.out.println(r.nextInt(200));
          System.out.println(r.nextBoolean());
           System.out.println(r.nextDouble());//intre 0 si 1
           
           //Scanner s=new Scanner(System.in);
           //String val=s.nextLine();
           //System.out.println("S-a citit valoarea="+val);
           
           /*while(true)
           {
                String val=s.nextLine();
                System.out.println("S-a citit valoarea="+val);
                if(val.equals("exit"))
                {
                    break;
                }
            }*/
            
            
            
            
            //cititi de la tastatura un string si afisti-l invers
          /* Scanner b=new Scanner(System.in);
           String c=b.nextLine();
           StringBuilder sb=new StringBuilder(c);
           System.out.println(sb.reverse()); */
           
           
           //adunarea a 2 numere citite de la tastatura
           /*Scanner b=new Scanner(System.in);
           String c=b.nextLine();
           String d=b.nextLine();
           System.out.println(Integer.valueOf(c)+ Integer.valueOf(d));*/
           //daca puneam in syso direct c+d mi le concatena
           //puteam face si cu int i=Integer.valueOf(c); so in syso puneam i si j
           
           
           
           /*Scanner b=new Scanner(System.in);
           String c=b.nextLine();
           int nr=Integer.valueOf(c);
           for(int i=0; i<nr;i++)
           {
               Random r2=new Random();
               System.out.println(r2.nextInt(1000));
            }*/
            
            
            
           
           
           
           
        
        
    }
}