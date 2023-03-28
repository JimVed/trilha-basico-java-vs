public class Operadores {
    public static void main(String []args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        //OutrosOperadores
        int numero1= 1;
        int numero2= 2;
        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {

            System.out.println("A nossa condição é verdadeira");

        }

// usar o equals quando for comparar objetos. Quando não, operadores relacionais.
// & |
         boolean condicao1= true;
         boolean condicao2= false;
         if(condicao1 && ( 7>4 ) ){
          System.out.println("As duas condições são verdadeiras");
         }
   }
    
}
