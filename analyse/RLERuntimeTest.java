package iut.sae.algo;

import java.util.Scanner;

/*
 * RLERuntimeTest
 * Ecrit par Alban-Moussa ESTIENNE
 */

public class RLERuntimeTest{

    final static String STRINGRLE = "aaabbzzzed";
    final static String STRINGUNRLE = "3a2b3z1e1d";
    public static void main(String[] args){
        String in = "";
        
        if(args.length>0){
            in = args[0];
        }
        else{
            Scanner scanner = new Scanner(System.in);

            System.out.println("Que voulez vous tester (RLE/UNRLE) : ");
            in = scanner.next();

            scanner.close();
        }

        long start = System.nanoTime();
        String result = "";
        int intermediateTime = 0;
        
        for (int i = 0; i < 50; i++){
            result = tester(in);

            intermediateTime += ((System.nanoTime() - start)/1000);
        }

        System.out.println("------ Résultats des tests ------");
        System.out.println("Méthode testée : " + in);
        if (in.equals("RLE")){
            System.out.println("Chaine testée : "+ STRINGRLE);
        }else{
            System.out.println("Chaine testée : "+ STRINGUNRLE);
        }
        System.out.println("Résultat de l'opération : "+ result);
        System.out.println("Temps d'exécution pour 50 itérations : " + intermediateTime + "µs");
        System.out.println("Temps d'exécution moyen : " + (intermediateTime/50) + "µs");
        System.out.println("---------------------------------");
    }

    public static String tester(String in){
        try{
            String result = "";
            
            if (in.equals("RLE")){
                result = Algo.RLE(STRINGRLE);
                Algo.RLE(STRINGRLE);
            }else{
                result = Algo.unRLE(STRINGUNRLE);
                Algo.unRLE(STRINGUNRLE);
            }
            return result;

        }catch (Exception e ){
            e.printStackTrace();
            return "";
        }
    }
}