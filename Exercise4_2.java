public class Exercise4_2 { // 1

    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { // 2
        zippo("rattle", 13); // 3
    } // 20

    public static void baffle(String blimp) { // 9
        System.out.println(blimp); // 10
        zippo("ping", -5); // 11
    } // 16

    public static void zippo(String quince, int flag) { // 4, 12
        if (flag < 0) { // 5, 13
            System.out.println(quince + " zoop"); // 14
        } else { // 6
            System.out.println("ik"); // 7
            baffle(quince); // 8
            System.out.println("boo-wa-ha-ha"); // 18
        } // 19
    } // 15, 21 - Not: 15. ve 21. sırada metot bitişi (return) gerçekleşir.
}

-----------

Programın son çıktıları:

ik
rattle
ping zoop
boo-wa-ha-ha

-----------

    baffle metoduna ilk gönderilen blimp parametresinin değeri: rattle
