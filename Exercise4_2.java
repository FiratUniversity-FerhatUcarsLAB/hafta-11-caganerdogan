public class Exercise4_2 { // 1

    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { // 2
        zippo("rattle", 13); // 3
    } // 23

    public static void baffle(String blimp) { // 9, 15
        System.out.println(blimp); // 10, 16
        zippo("ping", -5); // 11, 17
    } // 13, 19

    public static void zippo(String quince, int flag) { // 4, 12, 18
        if (flag < 0) { // 5, 13, 19
            System.out.println(quince + " zoop"); // 14
        } else { // 6
            System.out.println("ik"); // 7
            baffle(quince); // 8
            System.out.println("boo-wa-ha-ha"); // 20
        } // 21
    } // 22
}

-----------

Programın son çıktıları:

ik
rattle
ping zoop
ping
ping zoop
boo-wa-ha-ha
