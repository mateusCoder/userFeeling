import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userFeelingApplication {

	public static void main(String[] args) {
		
		String text;
		int happyCount = 0;
		int sadCount = 0;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("+------- MEDIDOR DE SENTIMENTO COMPASS -------+ \n");
		System.out.println("Digite uma frase: ");
		text = (read.nextLine());
		
		Pattern happyFace = Pattern.compile(":-\\)");  
		Matcher happy = happyFace.matcher(text); 
		
		Pattern sadFace = Pattern.compile(":-\\("); 
		Matcher sad = sadFace.matcher(text);  

		while(happy.find()){
		     happyCount++;		
		}

		while(sad.find()){
		     sadCount++;		
		}
		
		if(happyCount > sadCount){ 
			System.out.println("\n" + "divertido");
		}else if(sadCount > happyCount) {
			System.out.println("\n" + "chateado");
		}else {
			System.out.println("\n" + "neutro");
		}
	}
}
