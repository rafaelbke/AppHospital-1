import java.util.Scanner;

import java.util.ArrayList;
import java.util.ArrayList;
public class CadastrarPaciente {
	
	static ArrayList<Paciente> clienteList = new ArrayList<Paciente>();
	
	public CadastrarPaciente(ArrayList<Paciente> cadastroCliente){
		clienteList=cadastroCliente;
		
	}
	
	public static void cadastrarCliente(){
		Scanner entrada = new Scanner (System.in);

         	// Cadastrar Cliente	
			
	        System.out.println("Cadastrar Cliente");
    
    		System.out.println("Nome do Paciente:");
    		String nome = entrada.nextLine();
   
    		System.out.println("Cpf do Paciente:");
    		int cpf = entrada.nextInt();
   
    		entrada = new Scanner(System.in);
  
    		System.out.println("Sexo do Paciente:");
    		String sexo = entrada.nextLine();
   
    		Paciente cliente = new Paciente();
    		cliente.addCliente(nome, cpf, sexo);
    		
    		Historico historico=new Historico();
    		
    		historico.somaH(1);
    		
    		clienteList.add(cliente);
    		Historico.historicList.add(historico);
    	
	}	// Fim metodo cadastrarCliente

	
	public static void listarPacientes(){
		
		  for(int i = 0; i < clienteList.size(); i++){
		      	System.out.println("Nome: " + clienteList.get(i).getNome() + "\n" + 
							"CPF: " + clienteList.get(i).getCpf() + "\n" +
							"Sexo: " + clienteList.get(i).getSexo()+"\n");
		  
		  	  }  //Fim do metodo listarPacientes
		
	}

}

