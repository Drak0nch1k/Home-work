import java.util.Random;

public class Main {
    public static Random numGen = new Random();

    public static int generateRandomdage(){
        int rand = Math.abs((20) +  numGen.nextInt(45));
        return rand;
    }




    public static void main(String[] args) {
        System.out.println(generateRandomdage());



        int temperature = 20;

        if (generateRandomdage() <= 20 && temperature > 30) ;
        System.out.println("Понидельник");
        noWalk();

        if (generateRandomdage() <= 45 || temperature > 18) ;
        System.out.println("Вторник");
        walk();

        if (generateRandomdage() >= 25 && !(temperature == 24)) ;
        System.out.println("Среда");
        noWalk();

        if (generateRandomdage() <= 45 && temperature < -10) ;
        System.out.println("Чтверг");
        noWalk();

        if (generateRandomdage() <= 45 || temperature == 20) ;
        System.out.println("Пятница");
        walk();

    }

    public static void walk() {
        System.out.println("Можно идти гулять");
    }

    public static void noWalk() {
        System.out.println("Остовайсесь дома");
    }

}


