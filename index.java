import java.util.*;
public class index
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int real1,img1,real2,img2;
        System.out.println("Enter the real and imaginary part");
        real1=s.nextInt();
        img1=s.nextInt();
        System.out.println("Enter the real and imaginary part");
        real2=s.nextInt();
        img2=s.nextInt();
        int real=real1+real2;
        int img=img1+img2;
        System.out.println("The added complex number is:"+real+"+"+img+"i");
    }
}