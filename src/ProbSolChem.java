import java.util.Scanner;

public class ProbSolChem
{


    public static void main(String[] args) {

        int Carbon, Hydrogen, Oxygen;
        Scanner sc  = new Scanner(System.in);

        Carbon = sc.nextInt(); Hydrogen = sc.nextInt(); Oxygen = sc.nextInt();


        int rem, temp;
        if(Hydrogen < Oxygen)
        {
            rem = Hydrogen/2;//5
            Oxygen -= rem; //95
            Hydrogen -= rem * 2; //1
            System.out.println("H2O: " + rem);
            System.out.println(Carbon + " " + Hydrogen + " " + Oxygen);
        }
        else
            {
                temp = Hydrogen;
                rem = Oxygen; //11
                if (Hydrogen >= Oxygen*2) {Hydrogen -= rem * 2; Oxygen = 0;}
                else
                    {
                        Oxygen -= Hydrogen/2;  Oxygen=0;
                    }
                System.out.println("H2O" + temp/2);
                System.out.println(Carbon  + " " +  Hydrogen+ " " +  Oxygen);


            }

        if( Oxygen < Carbon )
        {
            rem =  Oxygen/2;
            Carbon  -= rem;
            Oxygen -= rem * 2;
            System.out.println("CO2: " + rem);
            System.out.println(Carbon  + " " + Hydrogen + " " +  Oxygen);
        }
        else
            {
            rem = Carbon ;
            if ( Oxygen >= Carbon *2) { Oxygen -= Carbon  * 2; Carbon = 0;}
            else
                {
                Oxygen /= 2; Carbon  -=  Oxygen;
                }
            System.out.println("CO2: " + rem);
            System.out.println(Carbon + " " + Hydrogen + " " +  Oxygen);


        }



        if(Hydrogen < Carbon )
        {
            rem = Hydrogen/4;
            Carbon -= rem;
            Hydrogen -= rem * 4;
            System.out.println("Methane CH4: " + rem);
            System.out.println(Carbon  + " " + Hydrogen + " " +  Oxygen);
        }
        else
            {
            rem = Hydrogen;
            if (Hydrogen >= Carbon *4) {Hydrogen -= Carbon  * 4; Carbon  = 0;}
            else {
                Hydrogen /= 4; Carbon  -= Hydrogen;
            }
            System.out.println("Methane CH4 " + rem);
            System.out.println(Carbon  + " " + Hydrogen + " " +  Oxygen);

        }

    }
}
