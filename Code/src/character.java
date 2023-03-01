import java.util.LinkedList;
import java.util.Queue;

public class character {
    int size;
    int[][] points;

    character(){
        size = 1;
    }

    character(int size){
        this.size = size;
    }

    public Queue<String> getLines() {
        Queue<String> gcodeLines = new LinkedList<>();
        for(int i = 0; i < points.length; i ++){
            gcodeLines.add("G0 X" + points[i][0] + " Y" + points[i][1]);
        }

        return gcodeLines;
    }
}

