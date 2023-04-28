package exerc17;

public class JogoDaVelha {

	private char[][] grade = new char[3][3];
	
	public JogoDaVelha(char[][] grade) {
	}
	
	public void gradeJogo() {
		System.out.println(grade[0][0] + "|" + grade[0][1] + "|" + grade[0][2]);
		System.out.println("");
		System.out.println(grade[1][0] + "|" + grade[1][1] + "|" + grade[1][2]);
		System.out.println(grade[2][0] + "|" + grade[2][1] + "|" + grade[2][2]);
	}
}
