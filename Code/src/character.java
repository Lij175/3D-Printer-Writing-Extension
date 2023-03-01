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

    public Queue<String> getLines() {
        Queue<String> gcodeLines = new LinkedList<>();
        for(int i = 0; i < points.size(); i ++){
            gcodeLines.add(points.peek().toString());
            points.add(points.remove());
        }

        return gcodeLines;
    }
}

