import java.util.Scanner;

public class unicefProg {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //new Scanner object
        Ypalilos Lista[] = new Ypalilos[30];

        for (int i=0; i<30; i++) {       // we initialize all the elements of the array using an for loop
            Lista[i] = new Ypalilos();   
        }

        for (int y=0; y<30; y++) {
            System.out.println("Dwse mou ton basiko mistho tou Ypallilou [" + (y+1) + "]: ");
            double input = scanner.nextDouble();
            if(input>0) {                                 //  we used an if statement to check if the salary input is a positive number
                Lista[y].setSalary(input);
            } else {
                System.out.print("O misthos prepei na einai megaluteros tou 0 ( >0 )");
            }
        }

        // for (int z=0; z<Lista.length; z++) {                                           // used to check if the initialization was successfull
        //     System.out.println("Misthos [" + (z+1) +"]: " + Lista[z].getSalary());
        // }

        for (int x=0; x<Lista.length; x++) {     // loops through the array to calculate the contribution according to the sallary
            double sal = Lista[x].getSalary();
            if (sal <= 1000) {
                double contrib = sal* 5/100;  // if the montly sallary is < 1000 then contribution is at 5%
                Lista[x].setContribution(contrib);
            }
            if (sal > 1001 && sal <= 2000) {
                double contrib = sal* 8.5/100;   // if the montly sallary is < 1000 then contribution is at 8.5%
                Lista[x].setContribution(contrib);
            }
            if (sal > 2001) {
                double contrib = sal* 12/100;   // if the montly sallary is < 1000 then contribution is at 12%
                Lista[x].setContribution(contrib);
            }

            Lista[x].calculateFinalSalary();
        }

        for (int x1=0; x1<Lista.length; x1++) {         // we used a for loop to display the final montrly salary of each employee and the money contributed
            System.err.println("Telikos misthos tou upallilou [" + (x1+1) + "]: " + Lista[x1].getFinalSalary() + " ,suneisfora: " + Lista[x1].getContribution());
        }

        scanner.close();
    }  
}
