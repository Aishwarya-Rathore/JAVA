/*ware house inventory management:-
u are a owner of a ware house in which there are total n product 
with the following attributes:- 1. N = totalmnumber of product
2. for each product take the current stock and the minimum stock required
3. if any product is avilable in less than its minimum requirment than print "restock needed for product x",where is a product number.*/

import java.util.*;
public class ware_house{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of products : ");
        int N = sc.nextInt();
        int restock_needed = 0;
        for(int i=0;i<N;i++){
            System.out.print(" Enter the current stock for product "+(i+1)+" : ");
             int current_stock = sc.nextInt();
            System.out.print(" Enter the minimum stock required for product "+(i+1)+" : ");
           int minimum_stock = sc.nextInt();
            
            if(current_stock<minimum_stock){
                System.out.println("Restock needed for product "+(i+1));
                restock_needed++;
            }
            else{ 
                System.out.println("Restock is not needed for product "+(i+1));
            }
        }
        System.out.println("Total products needing restock: " + restock_needed);

        sc.close();


    }
}

