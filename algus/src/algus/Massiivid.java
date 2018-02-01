
package algus;
import java.util.Arrays;
/**
 *
 * @author if17
 */
public class Massiivid {
    //Koosta funktsioon, mis tagastab kaheelemendilise massiivi,
    //mille esimeseks elemendiks on etteantud arvudest suurim
    //ning teiseks vähim
    public static int[] piirid(int[]arvud){
        int[] vastus=new int[2];
      
        
    }
    public static int summa(int[]arvud){
        int summa=0;
        for(int i=0; i<arvud.length; i++){
            summa+=arvud[i];
        }
        return summa;
    }
public static double keskmine(int[] arvud){
    return summa(arvud)*1.0/arvud.length;
}
  public static void main (String[]arg){
  int[] pikkused=[176, 163, 158 171, 169];
    System.out.println(summa(pikkused));
    System.out.println(keskmine(pikkused));
    System.out.println("kokku: "+pikkused[pikkused.length-1]);
    System.out.println(pikkused[0]+" "+pikkused[pikkused.length-1]);
    for(int i=0; i<pikkused.length; i++){
    System.out.println(pikkused[i]);
    }
int summa=0;
for(int i=0; i<pikkused.length;i++){
    summa+=pikkused[i];
}
System.out.println(summa);
summa=0;
for(int pikkus: pikkused) {summa+=pikkus;}
System.out.println(summa);
System.out.println
}
}