
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;


// IMPORTANT!! REMEMBER THIS:
// 50 < X < 220
// 50 < Y < 220
public class PrinterWritingExtention {

	public static String user = "1082635";
	public static void main(String[] args) throws FileNotFoundException {
		// files and stuff
		File skeleton = new File("C:\\Users\\" + user + "\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\WitingBaseCode.gcode");
		File text_gcode = new File("C:\\Users\\" + user + "\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\text.gcode");
		File text_txt = new File("C:\\Users\\" + user + "\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\text.txt");

		// scanners
		Scanner textPs = new Scanner(text_txt);
		Scanner skeletonScanner = new Scanner(skeleton);
		PrintStream ps = new PrintStream(text_gcode);
		Scanner userInput = new Scanner(System.in);
		
		// text and specs
		System.out.print("Text input(0) or read file(1): ");
		boolean fileText = Integer.parseInt(userInput.nextLine()) == 1;

		String text = "";
		if(!fileText){
			System.out.print("What would you like to print: ");
			text = userInput.nextLine();
		}

		System.out.print("font size?: ");
		double fontSize = Double.parseDouble(userInput.nextLine());

		if(!fileText){
			writeUserText(skeletonScanner, text, fontSize, ps);
		} else{

		}

		userInput.close();
		skeletonScanner.close();
	}

	// takes the users text and turns it into gcode
	public static void writeUserText(Scanner skeletonScanner, String text, double fontSize, PrintStream ps) throws FileNotFoundException{
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
					if(x + (word.length() * (fontSize * 8 + 2)) > 220 ){
						y -= (fontSize * 13) + 2;
						x = 50;
						
						// if the word is still too long, check each letter before going to the next line
						if((word.length() * (fontSize * 8 + 2)) > 220){
							for(int i = 0; i < word.length();  i ++){
								if(x + (fontSize * 8 + 2) > 220){
									y -= (fontSize * 13) + 2;
									x = 50;
								}
								character newChar = new character(fontSize, new int[] {x, y}, word.charAt(i) + "");
								addNewCharacter(newChar, ps);
								x += (fontSize * 8) + 2;
							}

							// space
							x += (fontSize * 8) + 2;
							continue;
						}
					}

					// print word
					for(int i = 0; i < word.length();  i ++){
						character newChar = new character(fontSize, new int[] {x, y}, word.charAt(i) + "");
						addNewCharacter(newChar, ps);
						x += (fontSize * 8) + 2;
					}

					// space
					x += (fontSize * 8) + 2;
				}
				
			} 
			
			// copy base code
			else{
				ps.println(nextLine);
			}
		}
	}

	// gets and adds new character gcode
	public static void addNewCharacter(character newChar, PrintStream ps) throws FileNotFoundException{
		// one character
		ps.println();
		ps.println("G0 X" + newChar.orgin[0] + " Y" + newChar.orgin[1] + "; go to char orgin");
		ps.println("G0 Z0 ; lower to 0");
		ps.println("G91 ; relitive positioning");

		ps.println();

		// gets file
		File gcode;
		Scanner gcodeScanner;
		try {
			gcode = new File("C:\\Users\\" + user + "\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\characters\\" + newChar.name + ".gcode");
			gcodeScanner = new Scanner(gcode);
		} catch (Exception FileNotFoundException) {
			gcode = new File("C:\\Users\\" + user + "\\Documents\\GitHub\\3D-Printer-Writing-Extension\\gcodes\\characters\\box.gcode");
			gcodeScanner = new Scanner(gcode);
		}

		while(gcodeScanner.hasNext()){
			String gcodeLine = gcodeScanner.nextLine();
			
			// changes size if line is not a comment or moves up
			if(!gcodeLine.contains("G1 Z") && !gcodeLine.contains(";")){
				String[] gcodeLineToArr = gcodeLine.split(" ");

				// gets x and y and multiplys by size
				double x = Double.parseDouble(gcodeLineToArr[1].substring(1)) * newChar.size;
				double y = Double.parseDouble(gcodeLineToArr[2].substring(1)) * newChar.size;
				gcodeLineToArr[1] = "X" + x;
				gcodeLineToArr[2] = "Y" + y;

				//round
				x = Math.round(x * 10000.0) / 10000.0;
                y = Math.round(y * 10000.0) / 10000.0;

				// re-make line
				gcodeLine = "";
				for(int i = 0; i < gcodeLineToArr.length; i ++){
					gcodeLine += gcodeLineToArr[i] + " ";
				}

			}
			 ps.println(gcodeLine);
		}

		ps.println("G90 ; absolute positioning");
		ps.println("G1 Z1 ; raise a bit");
		gcodeScanner.close();
	}

}
