import java.util.ArrayList;

public class CircleToGcode {
        public static void main(String[] args) {
        /*
         given a starting point (a,b), and ending point (c,d), 
         the center of the circle (h,k), and the radius (r), and 
         clockwise or counter clockwise:

         (r cos(i * 2pi/n) + h, r sin(i * 2pi/n) + k)
         */

        double pi = 3.1415926;
        double start = 2 * pi;
        double end = 3 * pi / 2;
        double[] center = {0, 0};
        boolean clockwise = !false;
        double r = 1;
        int n = 20;

        ArrayList<double[]> pointsOnCurve = new ArrayList<double[]>();
        if(clockwise){
            for(double i = start - (2 * pi / n); i >= end; i -= (2 * pi / n)){
                double x = r * Math.cos(i) + center[0];
                double y = r * Math.sin(i) + center[1];

                x = Math.round(x * 10000.0) / 10000.0;
                y = Math.round(y * 10000.0) / 10000.0;

                pointsOnCurve.add(new double[] {x, y});
            }
        } 
        else{
            for(double i = start + (2 * pi / n); i <= end; i += (2 * pi / n)){
                double x = r * Math.cos(i) + center[0];
                double y = r * Math.sin(i) + center[1];

                x = Math.round(x * 10000.0) / 10000.0;
                y = Math.round(y * 10000.0) / 10000.0;

                pointsOnCurve.add(new double[] {x, y});
            }
        }

        for(int i = 0; i < pointsOnCurve.size(); i ++){
            double[] point = pointsOnCurve.get(i);
            System.out.print("(" + point[0] + ", " + point[1] + ") --> ");
        }
    }
}

