
public class box extends character{

    box(){
        super();
    }

    box(double size, int[] orgin){
        super(size, orgin);
        name = "box";
        points = new double[4][2];
        points[0] = new double[] {8 * size, 0 * size};
        points[1] = new double[] {0 * size, 13 * size};
        points[2] = new double[] {-8 * size, 0 * size};
        points[3] = new double[] {0 * size, -13 * size};
    }



    
}
