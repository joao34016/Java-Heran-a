import java.util.Scanner;

class Funcionario {
    public String nome;
    public int id;
    public String endereco;
    public double salario;

    public Funcionario(String nome, int id, String endereco, double salario) {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
        this.salario = salario;

    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Id: " + id);
        System.out.println("Endereço: " + endereco);
        System.out.println("Salário: " + salario);
    }
    public void trabalhar(){
        System.out.println("Funcionário trabalhando. ");
    }
}

// Classe Aluno herdando de SUPERCLASSE Pessoa
class Tecnico extends Funcionario {
    public String especialidade;
    public double bonificacao;

    public Tecnico(String nome, int id, String endereco, double salario, String especialidade, double bonificacao) {
        super(nome, id, endereco, salario);
        this.especialidade = especialidade;
        this.bonificacao = bonificacao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Especialidade técnica: " + especialidade);
         System.out.println("Bonificação para técnico: " + bonificacao);
    }
    public void trabalhar(){
        super.trabalhar();
        System.out.println("Tecnico  assistente sistemas trabalhando. ");
    }
}

// Classe Professor herdando de SUPERCLASSE Pessoa
class Engenheiro extends Funcionario {
    public String engenharia;
    public String Lugar_de_graduacao;

    public Engenheiro(String nome, int id, String endereco, double salario, String engenharia, String Lugar_de_graduacao) {
        super(nome, id,endereco, salario);
        this.engenharia = engenharia;
        this.Lugar_de_graduacao = Lugar_de_graduacao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Nome da engenharia " + engenharia);
        System.out.println("Lugar onde foi feita a graduação do engenheiro: " + Lugar_de_graduacao);
        
    
    }
    public void trabalhar(){
        super.trabalhar();
        System.out.println("Engenheiro projetando sistemas. ");
    }
}

class Gerente extends Funcionario {
    public int horas_trabalhadas;
    public int nr_funcionarios;

    public Gerente(String nome, int id, String endereco, double salario, int horas_trabalhadas, int nr_funcionarios) {
        super(nome, id,endereco, salario);
        this.horas_trabalhadas = horas_trabalhadas;
        this.nr_funcionarios = nr_funcionarios;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Quantidade de horas trabalhadas: " + horas_trabalhadas);
        System.out.println("Número de funcionários: " + nr_funcionarios);
        
    
    }
    public void trabalhar(){
        super.trabalhar();
        System.out.println("Gerente  coordenando sistemas ");
    }
}

// Programa principal (valores fixos exemplo)
public class Ex3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            System.out.println("=====Menu=====");
            System.out.println("0 - Sair\n1 - Cadastrar Técnico\n2 - Cadastrar Engenheiro\n3 - Cadastrar Gerente");
            int opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
               case 1:
                System.out.println("Digite o nome do técnico: ");
                String Nome_tecnico = scanner.nextLine();
                System.out.println("Digite o id do técnico: ");
                int id_tecnico = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o endereco do Técnico: ");
                String Endereco_tecnico = scanner.nextLine();
                System.out.println("Digite o salário do Técnico: ");
                double salario = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Digite a especialidade do Técnico: ");
                String Especialidade_tecnico = scanner.nextLine();
                System.out.println("Digite a bonificação técnica: ");
                Double Bonificacao_tecnica = scanner.nextDouble();

                

                Tecnico tecnico = new Tecnico(Nome_tecnico, id_tecnico, Endereco_tecnico, salario, Especialidade_tecnico, Bonificacao_tecnica);
                tecnico.mostrarDados();
                tecnico.trabalhar();
                break;



               case 2:
                System.out.println("Digite o nome do Engenheiro: ");
                String nome_Engenheiro = scanner.nextLine();
                System.out.println("Digite o id do Engenheiro: ");
                int id_engenheiro = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o endereco do Engenheiro: ");
                String Endereco_engenheiro = scanner.nextLine();
                System.out.println("Digite o salário do Engenheiro: ");
                double Salario_engenheiro = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Digite a engenharia especializada do Engenheiro: ");
                String engenharia = scanner.nextLine();
                System.out.println("Digite o local onde o Engenheiro fez sua graduação: ");
                String Lugar_de_graduacao = scanner.nextLine();

                

                Engenheiro engenheiro = new Engenheiro(nome_Engenheiro, id_engenheiro, Endereco_engenheiro, Salario_engenheiro, engenharia, Lugar_de_graduacao);
                engenheiro.mostrarDados();
                engenheiro.trabalhar();
                break;
                case 3:
                System.out.println("Digite o nome do Gerente: ");
                String nome_Gerente = scanner.nextLine();
                System.out.println("Digite o id do Gerente: ");
                int id_Gerente = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o endereco do Gerente: ");
                String endereco_Gerente = scanner.nextLine();
                System.out.println("Digite o salário do Gerente: ");
                double salario_Gerente = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Digite o número de horas trabalhadas do gerente: ");
                int horas_trabalhasGer = scanner.nextInt();
                System.out.println("Digite o número de funcionários do gerente: ");
                int nr_funcionariosGer = scanner.nextInt();

                

                Gerente gerente = new Gerente(nome_Gerente, id_Gerente, endereco_Gerente, salario_Gerente, horas_trabalhasGer, nr_funcionariosGer);
                gerente.mostrarDados();
                gerente.trabalhar();
                break;
            
                

             case 0: 
                System.out.println("==============\nSaindo...");
                
                return;


              default:
                System.out.println("Opção Inválida. ");
                scanner.close();
                return;
           
        }
       
    }
}
}