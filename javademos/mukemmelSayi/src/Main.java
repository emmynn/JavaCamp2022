public class Main {
    public static void main(String[] args) {
        //6 --> 6'yı tam sayı olarak bölenlerin toplamı eşitse mükemmel sayıdır.
        //6'nın bölenler 1,2 ve 3. Toplamı 6 yapıyor.
        //28
        int number = 28;
        int total = 0;

        for (int i = 1;i<number;i++){
            if(number % i ==0){
                total = total + i;
            }

        }

        if(total == number){
            System.out.println("Mükemmel sayıdır");
        }else{
            System.out.println("Mükemmel sayı değildir");
        }


    }
}