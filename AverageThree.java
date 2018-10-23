public class AverageThree {

 public static void main (String[] args) {

   int i,j,k;
   float average;
   i= Integer.parseInt(args[0]);
   j= Integer.parseInt(args[1]);
   k= Integer.parseInt(args[2]);
   average =(float)(i+j+k)/3;
   System.out.println ("The average of the numbers: "+ i +", "+ j + ", " + k+ " is: " + average);
   }
}