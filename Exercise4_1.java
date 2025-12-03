public class Exercise4_1 {

    /**
     * Tarihi Amerikan formatında (Ay, Gün, Yıl, Haftanın Günü) yazdırır.
     * Örnek: Çarşamba, Aralık 3, 2025
     *
     * @param day Haftanın günü (örneğin: "Çarşamba")
     * @param date Ayın günü (örneğin: 3)
     * @param month Ay adı (örneğin: "Aralık")
     * @param year Yıl (örneğin: 2025)
     */
    public static void printAmerican(String day, int date, String month, int year) {
        // Amerikan formatı: [Haftanın Günü], [Ay] [Gün], [Yıl]
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    /**
     * Tarihi Avrupa formatında (Haftanın Günü, Gün Ay Yıl) yazdırır.
     * Örnek: Çarşamba 3 Aralık 2025
     *
     * @param day Haftanın günü (örneğin: "Çarşamba")
     * @param date Ayın günü (örneğin: 3)
     * @param month Ay adı (örneğin: "Aralık")
     * @param year Yıl (örneğin: 2025)
     */
    public static void printEuropean(String day, int date, String month, int year) {
        // Avrupa formatı: [Haftanın Günü] [Gün] [Ay] [Yıl]
        System.out.println(day + " " + date + " " + month + " " + year);
    }

    public static void main(String[] args) {
        // Test için örnek bir tarih tanımlayalım
        String dayOfWeek = "Carsamba"; // Çarşamba -> Carsamba
        int dateOfMonth = 3;
        String monthName = "Aralik"; // Aralık -> Aralik
        int yearNumber = 2025;

        System.out.println("### Java Tarih Yazdirma Testi ###"); // Yazdırma -> Yazdirma
        System.out.println("------------------------------------");

        System.out.print("Amerikan Formati: "); // Formatı -> Formati
        // printAmerican metotunu çağır
        printAmerican(dayOfWeek, dateOfMonth, monthName, yearNumber);

        System.out.print("Avrupa Formati:   "); // Formatı -> Formati
        // printEuropean metotunu çağır
        printEuropean(dayOfWeek, dateOfMonth, monthName, yearNumber);
    }
}
