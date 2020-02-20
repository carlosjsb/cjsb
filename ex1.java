import java.util.Scanner;
import java.util.Random;

public class ex1{

    public static void main(String[] args){

        int[] intervalo = new int [2500];


        int i,j,aux,resto;


        
        System.out.println("\n\n NUMEROS DIVIDIDOS POR 11 COM RESTO 5");
        

        for(i=0;i<2500; i++){
            // intervalo[i]=i+1;
            resto=i%11;
            if(resto == 5 ){
                System.out.printf("%d ",i);
            }

        }
        
        System.out.println("\n\n NUMEROS PARES");
        
        for(i=0;i<2500; i++){

            resto = i % 2;
            if(resto == 0){
                System.out.printf("%d ", i);
            }
        }
               
        System.out.println("\n\n NUMEROS IMPARES\n");
        
        for(i=0;i<2500; i++){
            
            resto = i % 2;
            if(resto == 1){
                System.out.printf("%d ",i); 
            }
        }
    } 
}