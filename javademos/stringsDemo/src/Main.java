public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : "+mesaj.length());
        System.out.println("5. eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" Yaşasın!")); // Boşluk da bir karakter
        System.out.println(mesaj);
        // Mesaj ilk baştakini baz alır.
        // Çünkü mesaj.concat dediğimizde yeni bir string oluyor.
        // Bu sebeple yeni bir değişkene atamamız lazım mesaj2 gibi.

        /*System.out.println(mesaj.startsWith("A")); // java küçük büyük harfe duyarlıdır!
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5, karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a')); //"a" olarak da yazılabilir. İlk bulfuğunu verir.
        System.out.println(mesaj.indexOf("av"));
        System.out.println(mesaj.lastIndexOf('e'));
        System.out.println(mesaj.lastIndexOf('a')); //Baştan index numarasını verir aramaya sağdan başlar
*/
        String yeniMesaj = mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2)); //mesajın 2.indexinden itibaren al
        System.out.println(mesaj.substring(2,4));//4.indexi dahil etmiyor

        for(String kelime : mesaj.split(" ")){ // parçalıyor
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase()); //Tüm mesajı küçük harfe çeviriyor
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim()); //Mesajın başındaki ve sonundaki boşlukları atmak için



    }
}