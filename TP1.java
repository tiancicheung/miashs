package TP1;
import java.util.Scanner;


public class TP1 {
	private static final String Else = null;

	public static void main(String[] args) {
		System.out.println("Hello world");
		exercices6a();
	
	}
	public static void exercices1() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez le premier entier :");
		int premierEntier = scanner.nextInt();
		
		System.out.print("Entrez le deuxieme entier :");
		int deuxiemeEntier = scanner.nextInt();
		
		int somme = premierEntier + deuxiemeEntier;
		
		System.out.print("La somme des deux entiers est:" + somme);
		scanner.close();	
	
	}
		
	public static void exercices2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez la somme en Euros :");
		double sommeEnEuro = scanner.nextInt();
		
		System.out.print("Entrez le taux de change de CNY :");
		double tauxDechange = scanner.nextInt();
		
		double somme = sommeEnEuro * tauxDechange;
		
		System.out.print("La somme de CNY est :" + somme);
		scanner.close();		
				
	}

	public static void exercices3() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez la premiere valeur :");
		float reelle1 = scanner.nextFloat();
		
		System.out.print("Entrez la deuxieme valeur :");
		float reelle2 = scanner.nextFloat();
		
		System.out.print("Entrez la troisieme valeur :");
		float reelle3 = scanner.nextFloat();
		
		float max;
		float min;
		float moyenne;
		
		if(reelle1<reelle2){
		max = reelle2;
		min = reelle1;}
		else{
			max=reelle1;
			min=reelle2;
		}
		
		if(reelle3>max)
		moyenne=(reelle3+max)/2;
		else {
			if(reelle3>min)
				moyenne=(reelle3+max)/2;
			else moyenne = (min+max)/2;
				}
		
		System.out.print("la moyenne des 2 plus grandes est : " + moyenne);
		scanner.close();
	}
	
	public static void exercices4() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez l'heure :");
		int heure = scanner.nextInt();
		
		System.out.print("Entrez le minute :");
		int minute = scanner.nextInt();
		
		System.out.print("Entrez la seconde :");
		int seconde = scanner.nextInt();

		if(seconde >=60 && seconde <= 120) {
			seconde = seconde - 60;
			System.out.println(seconde);
			minute++;		
		}
		else seconde ++;
		
		if(minute>=60 && seconde <= 120) {
			heure++;
		}
		else minute ++;
		
		System.out.println("La seconde suivante :" + heure + ":" + minute + ":" + seconde);
			
		scanner.close();	
		
	}
	
	public static void exercices5() {
		
		
	}
	
	public static void exercices6() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Entrez le premier entier :");
		int n1 = scanner.nextInt();
		System.out.print("Entrez le deuxieme entier :");
		int n2 = scanner.nextInt();
		System.out.print("Entrez le troisieme entier :");
		int n3 = scanner.nextInt();
		System.out.print("Entrez le quartieme entier :");
		int n4 = scanner.nextInt();
		System.out.print("Entrez le cinquieme entier :");
		int n5 = scanner.nextInt();
		System.out.print("Entrez le sixieme entier :");
		int n6 = scanner.nextInt();
		System.out.print("Entrez le septieme entier :");
		int n7 = scanner.nextInt();
		System.out.print("Entrez le huitieme entier :");
		int n8 = scanner.nextInt();
		System.out.print("Entrez le neuvieme entier :");
		int n9 = scanner.nextInt();
		System.out.print("Entrez le dixieme entier :");
		int n10 = scanner.nextInt();
		
		int somme = n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10;
		int moy = (n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10) / 10;
		
		System.out.print("La somme des dix entiers est:" + somme + System.getProperty("line.separator") + "La moyenne des dix entiers est:" + moy );
		
		
		scanner.close();
		
	}

	public static void exercices6a() {
		Scanner scanner = new Scanner(System.in);
		int somme = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Entrez " + i + "eme entier :");	
			somme = somme + scanner.nextInt();
		}
		System.out.print("La somme des dix entiers est:" + somme + System.getProperty("line.separator") + "La moyenne des dix entiers est:" + somme / 10);	
		
		scanner.close();
	}
	
	public static void exercices7() {
		
	}
	
	
	
}