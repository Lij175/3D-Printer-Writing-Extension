import java.util.LinkedList;
import java.util.Queue;

public class character {
    double size;
    double[][] points;
    int[] orgin;
    String name;

    character(){
        size = 1;
    }

    character(double size, int[] orgin){
        this.size = size;
        this.orgin = orgin;
    }

    public Queue<String> getLines() {
        Queue<String> gcodeLines = new LinkedList<>();
        for(int i = 0; i < points.length; i ++){
            gcodeLines.add("G0 X" + points[i][0] + " Y" + points[i][1] + " E0.2");
        }
        
        return gcodeLines;
    }
}

