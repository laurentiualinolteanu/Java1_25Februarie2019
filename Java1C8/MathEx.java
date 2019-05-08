public class MathEx
{
    public static void main(String[] args)
    {
        int a=2;
        int b=3;
        long t1=System.currentTimeMillis();
        
        
        
        if(a>=b)
            System.out.println(a);
        else
            System.out.println(b);//3
            
            //System.exit(0);//de aici nu mai face nimic
            
        //maximul dintre a si b
        System.out.println(Math.max(a,b)); //3 
        
        System.out.println(Math.sqrt(16));//4.0
        
        //floor pt a rotunji
        //cats la int ca sa fie nr intreg
        //*100 ca sa fie nr intre 1 si 100
        System.out.println(Math.random());
        System.out.println(Math.floor(Math.random()*100));//imi afiseaza un nr intre[0,1)
        System.out.println((int)(Math.random()*100));//sa nu fie double
        
           long t2=System.currentTimeMillis(); 
           
         System.out.println(t2-t1);  
         
        //siruri de carcatere
     
         String c="c";
         String d=new String("d");
            
    }
    
    
}