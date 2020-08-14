/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
/**
 *
 * @author ELCOT
 */
public class NewClass {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a[]=new int[20];
        int n,t,i,j;
        System.out.println("Enter the length");
        n=obj.nextInt();
        System.out.println("Enter"+n+"elements:");
        
        for ( i=0;i<n;i++)
        {
           a[i]=obj.nextInt();
        }
    
    
    


    
        for ( i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
   
       for ( i=0;i<n;i++)
        {
            for( j=i+1;j<n;j++)
            {
             if(a[i]==a[j])
             {
                 System.out.println("Duplicate no:"+a[i]);
            } 
             
        }
    }
       
    
        for(i=0;i<n;i++) 
          {
           if(a[i]%2==0)
           {
               System.out.println(a[i]+"is even");
           }
           else
           {
               System.out.println(a[i]+"is odd");
           }
       }
       
     
         for(i=0;i<n;i++) 
         {
            for(j=i+1;j<n;j++)
            {
               if(a[i]>a[j])
               {
                 t=a[i];
                 a[i]=a[j];
                 a[j]=t;
               
}
}  
}           
            System.out.println(a[n-2]);
         
    }
}

  
        

      
  


