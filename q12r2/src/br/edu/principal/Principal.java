package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double salario, aumento, novosal, cargo;
		Scanner prompt = new Scanner(System.in);
		System.out.print("Digite o cargo do funcionario(a) (1,2,3,4,5): ");
		cargo = prompt.nextDouble();
		System.out.print("Digite o salario atual: ");
		salario = prompt.nextDouble();
		if(cargo == 1) {
			System.out.println("O cargo � Escritur�rio");
			aumento = salario * 50/100;
			System.out.println("O aumento �: " + aumento);
			novosal = salario + aumento;
			System.out.println("O novo salario �: " + novosal);
		} else if(cargo == 2) {
			System.out.println("O cargo � Secret�rio");
			aumento = salario * 35/100;
			System.out.println("O aumento �: " + aumento);
			novosal = salario + aumento;
			System.out.println("O novo salario �: " + novosal);
		} else if(cargo == 3) {
			System.out.println("O cargo � Caixa");
			aumento = salario * 20/100;
			System.out.println("O aumento �: " + aumento);
			novosal = salario + aumento;
			System.out.println("O novo salario �: " + novosal);
		} else if (cargo == 4) {
			System.out.println("O cargo � Gerente");
			aumento = salario * 10/100;
			System.out.println("O aumento �: " + aumento);
			novosal = salario + aumento;
			System.out.println("O novo salario �: " + novosal);
		}else if(cargo == 5) {
			System.out.println("O cargo � Diretor");
			aumento = salario * 0/100;
			System.out.println("O aumento �: " + aumento);
			novosal = salario + aumento;
			System.out.println("O novo salario �: " + novosal);
		}else {
			System.out.println("Cargo inexistente:");
		}
	}

}
