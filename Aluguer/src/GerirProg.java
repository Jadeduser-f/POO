import myinputs.Ler;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.io.*;
public class GerirProg {

public static int menu(){ // função na classe do main
	 int opcao;
	 System.out.println("1 - Gerir Alugueres");
	 System.out.println("2 - Gerir Carros");
	 System.out.println("3 - Sair");

	 System.out.println("Qual a sua opção:");
	 opcao = Ler.umInt();
	 return opcao;
	 }

public static int menualugueres(){ 
	 int opcaoa;
	 System.out.println("1 - ");
	 System.out.println("2 - ");
	 System.out.println("3 - ");

	 System.out.println("Qual a sua opção:");
	 opcaoa = Ler.umInt();
	 return opcaoa;
	 }

public static int menucarros(){
	 int opcaoc;
	 System.out.println("1 - Listar os carros");
	 System.out.println("2 - Alteração de matricula");
	 System.out.println("3 - ");

	 System.out.println("Qual a sua opção:");
	 opcaoc = Ler.umInt();
	 return opcaoc;
	 }

	public static void main(String[] args){
	int escolha;
	java.util.ArrayList<carro> carros  = new ArrayList<carro>();
	
	try {
		 ObjectInputStream is = new ObjectInputStream( new FileInputStream("C:\\Users\\Admin\\Desktop\\POO\\carros.txt"));
		 carros = (ArrayList<carro>) is.readObject();
		 }
	 catch (IOException e){
		 System.out.println(e.getMessage());
		 }
		 catch ( ClassNotFoundException e) {
		 System.out.println(e.getMessage());
		 }
	java.util.ArrayList<Aluguer> alugueres  = new ArrayList<Aluguer>();
	
	try {
		 ObjectInputStream is = new ObjectInputStream( new FileInputStream("C:\\Users\\Admin\\Desktop\\POO\\carros.txt"));
		 alugueres = (ArrayList<Aluguer>) is.readObject();
		 }
	 catch (IOException e){
		 System.out.println(e.getMessage());
		 }
		 catch ( ClassNotFoundException e) {
		 System.out.println(e.getMessage());
		 }	 
	
	do{
		 escolha = menu();
		 switch (escolha){
		 case 1:
			 do{
				 escolha = menualugueres();
				 switch (escolha){
				 case 1:
				 case 2: 
				 break;
				 case 3: 
				 }
				 } while(escolha != 3);
			 	break;
		 case 2: 
			 do{
				 escolha = menucarros();
				 switch (escolha){
				 case 1:
				 case 2: 
				 case 3:  
				 }
				 } while(escolha != 3);
			 break; 
		 }
		 } while(escolha != 3);
		 
	
	}
	
	
		}