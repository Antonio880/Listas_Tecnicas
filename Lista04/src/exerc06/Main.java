package exerc06;

public class Main {

	public static void main(String[] args) {
		
		Ingresso ingresso = new Ingresso(15, 20);
		IngressoVIP ingressoVip = new IngressoVIP(10, 15);
		Evento evento = new Evento(ingresso);
		
		
		System.out.println(ingresso.toString());
		System.out.println(ingressoVip.toString());
		
		System.out.println(evento.vendaIngressos(10));
		System.out.println(evento.ingressosRestantes());
		
		
	}
}
