import java.util.Scanner;

class Instrumento {
    public String Marca;
    public String Modelo;
    public double Tamanho;

    public Instrumento(String Marca, String Modelo, double Tamanho) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tamanho = Tamanho;

    }

    public void mostrarDados() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Tamanho: " + Tamanho);
    }
    public void tocar(){
        System.out.println("Instrumento está tocanado. ");
    }
}

// Classe Aluno herdando de SUPERCLASSE Pessoa
class Violao extends Instrumento {
    public int nr_cordas;
    public String nome;

    public Violao(String Marca, String Modelo, double Tamanho, int nr_cordas, String nome) {
        super(Marca, Modelo, Tamanho);
        this.nr_cordas = nr_cordas;
        this.nome = nome;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de cordas do violão: " + nr_cordas);
        System.out.println("Nome do violão: " + nome);
    }
    public void tocar(){
        System.out.println("Violão tocando acordes");
    }
}

// Classe Professor herdando de SUPERCLASSE Pessoa
class Piano extends Instrumento {
    public String nome;
    public int qtd_teclas;

    public Piano(String Marca, String Modelo, double Tamanho, String nome, int qtd_teclas) {
        super(Marca, Modelo, Tamanho);
        this.nome = nome;
        this.qtd_teclas = qtd_teclas;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Nome do Piano: " + nome);
        System.out.println("Quantidade de teclas: " + qtd_teclas);
        
    
    }
    public void tocar(){
        super.tocar();
        System.out.println("Piano tocando melodia. ");
    }
}

// Programa principal (valores fixos exemplo)
public class Ex2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            System.out.println("=====Menu=====");
            System.out.println("0 - Sair\n1 - Cadastrar Violão\n2 - Cadastrar Piano");
            int opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
               case 1:
                System.out.println("Digite a marca do Violão: ");
                String Marca_violao = scanner.nextLine();
                System.out.println("Digite o modelo do Violão: ");
                String Modelo_violao = scanner.nextLine();
                System.out.println("Digite o tamanho do Violão: ");
                Double Tamanho_violao = scanner.nextDouble();
                System.out.println("Digite o número de cordas do Violão: ");
                int nr_cordas = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o nome do Violão: ");
                String Nome_violao = scanner.nextLine();

                

                Violao violao = new Violao(Marca_violao, Modelo_violao, Tamanho_violao, nr_cordas, Nome_violao);
                violao.mostrarDados();
                violao.tocar();
                break;



               case 2: 
                System.out.println("Digite a marca do Piano: ");
                String Marca_piano = scanner.nextLine();
                System.out.println("Digite o modelo do Piano: ");
                String Modelo_piano = scanner.nextLine();
                System.out.println("Digite o tamanho do Piano: ");
                Double Tamanho_piano = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Digite o nome do Piano: ");
                String Nome_piano = scanner.nextLine();
                System.out.println("Digite a quantidade de teclas do Piano: ");
                int Qtd_teclas = scanner.nextInt();


                Piano piano = new Piano(Marca_piano, Modelo_piano, Tamanho_piano, Nome_piano, Qtd_teclas);
                piano.mostrarDados();
                piano.tocar();
                break;
                

             case 0: 
                System.out.println("Saindo...");
                scanner.close();
                break;


              default:
                System.out.println("Opção Inválida. ");
                return;
            
        }
       
    }
}
}