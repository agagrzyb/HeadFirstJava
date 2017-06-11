package JavaBasics;

public class Basics {

	public static void main (String [] args){
		//While Loop
		int x = 1;
		System.out.println("Before loop...");
		while(x < 4){
			System.out.println("Inside loop...");
			System.out.println("Value x = " + x);
			x = x + 1;
		}
		System.out.println("Outside the loop...");
		System.out.println("---If statement---");
		int x2 = 3;
		if(x2 == 3){
			System.out.println("x2 value has to be 3");
		}
		System.out.println("This line will always execute");
		int x3 = 2;
		if(x == 3){
			System.out.println("x3 value has to be 3");
		}else{
			System.out.println("x3 is not 3 !");
		}
		System.out.println("This line will always execute");
		int x4 =1;
		while (x4 < 3){
			System.out.print("Doo");
			System.out.print("Bee");
			x4 = x4 +1;
		}if (x4 == 3){
			System.out.print("Do");
		}
		System.out.println("\n---------");
		int iloscButelek = 99;
		String slowo = "bottles";
		while(iloscButelek >0){
			if(iloscButelek == 1){
				slowo = "bottle";
			}
			System.out.println(iloscButelek + " " + slowo + " of beer on the wall");
			System.out.println(iloscButelek + " " + slowo + " of beer");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			iloscButelek = iloscButelek - 1;
			if(iloscButelek > 0){
				System.out.println("Ilosc butelek " + " " + slowo + " of beer on the wall");	
			}else{
				System.out.println("No more bottles of beer on the wall");
			}
		}System.out.println("Krasomowca :");
		String [] listaSlow1 = {"architektura wielowarstwowa" , "30000 metrow", "rozwiazanie B-d-B", "aplikacja kliencka",
				"interfejs internetowy", "inteligentna karta", "rozwiazani dynamiczne", "szesc sigma", "przenikliwosc"};
		String [] listaSlow2 = {"zwieksza mozliwosci", "poprawia atrakcyjnosc", "pomnaza wartosc", "opracowana na",
				"bazujaca na", "rozproszona", "sieciowa", "skoncentrowana na", "odniesiona na wyzszy poziom", "skierowanej", "udostepniona"};
		String [] listaSlow3 = {"procesu", "punktu wpisywania", "rozwiazania", "strategii", "paradygmatu", "portalu", "witryny", "wersji","misji"};
		//okreslenie ile jest slow w kazdej z list
		int lista1Length = listaSlow1.length;
		int lista2Length = listaSlow2.length;
		int lista3Length = listaSlow3.length;
		//generacja trzech losowych slow (lub zwrotow)	
		int rnd1 = (int)(Math.random() * lista1Length);
		int rnd2 = (int)(Math.random() * lista2Length);
		int rnd3 = (int)(Math.random() * lista3Length);
		//stworzenie zdania
		String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];
		System.out.println("To jest to czego nam trzeba : " + zdanie);

	}
}
