import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import myinputs.Ler;
import java.io.*;
public class FuncAl {
	public void addAl(ArrayList<Aluguer> al, ArrayList<carro> ca) {
		System.out.println("Introduza a matricula");
		String s = Ler.umaString();
		System.out.println("Introduza a marca"); 
		String d = Ler.umaString();
		 for (int i = 0; i < al.size(); i++) {
			 if (al.get(i).getNome().equals(s)){
				System.out.println("Já existe um aluno com esse número");
				return;
			 }
		 }
		 Aluguer a = new Aluguer(s);
	}
	public void 
}
