import java.util.Scanner;

class gambling{

    public static void main(String[]args){

        boolean jackpot = false;
        int attepmts=0;
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        while(!jackpot){

            System.out.println("Press enter to roll.");
            Scanner entrada = new Scanner(System.in);
            entrada.nextLine();

            for(int i = 0; i<10; i++){

                numero1 = (int) (Math.random()*(10));
                System.out.println(numero1);

            }

            for(int i = 0; i<10; i++){

                numero2 = (int) (Math.random()*(10));
                System.out.println(numero1 + "|" + numero2);

            }

            for(int i = 0; i<10; i++){

                numero3 = (int) (Math.random()*(9-1)+1);
                System.out.println(numero1 + "|" + numero2 + "|" + numero3);

            }

            if(numero1 == numero2 && numero1 == numero3 && numero2 == numero3){

                System.out.println("JACKPOT!!!");
                jackpot = true;

            }   
            attepmts=attepmts+1;
             System.out.println("try number: "+attepmts);
            
            if(attepmts=numero1*111){
                System.out.println("DOUBLE JACKPOT OMG WOAH FUCK YEAH WOAH")
            }

        }

    }

}
