package week1assignements;

public class FibanocciSeries {

	public static void main(String[] args) {

		int numb1=0;
		int numb2=1;
		int numb3;
		for (int i = 0; i <10; i++)
		{
			numb3=numb1+numb2;
			System.out.println(numb1);
			
		numb1=numb2;
		numb2=numb3;
		
		}
	}

}
