import java.util.Scanner;
import java.util.ArrayList;

public class CadastrarConsulta {
			
	
 public static void cadastrarConsulta(){
    
	 Scanner entrada=new Scanner(System.in);
	 
	 Consulta consulta=new Consulta();

	 ArrayList<Consulta> consultList=new ArrayList<Consulta>();
		
	 
	    //Cadastrar Consulta
	    System.out.println("Cadastrar Consulta");
	    
	    entrada=new Scanner(System.in);
	    System.out.println("Data da Consulta");
	    String data=entrada.nextLine();
		
	    entrada=new Scanner(System.in);
	    
	    System.out.println("Codigoo da Consulta");
	    int codConsulta= entrada.nextInt();

	    consulta.addConsulta(data, codConsulta);
	    
	    consultList.add(consulta);
	 
	 
 }
 
 

}
