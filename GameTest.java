import java.util.Scanner;

class GameTest{
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        final int Minimum = 20;
        final int Maximum = 1;
        final String attack = "1 = ataque";
        final String defend = "2 = defiende";
        final String dodge = "3 = esquiva";
        final String enemyAttack = "el enemigo attaca";
        final String enemyDefend = "el enemigo defiende";
        final String enemyDodge = "el enemigo esquiva";

        int lifeEnemy = 50;
        int lifeMe = 50;
        System.out.println("Tu enemigo tiene " + lifeEnemy + " de vida y tu tienes " + lifeMe + " ¿que deseas hacer? (escribe el numero)");
        System.out.println(attack);
        System.out.println(defend);
        System.out.println(dodge);

        while(lifeEnemy > 0 && lifeMe > 0){

            int playerChoice = input.nextInt();

            int enemyChoice = (int) ((Math.random()*3)+1);

            if(playerChoice == 1){
                int attackDamage = (int) (Math.random()*(Maximum-Minimum+1));
                if(enemyChoice == 1){
                    System.out.println("El enemigo ataca");
                    lifeEnemy = (int) (lifeEnemy + (Math.random()*(10-Minimum+1)));
                    lifeMe = (int) (lifeMe + (Math.random()*(10-Minimum+1)));
                }
                if(enemyChoice == 2){
                    System.out.println("El enemigo defiende");
                    lifeEnemy = (int) ((lifeEnemy + Math.random()*(15-Minimum+1)));
                }
                if(enemyChoice == 3){
                    System.out.println("El enemigo intenta esquivar");
                    if(Math.random()<0.3){
                        System.out.println("El enemigo logra esquivar");
                    }
                    else{
                        lifeEnemy = (int) (lifeEnemy + (Math.random()*(Maximum-Minimum+1)));
                    }
                }
            }

            if(playerChoice == 2){
                int attackDamage = (int) (Math.random()*(Maximum-Minimum+1));
                if(enemyChoice == 1){
                    System.out.println("El enemigo ataca");
                    lifeMe = (int) (lifeMe + (Math.random()*(15-Minimum+1)));
                }
                if(enemyChoice == 2){
                    System.out.println("El enemigo defiende");
                }
                if(enemyChoice == 3){
                    System.out.println("El enemigo intenta esquivar");
                }
            }

            if(playerChoice == 3){
                int attackDamage = (int) (Math.random()*(Maximum-Minimum+1));
                if(enemyChoice == 1){
                    if(Math.random()<0.3){
                        System.out.println("Logras esquivar");
                    }
                    else{
                        lifeMe = (int) (lifeMe + (Math.random()*(Maximum-Minimum+1)));
                    }
                }
                if(enemyChoice == 2){
                    System.out.println("El enemigo defiende");
                }
                if(enemyChoice == 3){
                    System.out.println("El enemigo intenta esquivar");
                }
            }
            System.out.println("vida enemigo " + lifeEnemy);
            System.out.println("mi vida " + lifeMe);
            System.out.println("opciones: ");
            System.out.println(attack);
            System.out.println(defend);
            System.out.println(dodge);
        }
        if(lifeEnemy <= 0 && lifeMe <= 0 ){
            System.out.println("Ambos pierden");
        }
        if(lifeEnemy <= 0){
            System.out.println("Ganas");
        }
        else{
            System.out.println("Pierdes");
        }
    }
}