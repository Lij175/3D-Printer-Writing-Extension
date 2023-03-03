import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Queue;
import java.util.Scanner;



// IMPORTANT REMEMBER THIS:
// 50 < X < 235
// 50 < Y < 235
public class PrinterWritingExtention {

	
	public static void main(String[] args) throws FileNotFoundException {
		//File skeleton = new File("C:\\Users\\1082635\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\WitingBaseCode.gcode");
		//File box_gcode = new File("C:\\Users\\1082635\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\box.gcode");

		File skeleton = new File("C:\\Users\\ejyst\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\WitingBaseCode.gcode");
		File box_gcode = new File("C:\\Users\\ejyst\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\square.gcode");

		Scanner skeletonScanner = new Scanner(skeleton);
		PrintStream ps = new PrintStream(box_gcode);

		System.out.println("What would you like to print: ");
		Scanner userInput = new Scanner(System.in);
		String text = userInput.nextLine();

		while (skeletonScanner.hasNext()) {
			String nextLine = skeletonScanner.nextLine();

			if(nextLine.equals("; Stuff Go Here")){
				ps.println(nextLine);

				int x = 50;
				int y = 235;
				for(int i = 0; i < text.length();  i ++){
					box boxCode = new box(1, new int[] {x, y});
					if(text.charAt(i) != ' '){
						addNewCharacter(boxCode, ps);
					}

					// if not end of line update x, else new line and restart x
					if((x + (boxCode.size * 8)) < 235){
						x += (boxCode.size * 8) + 1;
					} else{
						y -= (boxCode.size * 13) + 2;
						x = 50;
					}



				}
			} 
			
			else{
				ps.println(nextLine);
			}
			
		}

		Scanner sqareScanner = new Scanner(box_gcode);
		while (sqareScanner.hasNext()){
			System.out.println(sqareScanner.nextLine());
		}
	}

	public static void addNewCharacter(character newChar, PrintStream ps){
				Queue<String> gcodeLines = newChar.getLines();

				// one cube
				ps.println();
				ps.println("G0 X" + newChar.orgin[0] + " Y" + newChar.orgin[1] + "; go to char orgin");
				ps.println("G0 Z0 ; lower to 0");

				ps.println("G91 ; relitive positioning");

				ps.println();
				ps.println("; " + newChar.name);

				for(int i = 0; i < gcodeLines.size(); i ++){
					ps.println(gcodeLines.peek());
					gcodeLines.add(gcodeLines.remove());
				}

				ps.println("G90 ; absolute positioning");
				ps.println("G1 Z0.2 ; raise a bit");
				ps.println();
	}

}
