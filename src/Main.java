import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in); 
		int[] arreglo = new int[20];
		
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = (int) (Math.random()*25+1);
		}
		
		System.out.println(Arrays.toString(arreglo));
		
		arreglo = ordenar(arreglo);
		
		System.out.println(Arrays.toString(arreglo));
		
	} 
	 
	static int[] ordenar(int[] a) {
		boolean mov = true;
		int box = 0;
		
		while(mov) {
			
			mov = false;
			
			for (int i = 0; i < a.length; i++) {
				
				if( (i+1)<a.length && a[i] < a[i+1]) {
					box = a[i+1];
					a[i+1] = a[i];
					a[i] = box;
					mov = true;
				}
				
			}
			
		}
		
		return a;
	}
}