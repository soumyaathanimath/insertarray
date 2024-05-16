/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insertarray;

/**
 *
 * @author dell1
 */
public class Insertarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int A[]=new int[10];
        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
        
        int n=6;
        
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");
     
        int x=20;
        int index=2;
        
        for(int i=n;i>index;i--)
            A[i]=A[i-1];
        A[index]=x;
        
        for(int i=0;i<n;i++)
            System.out.print(A[i]+",");
        System.out.println("");   
        
    }
    
    
   /* Left Rotation
    public static void main(String[] args) 
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");
        
        int temp=A[0];
        
        for(int i=1;i<A.length;i++)
        {
            A[i-1]=A[i];
        }
        A[A.length-1]=temp;
        
        for(int x:A)
            System.out.print(x+",");
        System.out.println("");

    }   */
}
    
    
