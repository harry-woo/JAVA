package test;

public class GradeOutput {
	public static void main(String args[]) { 
		Grade g1, g2; //2���� ������ ǥ���ϴ� ��ü 
		g1 = new Grade( );
		g2 = new Grade( );
		g1.e = 90; //���� �Է� 
		g1.m = 85;
		g2.e = 80;
		g2.m = 80;
		g1.output_grade( );
		g2.output_grade( );
	}
}
