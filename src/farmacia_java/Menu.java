package farmacia_java;

import java.io.IOException;
import java.util.Scanner;

import farmacia_java.model.Cosmetico;
import farmacia_java.model.Medicamento;
import farmacia_java.util.Cores;

public class Menu {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		
		/* Testes do modelo de dados */
		
		Medicamento m1 = new Medicamento(1, "Paracetamol 750 mg", 1, 21.90f, "Paracetamol");
		m1.visualizar();
		
		Cosmetico c1 = new Cosmetico(2, "Sabonete Lux", 2, 2.99f, "Flores do Campo");
		c1.visualizar();

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                FARMÁCIA BEM ESTAR                   ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Produto                        ");
			System.out.println("            2 - Listar todas as Produtos             ");
			System.out.println("            3 - Buscar Produto por ID                ");
			System.out.println("            4 - Atualizar Dados da Produto           ");
			System.out.println("            5 - Apagar Produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nFarmácia Bem Estar - Medicamento Barato é aqui!");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Criar Produto\n\n");

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todas as Produtos\n\n");

				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados da Produto - por número\n\n");

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados da Produto\n\n");

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar a Produto\n\n");

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}
	}

	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}
	
	public static void keyPress() {
	    try {
	        System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
	        
	        // Lê apenas a tecla Enter e ignora outras teclas
	        int input;
	        while ((input = System.in.read()) != '\n') {
	            // Ignora qualquer outra tecla diferente do Enter
	            if (input == -1) {
	                throw new IOException("Entrada encerrada inesperadamente");
	            }
	        }
	        
	    } catch (IOException e) {
	        System.err.println("Erro de entrada/saída: " + e.getMessage());
	    } catch (Exception e) {
	        System.err.println("Ocorreu um erro ao processar a entrada: " + e.getMessage());
	    }
	}

}