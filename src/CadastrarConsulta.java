import java.util.Scanner;
import java.util.ArrayList;

public class CadastrarConsulta {
			
  static ArrayList<Consulta> consultList=new ArrayList<Consulta>();
	
	public CadastrarConsulta(ArrayList<Consulta> consultaObj){
		consultList=consultaObj;
	}
	
 public static void cadastrarConsulta(){
    
	 Scanner entrada=new Scanner(System.in);
	 
	 Consulta consulta=new Consulta();

	    //Cadastrar Consulta
	    
	    entrada=new Scanner(System.in);
	    System.out.println("Data da Consulta");
	    String data=entrada.nextLine();
		
	    entrada=new Scanner(System.in);
	    
	    System.out.println("Codigo da Consulta");
	    int codConsulta= entrada.nextInt();

	    consulta.addConsulta(data, codConsulta);
	    
	    consultList.add(consulta);
	 	 
 }
 
 

}
