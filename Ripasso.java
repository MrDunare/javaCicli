import java.util.Random;
import java.util.Scanner;

public class Ripasso {

	public static void main(String[] args) {
		
		int myNum;
		myNum = 10;
		
		long mylong = myNum ;
		
		byte myByte = (byte ) myNum;
		
		System.out.println(myByte);
		
		//CASTING
		
		double saldo = 9.99;
		
		int example = (int) saldo;
		
		// tipoDato nomeVariabile = (tipodato) nomeAltraV
		
		System.out.println(example);
		
		
		
		
		//Metodo Random
		
		
		Random random = new Random();
		
		int numero1 = random.nextInt(3);
		
		System.out.println(numero1);
		
		
		
		//Scanner
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Inserisci una stringa : ");
		
		String testo = key.next();
		
		System.out.println("Hai scrito :" + testo);
		
		key.close();

	}

}
