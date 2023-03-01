import java.util.LinkedList;
import java.util.Queue;

public class character {
    int size;
    Queue<int[]> points = new LinkedList<>();

    character(){
        size = 1;
    }

    character(int size){
        this.size = size;
    }
}

