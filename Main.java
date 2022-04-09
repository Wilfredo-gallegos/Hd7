 import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;
/**
 * 
 */

/**
 * @author ThinkPad T470
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lector Lector = new Lector();
		Scanner teclado = new Scanner(System.in);
		System.out.println("------TRADUCTOR-----");
		System.out.println("Ingrese la ruta del archivo .txt a leer:");
		String ruta = teclado.nextLine();
		String texto = Lector.Leer(ruta);
		System.out.println(texto);
		ArrayList<Association> dictionary = new ArrayList<>();
		BinaryTree A_binario = new BinaryTree<>();
		boolean stay = true;
		while(stay==true) {
	        System.out.println("Que traduccion desea llevar a cabo?: \n"
					+"1. Ingles a espanol \n"
					+"2. Espanol a ingles \n"
					+"3. Ingles a frances \n"
					+"4. Frances a ingles \n"
					+"5. Espanol a frances \n"
					+"6. Frances a espanol \n");
	        String opcion = teclado.nextLine();
	        try {
	        	Integer opcion1= Integer.parseInt(opcion);
	        }catch (Exception e) {
				System.out.println("lo ingresado no fue numero o no esta en el rango\n");
				System.out.println(" ---Presione enter para continuar---");
				teclado.nextLine();
	        }
		}

	}

}
