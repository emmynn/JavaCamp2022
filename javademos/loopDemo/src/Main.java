public class Main {
    public static void main(String[] args) {
        //For

        //Ardışık sayılar
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Döngü Bitti!");

        // Ardışık tek sayılar
        for (int x = 1; x <= 10; x+=2) {
            System.out.println(x);
        }
        System.out.println("Döngü Bitti!");

        // Ardışık çift sayılar
        for (int z = 0; z <= 10; z+=2) {
            System.out.println(z);
        }
        System.out.println("For Döngüsü Bitti!");

        //While
        int i = 1;
        while(i<10){
            System.out.println(i);
            i++;
        }
        System.out.println("While Döngüsü Bitti!");

        // Do while
        int j = 1;
        do {
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti!");
        //While ve Do-While döngüsünün farkı şu; While'da eğer şart gerçekleşmiyorsa döngü hiç çalılmaz ekrana bir şey vermez.
        // Fakat Do_while'da ise şartı sağlamasa bile dögü çalışır, ekrana verir ve bitirir.
        // Mesela j=100 dersek 10'dan küçük değil bu sebeple ekrana 100 yazar ve bitirir.

    }

}
