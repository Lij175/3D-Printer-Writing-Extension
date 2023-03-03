import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Queue;
import java.util.Scanner;



// IMPORTANT REMEMBER THIS:
// 50 < X < 220
// 50 < Y < 220
public class PrinterWritingExtention {

	
	public static void main(String[] args) throws FileNotFoundException {

		// files and stuff
		//File skeleton = new File("C:\\Users\\1082635\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\WitingBaseCode.gcode");
		//File box_gcode = new File("C:\\Users\\1082635\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\box.gcode");

		File skeleton = new File("C:\\Users\\ejyst\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\WitingBaseCode.gcode");
		File box_gcode = new File("C:\\Users\\ejyst\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\square.gcode");

		//?
		// scanners
		Scanner skeletonScanner = new Scanner(skeleton);
		PrintStream ps = new PrintStream(box_gcode);
		Scanner userInput = new Scanner(System.in);

		// text and specs
		System.out.print("What would you like to print: ");
		String text = userInput.nextLine();

		System.out.print("font size?: ");
		int fontSize = userInput.nextInt();

		//loop to write gcode
		while (skeletonScanner.hasNext()) {
			String nextLine = skeletonScanner.nextLine();

			// will copy stuff from base code unless stuff needs to go here
			if(nextLine.equals("; Stuff Go Here")){
				// print stuff go here
				ps.println(nextLine);

				// initialization of stuff
				int x = 50;
				int y = 220;
				String[] words = text.split(" ");


				for(String word : words){
					// if word length goes past bound go to new line
					if(x + (word.length() * (fontSize * 8 + 1)) > 220 ){
						y -= (fontSize * 13) + 2;
						x = 50;
					}

					// print word
					for(int i = 0; i < word.length();  i ++){
						box boxCode = new box(fontSize, new int[] {x, y});
						addNewCharacter(boxCode, ps);
						x += (fontSize * 8) + 1;
					}

					// space
					x += (fontSize * 8) + 1;
				}
				
			} 
			
			// copy base code
			else{
				ps.println(nextLine);
			}
			
		}

		// print file 
		/*
		Scanner sqareScanner = new Scanner(box_gcode);
		while (sqareScanner.hasNext()){
			System.out.println(sqareScanner.nextLine());
		}
		 */
		
	}

	public static void addNewCharacter(character newChar, PrintStream ps){
				Queue<String> gcodeLines = newChar.getLines();

				// one character
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
				ps.println("G1 Z1 ; raise a bit");
	}

}
