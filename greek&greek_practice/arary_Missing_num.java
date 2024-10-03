
// package greek&greek_practice;

import java.util.Scanner;




public class arary_Missing_num {



    public static void main(String[] args) {
            int array[]={1,2,3,5};
            int sumOfelement=0;
            int sumupto_n = 0;
            for(int i=1;i<=5;i++){
                sumupto_n+= i;
               int index= i-1;
               if(index<=5-2){
                   sumOfelement +=array[index];
                   
               }
               
                
            }
            System.out.println(sumOfelement);
            System.out.println(sumupto_n);
            
           int missing_num= sumupto_n-sumOfelement;
           
            System.out.println(missing_num);
            
       
       }
        
  

    }

