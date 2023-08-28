

/*
 * .Faça um programa que ao receber duas notas de um aluno calcule a média e 
 * informe se o aluno foi aprovado, está de recuperação ou foi reprovado.

a) para ser aprovado o aluno tem que ter media igual ou superior a 6

b) para ficar em recuperação o aluno tem que ter media superior ou igual a 4 e inferior a 6

c) para ficar reprovado o aluno tem que possuir media inferior a 4
*/
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        double n1,n2, media;
        
        Scanner dd = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        n1= dd.nextInt();
        System.out.println("Informe a segunda nota: ");
        n2 = dd.nextInt();

         media = (n1 + n2) /2; //calculando média
         // verificando a nota do aluno
        if(media >= 6){
            System.out.println("Aprovado");
        }
         else if(media >=4 ){
            System.out.println("Recuperação ");
        }
         else{
            System.out.println("Reprovado");
        }
            
        System.out.printf("A média do aluno é: %.2f\n", media);
       

        dd.close();


    }
}
