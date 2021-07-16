//Importing the java built in library or module for user input
import java.util.Scanner;


public class RotateArray{



         //Initializing a memory space x for storing an array
        
          static  int[] x={1,2,3,4,5,6,7};
         
           //Taking user input for rotation
           /*Initializing a memory space n for storing the 
            number of times you want to rotate that array
            */
          static int n;
          
           
          



    //Method rotate Array
    public static void rotateArray(){
       


          //Taking user input for rotation
           /*Initializing a memory space n for storing the 
            number of times you want to rotate that array
            */
           int n;
           Scanner k=new Scanner(System.in);
           System.out.println("Enter rotation count:");
           n=k.nextInt();
        
        
           
         


      for(int i=0;i<n;i++){
          int j,first;
          first=x[0];

          for(j=0;j<x.length-1;j++){
              x[j]=x[j+1];
          }
          x[j]=first;
      }

       System.out.println();
         

         //Displays the result after rotation
         System.out.println("Array after rotation:");
         for(int i=0;i<x.length; i++){
             System.out.print(x[i] + ""); 
         }

        
    }

    //Main method of the program
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7};
        int even=0;
        int odd=0;

        //loop to find even and odd to sum
        for(int i=0;i<x.length; i++){
            if(i%2==0){
                even +=x[i];
            }
            else{
                odd+=x[i];
            }
        }

        

        //Displaying the array
        System.out.println("The randomly generated integers are:");
       for(int index=0;index< x.length;index++){
            System.out.println( x[index] + "");
      }
         
          
          
          System.out.println("Sum of numbers at even indexes" + "="+even);
          System.out.println("Average of numbers at odd indexes" + "="+odd/n);

          

           rotateArray();


         

    }

      






     
}