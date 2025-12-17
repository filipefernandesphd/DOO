public class Main {
    public static void main(String args[]) {

        //Lucas Gomes Alves

        Aluno aluno1 = new Aluno("alunoum@gmail.com",123);

        aluno1.getIdentificacao();

        Professor p1 = new Professor("professor1@gmail.com", 984868);
        p1.getIdentificacao();

        System.out.println();

        Questao q1 = new Questao("");

        System.out.println("O Brasil foi alcançado em 1500 de maneira fortuita, durante uma expedição cujo destino original era outro.");
    
        System.out.println("Quem descobriu o Brasil?");

                System.out.println();

        q1.adicionarImagemExtra("https://x.com/govbr/status/988160591448739840");
        q1.adicionarVideoExtra("Ut-KsHLoxSM");

                System.out.println();

        q1.adicionarMultiplaEscolha1("Pedro Álvares Cabral");
                System.out.println();
        q1.adicionarMultiplaEscolha2("Américo Vespúcio");
                System.out.println();
        q1.adicionarMultiplaEscolha3("Cristóvão Colombo");
                System.out.println();
        q1.adicionarMultiplaEscolha4("Pedro Vaz de Caminha");
                System.out.println();
        q1.adicionarMultiplaEscolha5("Os povos indígenas");

                System.out.println();

        Questao q2 = new Questao("");

                System.out.println("A cidade de Manhuaçu já foi um república.");

        q2.adicionarVerdadeiroFalso(true);

        System.out.println();

        Questao q3 = new Questao("");
        System.out.println("Comente sobre o atual cenário político do Brasil.");

        q3.adicionarRespostaAberta("Um caos!");
        
        Bloco historia = new Bloco();



    }   
        }