import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import myinputs.Ler;
import java.io.*;
public class FuncCar {
	public static void modMat(ArrayList<carro> veiculos) {
		System.out.println("Introduza a matricula que pertende modificar:\n");
		String s = Ler.umaString();
		 for (int i = 0; i < veiculos.size(); i++) {	//verificar se a matricula existe
			 if (veiculos.get(i).getMat().equals(s)){
				System.out.println("Introduza a nova matricula:\n");	//alteraçao da matricula
				String d = Ler.umaString();
				veiculos.get(i).setMat(d);
				return;
			 }			 
		 }
		 System.out.println("A matricula introduzida nao existe");
		 //guardar no ficheiro
		 try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\diogo\\OneDrive\\Área de Trabalho\\ubi\\POO\\pratica\\Aluguer\\carro.dat"));
			 os.writeObject(veiculos); 
			 os.flush(); // os dados são copiados de memória para o disco
		 } catch (IOException e) {
			 System.out.println(e.getMessage());
		 }
	}
	public static void modMar(ArrayList<carro> veiculos) {
		System.out.println("Introduza a matricula da marca do carro que pertende modificar:\n");
		String s = Ler.umaString();
		 for (int i = 0; i < veiculos.size(); i++) {	//verificar se a matricula existe
			 if (veiculos.get(i).getMat().equals(s)){
				System.out.println("Introduza a nova marca:\n");	//alteraçao da marca
				String d = Ler.umaString();
				veiculos.get(i).setMar(d);
				return;
			 }			 
		 }
		 System.out.println("A matricula introduzida nao existe");
		 //guardar no ficheiro
		 try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\diogo\\OneDrive\\Área de Trabalho\\ubi\\POO\\pratica\\Aluguer\\carro.dat"));
			 os.writeObject(veiculos); 
			 os.flush(); // os dados são copiados de memória para o disco
		 } catch (IOException e) {
			 System.out.println(e.getMessage());
		 }
	}
	public static void modCap(ArrayList<carro> veiculos) {
		System.out.println("Introduza a matricula da marca do carro que pertende modificar:\n");
		String s = Ler.umaString();
		 for (int i = 0; i < veiculos.size(); i++) {	//verificar se a matricula existe
			 if (veiculos.get(i).getMat().equals(s)){
				System.out.println("Introduza a nova capacidade:\n");	//alteraçao da capacidade
				int d = Ler.umInt();
				veiculos.get(i).setCap(d);
				return;
			 }			 
		 }
		 System.out.println("A matricula introduzida nao existe");
		//guardar no ficheiro
		 try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\diogo\\OneDrive\\Área de Trabalho\\ubi\\POO\\pratica\\Aluguer\\carro.dat"));
			 os.writeObject(veiculos); 
			 os.flush(); // os dados são copiados de memória para o disco
		 } catch (IOException e) {
			 System.out.println(e.getMessage());
		 }
	}
	public static void modKm(ArrayList<carro> veiculos) {
		System.out.println("Introduza a matricula do carro que pertende modificar os km:\n");
		String s = Ler.umaString();
		 for (int i = 0; i < veiculos.size(); i++) {	//verificar se a matricula existe
			 if (veiculos.get(i).getMat().equals(s)){
				System.out.println("Introduza os novos km:\n");	//alteraçao dos km
				int d = Ler.umInt();
				veiculos.get(i).setKm(d);;
				return;
			 }			 
		 }
		 System.out.println("A matricula introduzida nao existe");
		//guardar no ficheiro
		 try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\diogo\\OneDrive\\Área de Trabalho\\ubi\\POO\\pratica\\Aluguer\\carro.dat"));
			 os.writeObject(veiculos); 
			 os.flush(); // os dados são copiados de memória para o disco
		 } catch (IOException e) {
			 System.out.println(e.getMessage());
		 }
	}
	public static void modCusto(ArrayList<carro> veiculos) {
		System.out.println("Introduza a matricula do carro que pertende modificar o custo:\n");
		String s = Ler.umaString();
		 for (int i = 0; i < veiculos.size(); i++) {	//verificar se a matricula existe
			 if (veiculos.get(i).getMat().equals(s)){
				System.out.println("Introduza a nova capacidade:\n");	//alteraçao do custo
				int d = Ler.umInt();
				veiculos.get(i).setCusto(d);;
				return;
			 }			 
		 }
		 System.out.println("A matricula introduzida nao existe");
		//guardar no ficheiro
		 try {
			 ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("C:\\Users\\diogo\\OneDrive\\Área de Trabalho\\ubi\\POO\\pratica\\Aluguer\\carro.dat"));
			 os.writeObject(veiculos); 
			 os.flush(); // os dados são copiados de memória para o disco
		 } catch (IOException e) {
			 System.out.println(e.getMessage());
		 }
	}
}
