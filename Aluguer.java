import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.*;
public class Aluguer {
	private String nome;
	private LocalDate dataI;
	private LocalDate dataF;
	private carro a;
	public Aluguer(carro a, String nome, LocalDate dataI, LocalDate dataF) {
		this.nome = nome;
		this.dataI = dataI;
		this.dataF = dataF;
		
	}
	public String getNome(){
		return nome;
	}
	public void setNome (String Nome) {
		this.nome = nome;
	}
	public LocalDate getDataI () {
		return dataI;
	}
	public void setDataI (LocalDate dataI) {
		this.dataI = dataI;
	}
	public LocalDate getDataF() {
		return dataF;
	}
	public void setDataF (LocalDate dataF) {
		this.dataF = dataF;
	}
	public carro getA() {
		return a;
	}
	public void setA(carro a) {
		this.a = a;
	}
	
/*	public void pertence(String s) {
		for(int i = 0; i < aluguer.size(); i++) {
			if(aluguer.contains(s)) {
				System.out.println("O carro existe");
			}
			else {
				System.out.println("Nao existe nenhum carro");
			}
		}
	}*/
	public String toString() {
		String s ="Nome : " + nome + ";\nCarro alugado : " + a + ";\nData que foi alugado : " + dataI + ";\nData de entrega : " + dataF;
			return s;
	}
	public boolean equals(Object o) {
		boolean iguais = false;
		if(o != null && this.getClass() == o.getClass()) {
			Aluguer e = (Aluguer)o;
			iguais = this.nome.equals(e.nome);
			iguais = this.dataI == e.dataI && this.dataF == e.dataF;
			iguais = this.a.equals(e.a);
			return iguais;
		}
		else{
			return false;
		}
	}
	public Object clone() {
		Aluguer e = new Aluguer(this.a, this.nome, this.dataI, this.dataF);
		return e;
	}
}
