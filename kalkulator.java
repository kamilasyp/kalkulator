import java.io.*;
public class kalkulator {
	

	public static void main (String[] args) 
	throws IOException{
		double x;
		double a=0;
		double b=0; 
		double suma, roznica, iloczyn, iloraz, potega, pierwiastek; 
		char wybor=0; 

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Witaj w programie kalkulator. ");
		System.out.println("Wybierz dzia³anie matematyczne, które chcesz wykonaæ. ");
		System.out.println("1. Dodawanie ");
		System.out.println("2. Odejmowanie");
		System.out.println("3. Mno¿enie");
		System.out.println("4. Dzielenie"); 
		System.out.println("5. Pierwiastek");
		System.out.println("6. Potêga");
		
		x=Double.parseDouble(br.readLine());
		
		if(x==1) wybor=1;
		if(x==2) wybor=2;
		if(x==3) wybor=3;
		if(x==4) wybor=4;
		if(x==5) wybor=5;
		if(x==6) wybor=6;
		
		
		
		switch(wybor) {
		
		case 1: {
			suma=0; 
			System.out.println("Wybrano: Dodawanie. ");
			System.out.println("Podaj wartosc liczby a.");
			a=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", a);
			System.out.println();
			System.out.println("Podaj wartosc liczby b.");
			b=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", b);
			System.out.println();
			suma=a+b; 
			System.out.printf ("Suma wynosi: ");
			System.out.printf("%2.2f",suma);
		}
			break;
		
		case 2:{
			roznica=0;
			
			System.out.println("Wybrano: Odejmowanie. ");
			System.out.println("Podaj wartosc liczby a.");
			a=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", a);
			System.out.println();
			System.out.println("Podaj wartosc liczby b.");
			b=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", b);
			System.out.println();
			roznica=a-b;
			System.out.printf ("Ró¿nica "+a, "oraz", +b,"  wynosi: " +roznica);
		}
			
			break;
			
		case 3:{
			iloczyn=0;
			
			System.out.println("Wybrano: Mno¿enie. ");
			System.out.println("Podaj wartosc liczby a.");
			a=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", a);
			System.out.println();
			System.out.println("Podaj wartosc liczby b.");
			b=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", b);
			System.out.println();
			iloczyn=a*b;
			System.out.printf ("Iloczyn "+a, "oraz", +b,"  wynosi: " +iloczyn);
		}
			
			break;
			
		case 4:{
			iloraz=0;
			
			System.out.println("Wybrano: Dzielenie. ");
			System.out.println("Podaj wartosc liczby a.");
			a=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", a);
			System.out.println();
			System.out.println("Podaj wartosc liczby b.");
			b=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", b);
			System.out.println();
			iloraz=a/b;
			System.out.printf ("Iloraz  liczby "+a, "oraz", +b," wynosi: " +iloraz);
		}
			
			break; 
			
		case 5:{
			pierwiastek=0;
			
			System.out.println("Wybrano: Pierwiastek. ");
			System.out.println("Podaj liczbê, która bêdzie pierwiastkowana.");
			a=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", a);
			
			System.out.println();
			pierwiastek=Math.sqrt(a);
			System.out.printf ("Pierwiastek  liczby "+a+ " wynosi: " +pierwiastek);
		}
			
			break; 
			
		case 6:{
			potega=0;
			
			System.out.println("Wybrano: Potêga. ");
			System.out.println("Podaj wartosc liczby a.");
			a=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", a);
			System.out.println();
			System.out.println("Podaj wartosc potegi.");
			b=Double.parseDouble(br.readLine());
			System.out.printf("%2.2f", b);
			System.out.println();
			potega=Math.pow(a, b);
			System.out.printf ("Potêga stopnia "+b+ " liczby "+a+ " wynosi: " +potega);
		}
			
			break; 
		
		}
		
		
}
	
}