package br;

import java.util.Scanner;

public class Programa implements Runnable {	
	
	private Thread thread;
	private Scanner scanner;
	private Administrador administrador;
	private Gerente gerente;
	private Cliente cliente;
	
	public Programa() {
		// TODO Auto-generated constructor stub
		scanner = new Scanner(System.in);
		administrador = new Administrador("ad","ad");
		gerente = new Gerente();
		
		thread = new Thread(this);
		//thread.start();
		
		iniciar();
	}
	
	private void iniciar(){
		while(true)
		{	
			console();//Tela Inicial
		}
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			//Login			
			
			
			//administrador
			
			try {
				Thread.sleep(17);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void console() {
		// TODO Auto-generated method stub
		System.out.println("1.Lista de Automoveis");
		System.out.println("2.Consultar Automovel");
		System.out.println("3.Logar");
		System.out.println("Digite:");
		
		switch(scanner.nextLine()){
			case "1":
				
				break;
			case "2":
				
				break;
			case "3":
				logar();//logar
				break;
		}
	}
	
	private void logar() {
		// TODO Auto-generated method stub
		System.out.println("Logar no Sistema");
		System.out.print("Email:");
		String email = scanner.nextLine();
		System.out.print("Senha:");
		String senha = scanner.nextLine();
		
		if(administrador.entrar(email,senha)){
			//Acoes do admin
			System.out.println("Adm logou");
			System.out.println("1.Cadastrar Gerente");
			System.out.println("2.Remover Gerente");
			System.out.println("3.Voltar");
			
			switch(scanner.nextLine())
			{
				case "1":
					
					break;
				case "2":
					
					break;
				case "3":
					break;
			}
			return;
		}
		
		if(gerente.entrar(email,senha)){
			//Acoes do gerente
			System.out.println("Gerente logou");
			return;
		}
	}
	
}
