import java.util.*;
public class Main
{
	public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int a = sn.nextInt();
        int b = sn.nextInt();
        int[] animalFactors = new int[n];
        for (int i = 0;i<n ; i++){
            int pi = sn.nextInt();
            animalFactors[i] = pi;
        } 
        for (int i = 0;i<n ; i++){
            int factor = animalFactors[i];
            int numPredators = 0;
            int numWeek = 0;
            for (int j = 0;j<n ;j++){
                if(j != i){
                    int difference = factor - animalFactors[j];
                    if(difference >= a && difference < b){
                        numWeek++;
                    }
                    if(difference < 0 && difference > -b && difference <= -a){
                        numPredators++;
                    }
                }
            } 
                System.out.println(numPredators + " " + numWeek);

        } 
        
	}
}
