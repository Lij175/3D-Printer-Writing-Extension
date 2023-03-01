import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Queue;
import java.util.Scanner;

public class PrinterWritingExtention {

	public static void main(String[] args) throws FileNotFoundException {
		square squareCode = new square(10, new int[] {110,110});

		File skeleton = new File("C:\\Users\\1082635\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\WitingBaseCode.gcode");
		File square_gcode = new File("C:\\Users\\1082635\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\square.gcode");
		Scanner skeletonScanner = new Scanner(skeleton);
		PrintStream ps = new PrintStream(square_gcode);

		while (skeletonScanner.hasNext()) {
			String nextLine = skeletonScanner.nextLine();

			if(nextLine.equals("; Stuff Go Here")){
				ps.println(nextLine);
				addNewCharacter(squareCode, ps);
			} 
			
			else{
				ps.println(nextLine);
			}
			
		}

		Scanner sqareScanner = new Scanner(square_gcode);
		while (sqareScanner.hasNext()){
			System.out.println(sqareScanner.nextLine());
		}
	}

	public static void addNewCharacter(character newChar, PrintStream ps){
				Queue<String> gcodeLines = newChar.getLines();

				// one cube
				ps.println("G0 X" + newChar.orgin[0] + " Y" + newChar.orgin[1] + "; got to char orgin");
				ps.println("G0 Z0 ; lower to 0");

				ps.println("G91");

				for(int i = 0; i < gcodeLines.size(); i ++){
					ps.println(gcodeLines.peek());
					gcodeLines.add(gcodeLines.remove());
				}
				ps.println("G90");
				ps.println("G1 Z0.2 ; raise a bit");
	}

}
