import java.util.ArrayList;
import java.util.Collections;

public class orderTest {

	public static void main(String[] args) {
		Participant participante1 = new Participant("Juan", 11, 23);
		Participant participante2 = new Participant("Sam", 14, 20);
		Participant participante3 = new Participant("Raquel", 11, 21);
		Participant participante4 = new Participant("Daniela", 13, 22);
		Participant participante5 = new Participant("Lucia", 11, 24);
		Participant participante6 = new Participant("Maria", 12, 23);
		Participant participante7 = new Participant("Jazmin", 11, 19);
		Participant participante8 = new Participant("Gabriela", 13, 20);
		
		ArrayList<Participant> arrayP = new ArrayList<Participant>();
		arrayP.add(participante3);
		arrayP.add(participante1);
		arrayP.add(participante4);
		arrayP.add(participante8);
		arrayP.add(participante5);
		arrayP.add(participante6);
		arrayP.add(participante7);
		arrayP.add(participante2);
		
		System.out.println("==================");
		System.out.println("Antes de ordenar");
		System.out.println("==================");
		for (Participant p: arrayP) {
			System.out.println(p.getName() + " " + p.getGames() + " " + p.getPoints());
		}
		
		Collections.sort(arrayP);
		
		System.out.println("==================");
		System.out.println("Despues de ordenar");
		System.out.println("==================");
		for (Participant p: arrayP) {
			System.out.println(p.getName() + " " + p.getGames() + " " + p.getPoints());
		}
		
	}

}
