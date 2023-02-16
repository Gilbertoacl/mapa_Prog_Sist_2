package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EletricCars;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EletricCars> list = new ArrayList<>();
		System.out.println("Cadastrando veículo:");
		System.out.print("Marca:");
		String marca = sc.nextLine();
		System.out.print("Modelo:");
		String modelo = sc.nextLine();
		System.out.print("Ano de Fabricação(xxxx):");
		Integer anoFabricacao = sc.nextInt();
		System.out.print("Velocidade Máxima(km/h):");
		Double velMaxima = sc.nextDouble();
		System.out.print("Autonomia(km):");
		Double autonomia = sc.nextDouble();
		System.out.print("Tempo de Carregamento(h):");
		Double tempoCarregamento = sc.nextDouble();
		System.out.print("Preço: R$");
		Double preco = sc.nextDouble();
		System.out.println();
		EletricCars cars = new EletricCars(marca, modelo, anoFabricacao, velMaxima, autonomia, tempoCarregamento,
				preco);
		list.add(cars);

		double valorKmRodado = cars.calculaRecarga(cars.getValorEnergia(), cars.getTempoDeCarregamento(),
				cars.getAutonomia());
		double gastoMensal = 200 - valorKmRodado * 400;

		for (EletricCars x : list) {
			System.out.println(x);
			System.out.printf("Valor do km rodado R$ %.3f.\n", valorKmRodado);
			System.out.printf("Valor gasto mensalmente vai ser de R$ %.2f.", gastoMensal);
		}
		sc.close();
	}
}
