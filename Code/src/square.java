
public class square extends character{

    square(){
        super();
    }

    square(int size){
        super(size);
        points = new int[4][2];
        points[0] = new int[] {0 * size,0 * size};
        points[1] = new int[] {1 * size,0 * size};
        points[2] = new int[] {1 * size,1 * size};
        points[3] = new int[] {0 * size,1 * size};
    }

    

    
}
