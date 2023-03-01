import java.util.Queue;

public class square extends character{

    square(){
        super();
    }

    square(int size){
        super(size);

        int[] arr = {0 * size, 0 * size};
        points.add(arr);

        int[] arr1 = {1 * size, 0 * size};
        points.add(arr1);

        int[] arr2 = {1 * size, 1 * size};
        points.add(arr2);

        int[] arr3 = {0 * size, 1 * size};
        points.add(arr3);
    }

    
}
