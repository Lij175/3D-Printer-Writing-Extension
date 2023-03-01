public class square extends character{

    square(){
        super();
    }

    square(int size){
        super(size);

        int[] arr = {0 * size,0* size};
        points.add(arr);

        arr[0] = 1 * size;
        arr[1] *= size;
        points.add(arr);

        arr[0] *= size;
        arr[1] = 1 * size;
        points.add(arr);

        arr[0] = 0 * size;
        arr[1] *= size;
        points.add(arr);
    }
}
