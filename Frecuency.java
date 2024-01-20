import java.util.Scanner;

public class Frecuency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] arr = new int [10];

        for(int x = 0; x < arr.length; x++) {
            System.out.print("Enter an integer " + (x+1) + ": ");
            int y = input.nextInt();
            arr[x] = y;
        }

        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count =  1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }

            if(fr[i] != visited)
              fr[i] = count;
        }

        System.out.println("------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
              System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("------------------------");

        input.close(); //de kserw an xreiazetai praktika, thewritika nai.

    }
    
}
