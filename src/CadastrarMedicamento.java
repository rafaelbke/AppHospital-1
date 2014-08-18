import java.util.*;
import java.util.ArrayList;

public class CadastrarMedicamento {

	public static void cadastrarMedicamento(){
        
		ArrayList<Medicamento> medicList=new  ArrayList<Medicamento>();
		Medicamento medicamento=new Medicamento();

		Scanner entrada=new Scanner (System.in);
		
		//Cadastrar Medicamento
	    System.out.println("Cadastrar Medicamento");
	    
	    entrada=new Scanner(System.in);
	    
	    System.out.println("Nome do Medicamento");
	    String nomeMedicamento= entrada.nextLine();
	    
        entrada=new Scanner(System.in);
	    
	    System.out.println("Descricão do Medicamento");
	    String descricaoMedicamento= entrada.nextLine();
	    
	    medicamento.addMedicamento(nomeMedicamento, descricaoMedicamento);
	    medicList.add(medicamento);

}

}
