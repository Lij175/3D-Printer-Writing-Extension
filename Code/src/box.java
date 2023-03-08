
public class box extends character{

    box(){
        super();
    }

    box(double size, int[] orgin){
        super(size, orgin);
        name = "box";
        gcode = "G0 X8 E0.2 \nG0 Y13 E0.2 \nG0 X-8 E0.2 \nG0 Y-13 E0.2";
        
    }



    
}
