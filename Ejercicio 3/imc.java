public class imc{
    public static void main(String[] args){
	double peso = 132.5;					//Libras
	double altura = 62.5;					//Pulgadas
	double resultado = (peso/Math.pow(altura, 2))*703;
	System.out.println("El índice de masa corporal es: "+resultado);
	double indice = Math.round(resultado);
	System.out.println("El índice de masa corporal redondeado es: "+indice);
    }
}