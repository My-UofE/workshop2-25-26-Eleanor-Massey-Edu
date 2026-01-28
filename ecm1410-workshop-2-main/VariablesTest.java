public class VariablesTest {
    public static void main(String[] args){
        int x = 4;
        System.out.println("x: " + x);
        long s_per_min = 60;
        byte s_per_day = (byte) (s_per_min*60*24);
        System.out.println("s_per_min: " + s_per_min);
        System.out.println("s_per_day: " + s_per_day);

        float area = 20.3F;
        char a = '\u5468', b = '\\';
        int nHours = 022;
        double ratio = 7/5;
        System.out.println("area: " + area);
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("nhours: " + nHours);
        System.out.println("ratio: " + ratio);

        double d1 = 0.29/0.0001;   // should both be 2900
        double d2 = 0.00029*1.0e7;
        System.out.println("d1: " + d1);
        System.out.println("d2: " + d2);
        System.out.println("d1 equals d2: " + (d1 == d2) );  // for floating point, this is not helpful
        double epsilon = 1e-10;  // this is the tolerance
        if (Math.abs(d1 - d2) < epsilon) {
            System.out.print("d1,d2 differ by less than ");
            System.out.println(epsilon);
        }    
    }
}
