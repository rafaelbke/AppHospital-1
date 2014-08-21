import java.util.ArrayList;


public class Historico {

	private static int somaHistoric;
	
	static ArrayList<Historico> historicList = new ArrayList<Historico>();
	
	
	public static void somaH(int somaUm){
			somaHistoric=somaUm;
		
	}
	
		public static void imprimeDados(boolean f){		
				  for(int i = 0; i < historicList.size(); i++){
				      	System.out.println("Paciente\n" + "Nome: " + CadastrarPaciente.clienteList.get(i).getNome() + "\n" + 
									"CPF: " + CadastrarPaciente.clienteList.get(i).getCpf() + "\n" +
									"Sexo: " + CadastrarPaciente.clienteList.get(i).getSexo()+
									"\nConsulta"+"\n"+ "Data: "+CadastrarConsulta.consultList.get(i).getData() + "\n" +
									"Codigo da Consulta: "+CadastrarConsulta.consultList.get(i).getCodigo() + "\n" +
									"Medicamentos"+ "\n"+ "Nome: " + CadastrarMedicamento.medicList.get(i).getNome() + "\n" +
									"Descrição do Medicamento:"+ CadastrarMedicamento.medicList.get(i).getDescricao()+"\n");
				  
				  	  } 
			
		}
	
}
