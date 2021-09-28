public class q1
{
    public static void main(String[] args)
    {
        int a=0,b=1,p;
        int len=args.length;
       System.out.print(len+",");
        for(int i=0;i<len;i++){
            p = Integer.parseInt(args[i]);
            a+=p;
            b*=p;
        }
    System.out.print(a+","+b);

    }   
}
