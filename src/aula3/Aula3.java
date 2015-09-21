
package aula3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 31240550
 */
public class Aula3 {

    public static void main (String[] args) throws IOException {
        FileReader data;
        
        try {
            data = new FileReader("C:/Temp/dataVoos.txt"); //alterar para o local do seu arquivo txt
            BufferedReader linha = new BufferedReader(data);
            String aux = linha.readLine();
            int valor = linha.read();
            char c = (char) valor;
            
            while (aux != null) {
                int i = 0;
                while(valor ) {//rever método
                    System.out.print(c);
                    valor = linha.read();
                    c = (char) valor;
                    if (!aux.equalsIgnoreCase(" ")) {
                        System.out.println(c);
                    }
                }
                System.out.println(aux);
                aux = linha.readLine();
            }
            
//            while(valor != -1) {
//                System.out.println(c);
//                valor = linha.read();
//                c = (char) valor;
//            }
            data.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
            System.exit(0);
        }
    }
    
}
