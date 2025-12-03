public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // Cevabiniz: // 1) Hiçbir şey olmaz. Derleyici, getNumber() metodunu çağırır, 
        //             // metot 42 değerini döndürür, ancak bu dönüş değeri hiçbir 
        //             // değişkene atanmadığı veya bir ifade içinde kullanılmadığı 
        //             // için göz ardı edilir. Kod derlenir ve çalışır.

        // 2) void metodu ifade içinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Cevabiniz: // 2) Derleme hatası oluşur. sayHello() metodu 'void' tipinde 
        //             // olduğu için bir değer döndürmez. System.out.println() 
        //             // ise kendisine verilen tüm ifadelerin bir değere sahip 
        //             // olmasını bekler. 'void' bir değer olmadığı için 
        //             // toplama (+) işlemi yapılamaz ve Java derleyicisi 
        //             // "void cannot be dereferenced" (ya da benzeri) 
        //             // şeklinde bir hata verir.

    }
}
