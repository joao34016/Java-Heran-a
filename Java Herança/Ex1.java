import java.util.Scanner;

class Veiculo {
    public String Marca;
    public String Modelo;
    public String Combustivel;
    public int Ano;
    public String Cor;

    public Veiculo(String Marca, String Modelo, String Combustivel, int Ano, String Cor) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Combustivel = Combustivel;
        this.Ano = Ano;
        this.Cor = Cor;

    }

    public void mostrarDados() {
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Combustivel: " + Combustivel);
        System.out.println("Ano: " + Ano);
        System.out.println("Cor: " + Cor);
    }
}

// Classe Aluno herdando de SUPERCLASSE Pessoa
class Carro extends Veiculo {
    public int nr_portas;
    public String acessorios;
    public String direcao;

    public Carro(String Marca, String Modelo, String Combustivel, int Ano, String Cor, int nr_portas, String acessorios, String direcao) {
        super(Marca, Modelo, Combustivel, Ano, Cor);
        this.nr_portas = nr_portas;
        this.acessorios = acessorios;
        this.direcao = direcao;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Número de portas: " + nr_portas);
        System.out.println("Acessórios: " + acessorios);
        System.out.println("Direção: " + direcao);
    }
}

// Classe Professor herdando de SUPERCLASSE Pessoa
class Moto extends Veiculo {
    public int Cilindradas;
    public double Potencia;

    public Moto(String Marca, String Modelo, String Combustivel, int Ano, String Cor, int Cilindradas, double Potencia) {
        super(Marca, Modelo, Combustivel, Ano, Cor);
        this.Cilindradas = Cilindradas;
        this.Potencia = Potencia;
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Cilindradas: " + Cilindradas);
        System.out.println("Potencia: " + Potencia);
        
    
    }
}

// Programa principal (valores fixos exemplo)
public class Ex1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { 
            System.out.println("=====Menu=====");
            System.out.println("0 - Sair\n1 - Cadastrar Carro\n2 - Cadastrar Moto");
            int opc = scanner.nextInt();
            scanner.nextLine();
            switch (opc) {
               case 1:
                System.out.println("Digite a marca do carro: ");
                String Marca_carro = scanner.nextLine();
                System.out.println("Digite o modelo do carro: ");
                String Modelo_carro = scanner.nextLine();
                System.out.println("Digite o combustivel do carro: ");
                String Combustivel_carro = scanner.nextLine();
                System.out.println("Digite o Ano do carro: ");
                int Ano_carro = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o N° de portas: ");
                int nr_portas = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite o Acessorio do carro: ");
                String acessorios = scanner.nextLine();
                System.out.println("Digite a Direção do carro: ");
                String direcao = scanner.nextLine();
                System.out.println("Digite a cor do carro: ");
                String Cor_carro = scanner.nextLine();
                Carro carro = new Carro(Marca_carro, Modelo_carro, Combustivel_carro, Ano_carro, Cor_carro, nr_portas, acessorios, direcao);
                carro.mostrarDados();
                break;



               case 2: 
                System.out.println("Digite a marca da moto: ");
                String Marca_moto = scanner.nextLine();
                System.out.println("Digite o modelo da carro: ");
                String Modelo_moto = scanner.nextLine();
                System.out.println("Digite o combustivel da moto: ");
                String Combustivel_moto = scanner.nextLine();
                System.out.println("Digite o Ano da moto: ");
                int Ano_moto = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite a cor da moto: ");
                String Cor_moto = scanner.nextLine();
                System.out.println("Digite as Cilindradas da moto: ");
                int Cilindradas = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Digite a potencia da moto: ");
                Double Potencia = scanner.nextDouble();
                Moto moto = new Moto(Marca_moto, Modelo_moto, Combustivel_moto, Ano_moto, Cor_moto, Cilindradas, Potencia);
                moto.mostrarDados();
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