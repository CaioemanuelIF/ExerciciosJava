import java.util.*;
    public class programa {
        public static void main (String [] args){
            banco bradesco = new banco("Caio","0576",2030302,"21/03/2016",1000.00);

                System.out.println("Olá, seja bem-vindo ao banco Bradesco! "+bradesco.rnomeTitular());
                System.out.println("Sua agencia é: "+bradesco.ragencia());
                System.out.println("O numero de sua conta é: "+bradesco.rnumero());
                System.out.println("A data de abertura de sua conta é: "+bradesco.rdataAbertura());
                System.out.println("Seu saldo é: "+bradesco.rsaldo());
        }
}