import java.util.ArrayList;
import java.io.*;
public class carro {
	private String matricula;
	private int km;
	private int capacidade;
	private String marca;
	private int custo;

	public carro(String matricula) {
		this.matricula = matricula;
		int capacidade = 0;
		int km = 0;
		int custo = 0;
	}
	public carro(String matricula, String marca) {
		this.matricula = matricula;
		this.marca = marca;
		capacidade = 0;
		km = 0;
		custo = 0;
	}
	public String getMat() {
		return matricula;
	}
	public void setMat(String matricula) {
		this.matricula = matricula;
	}
	public String getMar() {
		return marca;
	}
	public void setMar(String marca) {
		this.marca = marca;
	}
	public int getCap() {
		return capacidade;
	}
	public void setCap(int capacidade) {
		this.capacidade= capacidade;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public int getCusto() {
		return custo;
	}
	public void setCusto(int custo) {
		this.custo = custo;
	}
	public String toString() {
		String s = "Marca : " + marca + ";\nMatricula : " + matricula + ";\nCapacidade : " + capacidade + ";\nKm : " + km + ".";
		return s;
	}
	public boolean equals(Object o) {
		boolean iguais = true;
		if(o != null && this.getClass() == o.getClass()) {
			carro e = (carro)o;
			iguais = this.matricula == e.matricula;
			return iguais;
		}
		else {
			return false;
		}
	}
	public Object clone() {
		carro e = new carro(this.matricula);
		return e;
	}
}
