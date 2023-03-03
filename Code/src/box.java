
public class box extends character{

    box(){
        super();
    }

    box(int size, int[] orgin){
        super(size, orgin);
        name = "box";
        points = new int[4][2];
        points[0] = new int[] {8 * size, 0 * size};
        points[1] = new int[] {0 * size, 13 * size};
        points[2] = new int[] {-8 * size, 0 * size};
        points[3] = new int[] {0 * size, -13 * size};
    }



    
}
