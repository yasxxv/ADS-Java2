package aula0403;

public class App02 {
	public static void main(String[] args) {
	
		int v[] = {43,3,54,56,6,2};
		for(int i=0;i<v.length;i++) {
			System.out.println(v[i]);
			
		}
		int soma = 0;
		int impar = 2;
		for(int i=0;i<v.length;i++) {
			soma = soma + v[i];
			System.out.println(soma);
		}
		for(int i=0;i<v.length;i++) {
			if(v[i]%2!=0) {
				impar = impar + v[i];
			}
		}
	}
}
