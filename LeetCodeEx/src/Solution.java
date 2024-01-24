
public class Solution {
	
	    public static boolean isPalindrome(int x) {
	        /*
	        Separar em uma lista os caracteres
	        fazer um laço iniciando com uma variável com 0 e passar por cada caractere, primeiro da esquerda para a direita (iniciando-se pelo 0 e somando a variável) e comparar com o outro caractere percorrido no sentido inverso (Começando pelo último caractere e subtraindo a variável)
	        Caso alguma comparação falhe, retorne false, caso acabe o laço, retorne true      
	        */
	        String input = String.valueOf(x);
	        int len = input.length();
	        for (int i = 0; i < len; i++) {
	            if (input.charAt(0 + i) != input.charAt(len - 1 - i)) {
	                return false;
	            }
	        }
	        return true;
	    }
}
