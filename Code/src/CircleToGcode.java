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
        double start = pi;
        double end = 2 * pi;
        boolean clockwise = false;
        double rcos = 4;
        double rsin = 4;
        int n = 50;

        ArrayList<double[]> pointsOnCurve = new ArrayList<double[]>();
        if(clockwise){
            for(double i = start - (2 * pi / n); i >= end; i -= (2 * pi / n)){
                double x = rcos * Math.cos(i);
                double y = rsin * Math.sin(i);

                x = Math.round(x * 10000.0) / 10000.0;
                y = Math.round(y * 10000.0) / 10000.0;

                pointsOnCurve.add(new double[] {x, y});
            }
        } 
        else{
            for(double i = start + (2 * pi / n); i <= end; i += (2 * pi / n)){
                double x = rcos * Math.cos(i);
                double y = rsin * Math.sin(i);

                x = Math.round(x * 10000.0) / 10000.0;
                y = Math.round(y * 10000.0) / 10000.0;

                pointsOnCurve.add(new double[] {x, y});
            }
        }

        for(int i = 0; i < pointsOnCurve.size(); i ++){
            double[] point = pointsOnCurve.get(i);
            System.out.println("(" + point[0] + ", " + point[1] + ")");
        }

        System.out.println("\nGCODE:");

        double[] prevPoint = new double[] {rcos * Math.cos(start), rsin * Math.sin(start)};
        for(int i = 0; i < pointsOnCurve.size(); i ++){
            double[] currPoint = pointsOnCurve.get(i);
            double x = currPoint[0] - prevPoint[0];
            double y = currPoint[1] - prevPoint[1];

            x = Math.round(x * 10000.0) / 10000.0;
            y = Math.round(y * 10000.0) / 10000.0;

            System.out.println("G0 X" + x + " Y" + y + " E0.2");
            prevPoint = currPoint;
        }
    }
}

