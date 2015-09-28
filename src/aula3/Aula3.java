package aula3;

import java.awt.font.GlyphMetrics;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 31240550
 */
public class Aula3 {

    public static void main(String[] args) throws IOException {
        FileReader data;

        try {
            data = new FileReader("C:/Temp/dataVoos.txt"); //alterar para o local do seu arquivo txt
            BufferedReader linha = new BufferedReader(data);
            String aux = linha.readLine();
            int valor = linha.read();
            char c = (char) valor;
            boolean ws = false;
            while (aux != null) {
                aux = linha.readLine();

                for (int i = 0; i < aux.length() && !ws; i++) {
                    System.out.println(c);
                    valor = data.read();
                    c = (char) valor;
                    if (Character.isWhitespace(aux.charAt(i))) {
                        ws = true;
                    }
                }
            }
//           
//                System.out.println(c);
//                valor = data.read();
//                c = (char) valor;

                data.close();

            }catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
            System.exit(0);
        }
        }
    }
