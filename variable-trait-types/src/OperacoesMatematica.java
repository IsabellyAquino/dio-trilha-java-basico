import java.util.Scanner;

public class OperacoesMatematica {

    public static Scanner ler = new Scanner(System.in);

     /*Operações matemáticas simples com números inteiros. 
      Solicita dois números inteiros do usuário e exibe a soma, 
      subtração, multiplicação e divisão desses números. */

    public static void main(String[] args) throws Exception {
        menu();
   
    }

    public static void menu(){
        System.out.println("--------------------------");
        System.out.println("1. Somar");
        System.out.println("2. Subtrair");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Fim");
        System.out.println("--------------------------");

        System.out.println("\nQue tipo de operação você deseja realizar: ");
        int caseID = ler.nextInt();

        while (caseID < 1 || caseID > 5) {
            System.out.println("Digite um valor válido entre 1 e 5 para realizar um tipo de operação:");
           caseID = ler.nextInt();
            
        }

        switch (caseID){
            case 1: 
                somar();
                break;
            case 2:
                subtrair();
                break; 
            case 3:
                multiplicar();
                break;
             case 4:
                dividr();
                break;  
            case 5:
                
                break;                  
            default:
                break;
        }

    }

    public static void somar(){
        System.out.println("\nDigite o primeiro número inteiro:");
        int num1 = ler.nextInt();

        System.out.println("Digite o segundo número inteiro para somar:");
        int num2 = ler.nextInt();
        int soma = num1 + num2;

        System.out.println("O valor da soma é: " + soma);

        pressioneEnter();
    }

    

    public static void subtrair(){}

    

    public static void multiplicar(){}

    

    public static void dividr(){}

    public static void pressioneEnter(){
        
        System.out.println("\n\nPressione a tecla [0] para continuar.");
        int zero = ler.nextInt();

        if (zero == 0) {
            menu();    
        } else {
            System.exit(0);
        }
        
    }

    
    
}
