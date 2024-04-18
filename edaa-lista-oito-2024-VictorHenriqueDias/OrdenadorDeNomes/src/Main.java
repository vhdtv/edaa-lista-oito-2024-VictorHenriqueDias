import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lerArquivoCSV();
    }

    public static ArrayList<String> lerArquivoCSV() {
        ArrayList<String> nomes = new ArrayList<>();
        String arquivoCSV = "C:\\Users\\vhdtv\\Desktop\\Faculdade\\Programação\\edaa-lista-oito-2024-VictorHenriqueDias\\OrdenadorDeNomes\\src\\estudantes_una_2024.csv";

        try {

            Scanner scanner = new Scanner(new File(arquivoCSV));

            // Lê linha por linha do arquivo
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                nomes.add(linha);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado: " + arquivoCSV);
            e.printStackTrace();
        }
        System.out.println("--Antes-- \n" + nomes);
        System.out.println("--Ordenando estudantes por nome--");
        nomes.remove(0);
        Collections.sort(nomes);
        for (String nome : nomes) {
            System.out.println("Nome:" + nome);
        }
        return nomes;
    }
}
