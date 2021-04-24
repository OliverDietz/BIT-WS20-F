import java.util.Scanner;

public class StaticTastatur {
	
	private static Scanner eingabe=new Scanner (System.in);

		public static String eingabeString() {
			return eingabe.nextLine();
		}
		
		public static int eingabeInt() {
			int zahl=eingabe.nextInt();
			eingabe.nextLine();
			return zahl;
		}
		public static double eingabeDouble() {
			double zahl=eingabe.nextDouble();
			eingabe.nextLine();
			return zahl;
		}
		public static float eingabefloat() {
			float zahl=eingabe.nextFloat();
			eingabe.nextLine();
			return zahl;
		}
		public static boolean eingabeBoolean() {
			boolean bool=eingabe.nextBoolean();
			eingabe.nextLine();
			return bool;
		}
		
}
