import java.util.Scanner;
public class palandromicPattern{
  public static void main(String args[]){

   Scanner sc= new scanner(System.in); 
   int n=sc.nextInt();
   int a,b,c;
   for( a = 1;a<=n;a++){
   for( b = 1;b<=n-a;b++){
   System.out.print(" ");
   }
   for(b = a;b>0;b--){
   System.out.print(b);
   }
   for(b=2;b<=a;b++){
   System.out.print("b");
    }
   }
   System.out.println();
 }
}