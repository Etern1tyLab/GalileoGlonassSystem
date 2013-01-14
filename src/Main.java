import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;



public class Main {

	static ArrayList<MessageStorage> Messages;
	
	public static void main(String[] args) {
	
		if ((args[0]!=null || args[1]!=null)){
		//Проверяем наличие входных данных	
		File file = new File(args[0]);
				//Проверяем наличие файла с данными	
				if(file.exists()){
					String imei = (args[1]);
						//Проверяем imei	
						if (imei.length()==15){
							
							ParseTxt ParseTxt = new ParseTxt();
							try {
								Messages = ParseTxt.processLineByLine(file, imei );
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								System.out.println("Error : " + e + ". Try again.");
								System.exit(1);
							}
							System.out.println("Loaded : " + Messages.size() + " messages.");
							try {
								DataSend.main(Messages);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								System.out.println("Error : " + e + ". Try again.");
							}
						
						}
						else {
							System.out.println("Wrong IMEI number. Imei number must contain 15 numbers. ");
							System.exit(1);
						}
				}
				else {
					System.out.println("File with adress: " + args[0] + ", is not found,try again. ");
					System.exit(1);
				}
		
		}
		else {
			System.out.println("Incorrect data. Try again. Incomming data format: 'File adress , Imei-number'");
			System.exit(1);
		}
					
	}
	
}
