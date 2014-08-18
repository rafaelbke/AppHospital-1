import java.util.Scanner;
import java.util.ArrayList;
public class CadastrarCliente {
	
	public static void cadastrarCliente(){
		Scanner entrada = new Scanner (System.in);

    	// Cadastrar Cliente	
		ArrayList<Cliente> clienteList = new ArrayList<Cliente>();
			
    	System.out.println("Cadastrar Cliente");
    
    		System.out.println("Nome do Paciente:");
    		String nome = entrada.nextLine();
   
    		System.out.println("Cpf do Paciente:");
    		int cpf = entrada.nextInt();
   
    		entrada = new Scanner(System.in);
  
    		System.out.println("Sexo do Paciente:");
    		String sexo = entrada.nextLine();
   
    		Cliente cliente = new Cliente();
    		cliente.addCliente(nome, cpf, sexo);
    		
    		clienteList.add(cliente);
    		
    	
    
    	/*---Teste de Repetição
    	 * for(int i = 0; i < clienteList.size(); i++){
        	System.out.println("Nome: " + clienteList.get(i).getNome() + "\n" + 
					"CPF: " + clienteList.get(i).getCpf() + "\n" +
					"Sexo: " + clienteList.get(i).getSexo());
    	}*/
	}	
}
