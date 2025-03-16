package br.com.alura;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import br.com.alura.client.ClientHttpConfiguration;
import br.com.alura.service.AbrigoService;
import br.com.alura.service.PetService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class AdopetConsoleApplication {

    public static void main(String[] args) {
    	
    	CommandExecutor executor = new CommandExecutor();
    	
        System.out.println("##### BOAS VINDAS AO SISTEMA ADOPET CONSOLE #####");
        try {
            int opcaoEscolhida = 0;
            while (opcaoEscolhida != 5) {
            	exibirMenu();
            	String textoDigitado = new Scanner(System.in).nextLine();
                opcaoEscolhida = Integer.parseInt(textoDigitado);

                switch (opcaoEscolhida) {
				case 1 -> executor.executeCommand(new ListarAbrigoCommand());
				case 2 -> executor.executeCommand(new CadastrarAbrigoCommand());
				case 3 -> executor.executeCommand(new ListarPetsDoAbrigoCommand());
				case 4 -> executor.executeCommand(new ImportarPetsDoAbrigoCommand());
				case 5 -> System.exit(0);
				default -> System.out.println("NÚMERO INVÁLIDO!");
				}
              } 
        	}
        	catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void exibirMenu() {
        
    	System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
        System.out.println("1 -> Listar abrigos cadastrados");
        System.out.println("2 -> Cadastrar novo abrigo");
        System.out.println("3 -> Listar pets do abrigo");
        System.out.println("4 -> Importar pets do abrigo");
        System.out.println("5 -> Sair");
    }
}
