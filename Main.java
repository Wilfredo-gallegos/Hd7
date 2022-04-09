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
 * @author Wilfredo Gallegos
 *
 */

public class Main {
    public static void main(String[] args) {
    	Scanner teclado = new Scanner(System.in);
		System.out.println("------TRADUCTOR-----");
		System.out.println("Ingrese la ruta del archivo .txt a leer:");
    	String ruta = teclado.next();
        ArrayList<Association> dictionary = new ArrayList<>();
        Lector lector = new Lector();
        ArrayList<String> words = lector.leerDiccionario(ruta);
        ArrayList inOrder = new ArrayList();
        String[] lista1;
        String palabra;
        String key = "";
        String value = "";
        boolean stay = true;
		while(stay==true) {
	        System.out.println("Que traduccion desea llevar a cabo?: \n"
					+"1. Ingles a espanol \n"
					+"2. Espanol a ingles \n"
					+"3. Ingles a frances \n"
					+"4. Frances a ingles \n"
					+"5. Espanol a frances \n"
					+"6. Frances a espanol \n"
					+"7. Salir \n");
	        String opcion = teclado.nextLine();
	        try {
	        	Integer opcion1= Integer.parseInt(opcion);
	        	if(opcion1 == 1) {

	                System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
	                String rutaTexto = teclado.next();
	                for (int i = 0; i < words.size(); i++) {
	                    palabra = words.get(i);
	                    palabra = palabra.replaceAll("\\(", "");
	                    palabra = palabra.replaceAll("\\)", "");
	                    lista1 = palabra.split(",");
	                    key = lista1[0];
	                    System.out.println(key);
	                    value = lista1[1];
	                    dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
	                }
	                BinaryTree arbolbinario = new BinaryTree<>();
	                for (int i = 0; i < dictionary.size(); i++) {
	                    arbolbinario.add(dictionary.get(i));
	                }

	                arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

	                String text = lector.leerTexto(rutaTexto);
	                System.out.println("Texto a traducir: "+text);
	                boolean existe = false;
	                String[] splittedText = text.split(" ");
	                String newText = "";

	                for (int i = 0; i < splittedText.length; i++) {
	                    existe = false;
	                    for (int j = 0; j < dictionary.size(); j++) {
	                        if (splittedText[i].equals(dictionary.get(j).key)) {
	                            newText += dictionary.get(j).value + " ";
	                            existe = true;
	                        }
	                    }
	                    if (existe == false) {
	                        newText += "*" + splittedText[i] + "*" + " ";
	                    }
	                }

	                System.out.println("\n" + newText);
	                System.out.println("Gracias por usar el traductor");
	            }
	                if(opcion1 == 2) {

	                System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
	                String rutaTexto = teclado.next();
	                for (int i = 0; i < words.size(); i++) {
	                    palabra = words.get(i);
	                    palabra = palabra.replaceAll("\\(", "");
	                    palabra = palabra.replaceAll("\\)", "");
	                    lista1 = palabra.split(",");
	                    key = lista1[1];
	                    value = lista1[0];
	                    dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
	                }
	                BinaryTree arbolbinario = new BinaryTree<>();
	                for (int i = 0; i < dictionary.size(); i++) {
	                    arbolbinario.add(dictionary.get(i));
	                }

	                arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

	                String text = lector.leerTexto(rutaTexto);
	                System.out.println("Texto a traducir: "+text);
	                boolean existe = false;
	                String[] splittedText = text.split(" ");
	                String newText = "";

	                for (int i = 0; i < splittedText.length; i++) {
	                    existe = false;
	                    for (int j = 0; j < dictionary.size(); j++) {
	                        if (splittedText[i].equals(dictionary.get(j).key)) {
	                            newText += dictionary.get(j).value + " ";
	                            existe = true;
	                        }
	                    }
	                    if (existe == false) {
	                        newText += "*" + splittedText[i] + "*" + " ";
	                    }
	                }

	                System.out.println("\n" + newText);
	                System.out.println("Gracias por usar el traductor");
	            }
	                if(opcion1 == 3) {

	                System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
	                String rutaTexto = teclado.next();
	                for (int i = 0; i < words.size(); i++) {
	                    palabra = words.get(i);
	                    palabra = palabra.replaceAll("\\(", "");
	                    palabra = palabra.replaceAll("\\)", "");
	                    lista1 = palabra.split(",");
	                    key = lista1[0];
	                    value = lista1[2];
	                    dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
	                }
	                BinaryTree arbolbinario = new BinaryTree<>();
	                for (int i = 0; i < dictionary.size(); i++) {
	                    arbolbinario.add(dictionary.get(i));
	                }

	                arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

	                String text = lector.leerTexto(rutaTexto);
	                System.out.println("Texto a traducir: "+text);
	                boolean existe = false;
	                String[] splittedText = text.split(" ");
	                String newText = "";

	                for (int i = 0; i < splittedText.length; i++) {
	                    existe = false;
	                    for (int j = 0; j < dictionary.size(); j++) {
	                        if (splittedText[i].equals(dictionary.get(j).key)) {
	                            newText += dictionary.get(j).value + " ";
	                            existe = true;
	                        }
	                    }
	                    if (existe == false) {
	                        newText += "*" + splittedText[i] + "*" + " ";
	                    }
	                }

	                System.out.println("\n" + newText);
	                System.out.println("Gracias por usar el traductor");
	            }
	                if(opcion1 == 4) {//Traduce de frances a ingles

	                System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
	                String rutaTexto = teclado.next();
	                for (int i = 0; i < words.size(); i++) {
	                    palabra = words.get(i);
	                    palabra = palabra.replaceAll("\\(", "");
	                    palabra = palabra.replaceAll("\\)", "");
	                    lista1 = palabra.split(",");
	                    key = lista1[2];
	                    value = lista1[0];
	                    dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
	                }
	                BinaryTree arbolbinario = new BinaryTree<>();
	                for (int i = 0; i < dictionary.size(); i++) {
	                    arbolbinario.add(dictionary.get(i));
	                }

	                arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

	                String text = lector.leerTexto(rutaTexto);
	                System.out.println("Texto a traducir: "+text);
	                boolean existe = false;
	                String[] splittedText = text.split(" ");
	                String newText = "";

	                for (int i = 0; i < splittedText.length; i++) {
	                    existe = false;
	                    for (int j = 0; j < dictionary.size(); j++) {
	                        if (splittedText[i].equals(dictionary.get(j).key)) {
	                            newText += dictionary.get(j).value + " ";
	                            existe = true;
	                        }
	                    }
	                    if (existe == false) {
	                        newText += "*" + splittedText[i] + "*" + " ";
	                    }
	                }

	                System.out.println("\n" + newText);
	                System.out.println("Gracias por usar el traductor");
	            }
	                if(opcion1 == 5) {

	                System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
	                String rutaTexto = teclado.next();
	                for (int i = 0; i < words.size(); i++) {
	                    palabra = words.get(i);
	                    palabra = palabra.replaceAll("\\(", "");
	                    palabra = palabra.replaceAll("\\)", "");
	                    lista1 = palabra.split(",");
	                    key = lista1[1];
	                    value = lista1[2];
	                    dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
	                }
	                BinaryTree arbolbinario = new BinaryTree<>();
	                for (int i = 0; i < dictionary.size(); i++) {
	                    arbolbinario.add(dictionary.get(i));
	                }

	                arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

	                String text = lector.leerTexto(rutaTexto);
	                System.out.println("Texto a traducir: "+text);
	                boolean existe = false;
	                String[] splittedText = text.split(" ");
	                String newText = "";

	                for (int i = 0; i < splittedText.length; i++) {
	                    existe = false;
	                    for (int j = 0; j < dictionary.size(); j++) {
	                        if (splittedText[i].equals(dictionary.get(j).key)) {
	                            newText += dictionary.get(j).value + " ";
	                            existe = true;
	                        }
	                    }
	                    if (existe == false) {
	                        newText += "*" + splittedText[i] + "*" + " ";
	                    }
	                }

	                System.out.println("\n" + newText);
	                System.out.println("Gracias por usar el traductor");
	            }
	                if(opcion1 == 6) {//Traduce de frances a español

	                System.out.println("Ingrese la ruta del archivo de texto que desea traducir");
	                String rutaTexto = teclado.next();
	                for (int i = 0; i < words.size(); i++) {
	                    palabra = words.get(i);
	                    palabra = palabra.replaceAll("\\(", "");
	                    palabra = palabra.replaceAll("\\)", "");
	                    palabra = palabra.replaceAll(".", "");
	                    lista1 = palabra.split(",");
	                    key = lista1[2];
	                    value = lista1[1];
	                    dictionary.add(new Association(key.toUpperCase(), value.toUpperCase()));
	                }
	                BinaryTree arbolbinario = new BinaryTree<>();
	                for (int i = 0; i < dictionary.size(); i++) {
	                    arbolbinario.add(dictionary.get(i));
	                }

	                arbolbinario.recInOrder(arbolbinario.getRoot(),inOrder);

	                String text = lector.leerTexto(rutaTexto);
	                System.out.println("Texto a traducir: "+text);
	                boolean existe = false;
	                String[] splittedText = text.split(" ");
	                String newText = "";

	                for (int i = 0; i < splittedText.length; i++) {
	                    existe = false;
	                    for (int j = 0; j < dictionary.size(); j++) {
	                        if (splittedText[i].equals(dictionary.get(j).key)) {
	                            newText += dictionary.get(j).value + " ";
	                            existe = true;
	                        }
	                    }
	                    if (existe == false) {
	                        newText += "*" + splittedText[i] + "*" + " ";
	                    }
	                }

	                System.out.println("\n" + newText);
	                System.out.println("Gracias por usar el traductor");
	            }
	                if(opcion1==7) {
	                	System.out.println("gracias por su visita");
	                	stay=false;
	                }else {
	                	System.out.println("El numero ingresado esta fuera del rango");
	    				System.out.println(" ---Presione enter para continuar---");
	    				teclado.nextLine();
	                }

	        }catch (Exception e) {
				System.out.println("lo ingresado no fue numero\n");
				System.out.println(" ---Presione enter para continuar---");
				teclado.nextLine();

	        }
		}

	}

}
