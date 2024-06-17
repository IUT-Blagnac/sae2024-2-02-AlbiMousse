package iut.sae.algo;

import java.util.Scanner;

public class unRLEConsole{

    public static void main(String[] args){
        String in="";
        
        if(args.length>0){
            in=args[0];
        }
        else{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Chaine à transformer : ");
            in = scanner.next();

            scanner.close();
        }

        System.out.println("Entrée : "+in);
        try{
            long start = System.nanoTime();
            String result = Algo.unRLE(in);
            System.out.println("Sortie : "+ result);
            System.out.println("Time for completion : " + ((System.nanoTime() - start)/1000));
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}