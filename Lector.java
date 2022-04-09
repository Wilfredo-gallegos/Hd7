import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Wilfredo Gallegos
 *
 */
public class Lector {
		/**public String Leer(String direccion){ //direccion del archivo
		    
		    String texto = "";
		    
		    try{
		        BufferedReader bf = new BufferedReader(new FileReader(direccion));
		        String temp = "";
		        String bfRead;
		        while((bfRead = bf.readLine()) != null){ 
		            //haz el ciclo, mientras bfRead tiene datos
		            temp = temp + bfRead+"\n"; //guardado el texto del archivo
		        }
		        
		        texto = temp;
		        
		    }catch(Exception e){ 
		        System.err.println("No se encontro archivo");
		        }
		        
		        return texto;
		       
		   }
		**/
		
	    public ArrayList<String> leerDiccionario(String rutadiccionario) {
	        String path = rutadiccionario;
	        ArrayList<String> words = new ArrayList<>();

	        try (Stream<String> fileStream = Files.lines(Paths.get(path))) {
	            fileStream.forEach(item -> {
	                words.add(item.toUpperCase());
	            });


	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return words;
	    }

	    /**
	     * 
	     * @param rutatexto
	     * @return words
	     */
	    public String leerTexto(String rutatexto) {
	        String path = rutatexto;
	        String words =  "";
	        ArrayList<String> text = new ArrayList<>();

	        ArrayList<String> listaLinea = new ArrayList<String>();
			ArrayList<String> lista = new ArrayList<String>();
			String palabra = "";
			
			/**for (int i=0;i<s.length();i++) {
				if(!((s.charAt(i)+"").equals("(")||(s.charAt(i)+"").equals(")")||(s.charAt(i)+"").equals(" ")||(s.charAt(i)+"").equals("'")  )) {
					palabra += s.charAt(i)+"";
					
				}else if((s.charAt(i)+"").equals(" ")) {
					listaLinea.add(palabra);
					palabra = "";
				}
			}
			listaLinea.add(palabra);
	        **/
	        try (Stream<String> fileStream = Files.lines(Paths.get(path))) {
	            fileStream.forEach(item -> {
	                text.add(item.toUpperCase());
	            });
	        } catch (IOException e) {
	            e.printStackTrace();
	            System.out.println("este es el error");
	        }

	        for (int i = 0; i < text.size(); i++) {
	            words += text.get(i) + " ";
	        }
	        return words;
	    }
}
