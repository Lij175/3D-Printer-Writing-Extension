import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrinterWritingExtention {

	public static void main(String[] args) throws FileNotFoundException {
		square square = new square(1);

		File skeleton = new File("C:\\Users\\1082635\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\WitingBaseCode.gcode");
		File square_gcode = new File("C:\\Users\\1082635\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\square.gcode");
		Scanner skeletonScanner = new Scanner(skeleton);
		PrintStream ps = new PrintStream(square_gcode);
		while (skeletonScanner.hasNext()) {
			String nextLine = skeletonScanner.nextLine();
			if(nextLine.equals("; Stuff Go Here")){
				ps.println(nextLine);
				Queue<String> gcodeLines = square.getLines();
				for(int i = 0; i < gcodeLines.size(); i ++){
					ps.println(gcodeLines.peek().toString());
					gcodeLines.add(gcodeLines.remove());
				}
				ps.println(gcodeLines.peek());
			} else{
				ps.println(nextLine);
			}
			
		}


		Scanner sqareScanner = new Scanner(square_gcode);
		while (sqareScanner.hasNext()){
			System.out.println(sqareScanner.nextLine());
		}

		
	}

}
