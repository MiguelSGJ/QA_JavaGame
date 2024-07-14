package entitites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Game {
    private Player player;
    private Board board;
    private List<Question> questions;
    private int currentQuestionIndex;
    int initialPos = 0;

    public Game(String playerName) {
        player = new Player(playerName, initialPos, false);
        board = new Board(3, 10);
        board.initBoard(player);

        questions = new ArrayList<>();
        addQuestions();
        Collections.shuffle(questions);

        currentQuestionIndex = 0;
    }

    public Player getPlayer() {
        return player;
    }

    public Board getBoard() {
        return board;
    }

    private void addQuestions() {
        questions.add(new Question("Qual é o principal componente de um computador responsável pelo processamento de dados?", "CPU", "CPU", "Memória RAM", "Disco Rígido", "Fonte de Alimentação"));
        questions.add(new Question("Qual é a linguagem de programação mais utilizada para desenvolvimento de aplicações Android?", "Java", "Java", "Python", "C#", "Swift"));
        questions.add(new Question("O que significa a sigla 'HTTP'?", "Hypertext Transfer Protocol", "Hypertext Transfer Protocol", "High Transfer Protocol", "Hyperlink Text Protocol", "Hyper Textual Transfer Process"));
        questions.add(new Question("Qual é o sistema operacional mais usado em servidores web?", "Linux", "Linux", "Windows", "MacOS", "Solaris"));
        questions.add(new Question("O que é um 'loop infinito' em programação?", "Um loop que nunca termina", "Um loop que nunca termina", "Um loop que executa uma vez", "Um loop que termina imediatamente", "Um loop que executa duas vezes"));
        questions.add(new Question("Qual é a função principal de um 'firewall'?", "Proteger a rede de acessos não autorizados", "Proteger a rede de acessos não autorizados", "Acelerar a conexão de internet", "Aumentar a capacidade de armazenamento", "Gerenciar contas de usuário"));
        questions.add(new Question("Qual é a unidade básica de armazenamento de dados em um computador?", "Bit", "Bit", "Byte", "Kilobyte", "Megabyte"));
        questions.add(new Question("Qual é o criador da linguagem de programação Python?", "Guido van Rossum", "Guido van Rossum", "James Gosling", "Bjarne Stroustrup", "Dennis Ritchie"));
        questions.add(new Question("O que é um 'array' em programação?", "Uma coleção de elementos do mesmo tipo", "Uma coleção de elementos do mesmo tipo", "Uma função que retorna um valor", "Um tipo de loop", "Uma variável global"));
        questions.add(new Question("Qual é a principal função de um 'compilador'?", "Converter código-fonte em código executável", "Converter código-fonte em código executável", "Executar o código-fonte diretamente", "Depurar o código", "Armazenar dados temporários"));
        questions.add(new Question("O que é um 'algoritmo'?", "Uma sequência de passos para resolver um problema", "Uma sequência de passos para resolver um problema", "Um tipo de dado", "Uma linguagem de programação", "Uma função matemática"));
        questions.add(new Question("Qual é a linguagem de programação criada por Microsoft?", "C#", "Java", "C#", "Python", "Swift"));
        questions.add(new Question("O que significa a sigla 'SQL'?", "Structured Query Language", "Structured Query Language", "Simple Query Language", "Standard Query Language", "Sequential Query Language"));
        questions.add(new Question("Qual é o componente responsável pela renderização de gráficos?", "GPU", "GPU", "CPU", "RAM", "HDD"));
        questions.add(new Question("Qual é o sistema operacional da Apple para computadores?", "MacOS", "MacOS", "Windows", "Linux", "Android"));
        questions.add(new Question("Qual linguagem é conhecida por sua simplicidade e legibilidade?", "Python", "Python", "C++", "Assembly", "Java"));
        questions.add(new Question("O que é um 'byte'?", "8 bits", "8 bits", "16 bits", "32 bits", "64 bits"));
        questions.add(new Question("Qual protocolo é usado para enviar emails?", "SMTP", "SMTP", "HTTP", "FTP", "SSH"));
        questions.add(new Question("O que é uma 'função' em programação?", "Um bloco de código que executa uma tarefa específica", "Um bloco de código que executa uma tarefa específica", "Um tipo de dado", "Uma variável", "Uma estrutura de controle"));
        questions.add(new Question("Qual é a linguagem de marcação utilizada na criação de páginas web?", "HTML", "HTML", "CSS", "JavaScript", "XML"));
        questions.add(new Question("O que é 'Encapsulamento' em programação orientada a objetos?", "O princípio de esconder detalhes de implementação", "O princípio de esconder detalhes de implementação", "A capacidade de herdar métodos", "A definição de interfaces", "A utilização de polimorfismo"));
        questions.add(new Question("Qual é o objetivo do 'teste de software'?", "Encontrar e corrigir bugs", "Encontrar e corrigir bugs", "Escrever documentação", "Desenvolver novas funcionalidades", "Gerenciar projetos"));
        questions.add(new Question("Qual é a extensão de arquivos Java?", ".java", ".java", ".py", ".cpp", ".js"));
        questions.add(new Question("O que é 'Machine Learning'?", "Um campo da IA que dá às máquinas a habilidade de aprender", "Um campo da IA que dá às máquinas a habilidade de aprender", "Um tipo de banco de dados", "Uma técnica de compressão", "Uma linguagem de programação"));
        questions.add(new Question("Qual é o significado de 'IDE'?", "Integrated Development Environment", "Integrated Development Environment", "Internal Development Environment", "Interactive Development Environment", "Independent Development Environment"));
        questions.add(new Question("O que faz a instrução 'for' em muitas linguagens de programação?", "Executa um bloco de código um número específico de vezes", "Executa um bloco de código um número específico de vezes", "Define uma função", "Declara uma variável", "Encerra um programa"));
        questions.add(new Question("O que é 'Big Data'?", "Grandes volumes de dados que podem ser analisados para insights", "Grandes volumes de dados que podem ser analisados para insights", "Um tipo de software", "Uma linguagem de programação", "Um protocolo de rede"));
        questions.add(new Question("Quem inventou o World Wide Web?", "Tim Berners-Lee", "Tim Berners-Lee", "Bill Gates", "Steve Jobs", "Mark Zuckerberg"));
        questions.add(new Question("Qual é a linguagem principal usada no desenvolvimento de páginas web?", "JavaScript", "JavaScript", "Python", "C++", "C#"));
        questions.add(new Question("O que é 'Blockchain'?", "Uma tecnologia de registro distribuído", "Uma tecnologia de registro distribuído", "Um algoritmo de compressão", "Um tipo de malware", "Uma linguagem de programação"));
    }

    public boolean askQuestion() {
        if (currentQuestionIndex >= questions.size()) {
            System.out.println("Não há mais perguntas disponíveis.");
            return false;
        }

        Scanner scanner = new Scanner(System.in);
        Question question = questions.get(currentQuestionIndex++);
        System.out.println(question.getFormattedQuestion());
        System.out.print("Sua resposta (A, B, C ou D): ");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase(question.getCorrectAnswer());
    }
}
