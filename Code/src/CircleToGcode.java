import java.util.LinkedList;

public class CircleToGcode {
    public static final double pi = 3.1415926;
    public static void main(String[] args) {
        /*
         given a starting point (a,b), and ending point (c,d), 
         the center of the circle (h,k), and the radius (r), and 
         clockwise or counter clockwise:

         (r cos(i * 2pi/n) + h, r sin(i * 2pi/n) + k)
         */
        double[] start = {0, 0};
        double[] end = {6, 6};
        double[] center = {0, 0};
        boolean clockwise = !false;
        double r = 1;
        int n = 10;


        LinkedPointList pointsOnCurve = new LinkedPointList();
        if(clockwise){
            for(int i = n; i > 0; i --){
                double x = r * Math.cos(i * ((2 * pi) / n)) + center[0];
                double y = r * Math.sin(i * ((2 * pi) / n)) + center[1];

                x = Math.round(x * 10000.0) / 10000.0;
                y = Math.round(y * 10000.0) / 10000.0;

                pointsOnCurve.add(new double[] {x, y});
            }
        } else{
            for(int i = 1; i <= n; i ++){
                double x = r * Math.cos(i * ((2 * pi) / n)) + center[0];
                double y = r * Math.sin(i * ((2 * pi) / n)) + center[1];

                x = Math.round(x * 10000.0) / 10000.0;
                y = Math.round(y * 10000.0) / 10000.0;

                pointsOnCurve.add(new double[] {x, y});
            }
        }

        System.out.println(pointsOnCurve.toString());
        

    }
}

