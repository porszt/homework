import java.util.Random;

public class HomeWork1 {

    public static void main(String[] args) {

        Random random = new Random();

        int randomInt = random.nextInt(100);
        double randomDouble = (double) randomInt;

        int rounded = (int) Math.round(randomDouble);

        if(rounded == randomDouble){
            System.out.println(rounded +" and "+ randomDouble + " are equal");
        } else {
            System.out.println(rounded +" and "+ randomDouble + " are not equal");
        }


    }
}
