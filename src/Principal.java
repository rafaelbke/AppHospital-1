/* ------------------------------------------------------------------------
 *| Faculdade Senac Rio Grande do Sul Análise e Desenvolvimento de Sistemas|
 * ------------------------------- ----------------------------------------
 *| Láboratorio de Informatica III|
 * ------------------------------- -----------------------------------------------------
 *|Desenvolvedores: Eduardo Luiz, Felipe Petrillo, Rafael Dornelles, Rafael Fröhlich Ferreira|
 * -------------------------------------------------------------------------------------
 */

import java.util.*;
import java.util.ArrayList;
public class Principal {
	public static void main(String [] args){
		
	    Scanner entrada = new Scanner(System.in);
	    
	    boolean f=true;
		while(f){
	    	 
	    // Painel principal de opções
	    System.out.println("Gerenciador Hospitalar Tabajara 1.0.0");
	    System.out.println("1- Cadastrar Paciente");
	    System.out.println("2- Cadastrar Medicamento");
	    System.out.println("3- Cadastrar Consulta");
	    System.out.println("4- Imprimir Historico");
	    System.out.println("5- Sair");
	    int opcao=entrada.nextInt();
	    
	 switch(opcao) {
	 	 case 1:
	 
	 		CadastrarPaciente.cadastrarCliente();
	 			
	 		break;
	 		
	 	 case 2:
	 		 
	 		CadastrarMedicamento.cadastrarMedicamento();
	 		
	 		 break;
	 		 
	 	 case 3:
	 		
	 		CadastrarConsulta.cadastrarConsulta();
	 	
	 		break;
	 		
	 	 case 4:
	 		 
	 		 Historico.imprimeDados(true);
	 	 
	 	 case 5:
	 		 
	 		 f=false;  
	 		 break;
	 	 
	 	 default:
	 	 
	 		 break;
	 } //Fim Switch
	
	} // Fim While "f" 
			     
	}
}
