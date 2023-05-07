import java.util.Scanner;
public class Menu {
    

    public static void Executar(){
        Scanner sc = new Scanner(System.in);
        Informacoes aluno = new Informacoes();
        double media = 0, mediaTotal = 0;
        limpa();

        System.out.print("Informe a quantidade de alunos na escola: ");
        int Quantidadealunos = sc.nextInt();
        limpa();
        for( int i = 1; i <= Quantidadealunos; i++ ){

            System.out.print("Informe o nome do " + i + "° aluno: ");
            aluno.setNome(sc.next());

            System.out.print("Informe a primeira nota: ");
            aluno.setNota1(sc.nextDouble());
            System.out.print("Informe a segunda nota: ");
            aluno.setNota2(sc.nextDouble());
            System.out.print("Informe a terceira nota: ");
            aluno.setNota3(sc.nextDouble());
            System.out.print("Informe a quarta nota: ");
            aluno.setNota4(sc.nextDouble());

            limpa();

            media = ( aluno.getNota1() +  aluno.getNota2() +  aluno.getNota3() +  aluno.getNota4() ) / 4;
            System.out.println("A média do aluno " + aluno.getNome() + " foi de: " + media);

            if( aluno.getNota1() > 10 || aluno.getNota2() > 10 || aluno.getNota3() > 10 || aluno.getNota4() > 10 ){
                System.out.println("Foram informadas uma ou mais notas superiores a '10'. Por favor repita o processo.");
                break;
            }else if( media >= 6 ){
                System.out.println("O aluno está aprovado.");
            }else if( media <= 4 ){
                System.out.println("O aluno está reprovado.");
            }else if( media > 4 && media < 6 ){
                System.out.println("O aluno está de recuperação.");
            }
            
            mediaTotal += media;

        }

        
        mediaTotal = mediaTotal / Quantidadealunos;
        System.out.println("A média total desses alunos foi de: " + mediaTotal);

        sc.close();
    }
    public static void limpa(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
