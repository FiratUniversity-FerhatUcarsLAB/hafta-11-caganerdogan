public class Multadd {

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    
    }

    public static double expSum(double x) {
    // e^(-x) ifadesini bir değişkende tutmak, hem okunurluğu artırır hem de hesaplamayı hızlandırır.
        double exp_minus_x = Math.exp(-x); 
        return x * exp_minus_x + (1 - exp_minus_x);
    }

    public static void main(String[] args) {
        // a) multadd(1.0, 2.0, 3.0)
        double test_a = multadd(1.0, 2.0, 3.0);
        System.out.println("a) multadd(1.0, 2.0, 3.0) sonucu (1*2 + 3): " + test_a); 
        
        // b) sin(pi/4) + cos(pi/4) / 2
        // İfadeyi multadd(1.0, sin(pi/4), cos(pi/4)/2) olarak kullandık.
        double sin_val = Math.sin(Math.PI / 4.0);
        double cos_val = Math.cos(Math.PI / 4.0);
        double test_b = multadd(1.0, sin_val, cos_val / 2.0);
        System.out.println("b) sin(pi/4) + cos(pi/4) / 2 sonucu: " + test_b);

        // c) log(10) + log(20)
        // Java'daki Math.log() doğal logaritmayı (ln) hesaplar.
        // İfadeyi multadd(1.0, log(10), log(20)) olarak kullandık.
        double log10 = Math.log(10.0);
        double log20 = Math.log(20.0);
        double test_c = multadd(1.0, log10, log20);
        System.out.println("c) log(10) + log(20) sonucu (ln(10) + ln(20)): " + test_c);
        
        // expSum testi (opsiyonel ancak tam bir çözüm için eklenmiştir)
        System.out.println("\nexpSum(5.0) sonucu: " + expSum(5.0));
    
    }
}


