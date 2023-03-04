import java.util.LinkedList;

public class CircleToGcode {
    public static final double pi = 3.14159265358979323846;
    public static void main(String[] args) {
        /*
         given a starting point (a,b), and ending point (c,d), 
         the center of the circle (h,k), and the radius (r), and 
         clockwise or counter clockwise:

         (r cos(i * 2pi/n) + h, r sin(i * 2pi/n) + k)
         */
        double[] start = {0, 0};
        double[] end = {6, 6};
        double[] center = {0, 6};
        boolean clockwise = false;
        double r = 6;


        LinkedList<double[]> pointsOnCurve = new LinkedList<double[]>();
        if(clockwise){
            for(int i = 100; i > 0; i --){
                pointsOnCurve.add(new double[] {r * Math.cos(i * 2 * pi / 100) + center[0], r * Math.sin(i * 2 * pi / 100) + center[1]});
            }
        } else{
            for(int i = 1; i <= 100; i ++){
                pointsOnCurve.add(new double[] {r * Math.cos(i * 2 * pi / 100) + center[0], r * Math.sin(i * 2 * pi / 100) + center[1]});
            }
        }

    }
}

