/**
 * 
 */
package sumaYresta;
import java.util.*;
/**
 * @author juanm
 *
 */
public class SumarYRestar {
	static Scanner sc;
	static int a;
	static int b;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		sc = new Scanner(System.in);

	}
	public static int sumarNumeros() {
		System.out.println("Introduce el primer número");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce le segundo número");
		b = Integer.parseInt(sc.nextLine());
		return a+b;
	}
}
