//1-
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[100];
        int numFuncionarios = 0;
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar um novo funcionário");
            System.out.println("2 - Listar todos os funcionários cadastrados");
            System.out.println("3 - Buscar um funcionário pelo CPF");
            System.out.println("4 - Sair do programa");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 1) {
                scanner.nextLine(); // limpa o buffer do teclado
                
                System.out.println("Digite o nome do funcionário:");
                String nome = scanner.nextLine();
                
                System.out.println("Digite o CPF do funcionário:");
                String cpf = scanner.nextLine();
                
                System.out.println("Digite o cargo do funcionário:");
                String cargo = scanner.nextLine();
                
                System.out.println("Digite o salário base do funcionário:");
                double salarioBase = scanner.nextDouble();
                
                System.out.println("Digite o número de horas trabalhadas pelo funcionário:");
                int horasTrabalhadas = scanner.nextInt();
                
                System.out.println("Digite o valor dos adicionais do funcionário:");
                double adicionais = scanner.nextDouble();
                
                System.out.println("Digite o valor dos descontos do funcionário:");
                double descontos = scanner.nextDouble();
                
                System.out.println("Digite o valor dos benefícios do funcionário:");
                double beneficios = scanner.nextDouble();
                
                Funcionario novoFuncionario = new Funcionario(nome, cpf, cargo, salarioBase, horasTrabalhadas, adicionais, descontos, beneficios);
                
                funcionarios[numFuncionarios] = novoFuncionario;
                numFuncionarios++;
                
                System.out.println("Funcionário cadastrado com sucesso!");
                
            } else if (opcao == 2) {
                System.out.println("Lista de funcionários:");
                
                for (int i = 0; i < numFuncionarios; i++) {
                    Funcionario f = funcionarios[i];
                    System.out.println("Nome: " + f.getNome());
                    System.out.println("CPF: " + f.getCpf());
                    System.out.println("Cargo: " + f.getCargo());
                    System.out.println("Salário Líquido: " + f.calcularSalarioLiquido());
                    System.out.println("Adicionais: " + f.getAdicionais());
                    System.out.println("Descontos: " + f.getDescontos());
                    System.out.println("Benefícios: " + f.getBeneficios());
                    System.out.println();
                }
                
            } else if (opcao == 3) {
                scanner.nextLine(); // limpa o buffer do teclado
                
                System.out.println("Digite o CPF do funcionário que deseja buscar:");
                String cpf = scanner.nextLine();
                
                boolean encontrado = false;
                
                for (int i = 0; i < numFuncionarios; i++) {
                    Funcionario f = funcionarios[i];
                    
                    if (f.getCpf().equals(cpf)) {
                        System.out.println("Nome: " + f.getNome());
                        System.out.println("CPF: " + f.getCpf());
                        System.out.println("Cargo: " + f.getCargo());
                        System.out.println("Salário Líquido: " + f.calcularSalarioLiquido());

// 2- Folha de pagamento 
              
        System.out.println("Informe o salário bruto do funcionário:");
        double salarioBruto = scanner.nextDouble();

        // Calcula o valor do salário por hora
        double salarioHora = salarioBruto / 220; // assumindo 220 horas trabalhadas no mês
        System.out.println("O valor do salário por hora é: " + salarioHora);

        // Verifica se o funcionário tem direito a adicional de periculosidade
        System.out.println("O funcionário tem direito a adicional de periculosidade? (S/N)");
        String opcaoPericulosidade = scanner.next().toUpperCase();
        double adicionalPericulosidade = 0;

        if (opcaoPericulosidade.equals("S")) {
            adicionalPericulosidade = salarioBruto * 0.3;
            System.out.println("O adicional de periculosidade é de: " + adicionalPericulosidade);
        }

        // Verifica se o funcionário tem direito a adicional de insalubridade
        System.out.println("O funcionário tem direito a adicional de insalubridade? (S/N)");
        String opcaoInsalubridade = scanner.next().toUpperCase();
        double adicionalInsalubridade = 0;

        if (opcaoInsalubridade.equals("S")) {
            adicionalInsalubridade = salarioBruto * 0.2;
            System.out.println("O adicional de insalubridade é de: " + adicionalInsalubridade);
        }

        // Calcula o valor do vale transporte
        System.out.println("Informe o valor do vale transporte:");
        double valorValeTransporte = scanner.nextDouble();
        double beneficioValeTransporte = valorValeTransporte * 0.06;
        System.out.println("O valor do benefício vale transporte é de: " + beneficioValeTransporte);

        // Calcula o valor do vale alimentação
        System.out.println("Informe o valor do vale alimentação:");
        double valorValeAlimentacao = scanner.nextDouble();
        double beneficioValeAlimentacao = valorValeAlimentacao * 0.1;
        System.out.println("O valor do benefício vale alimentação é de: " + beneficioValeAlimentacao);

        // Calcula o valor do INSS
        double inss = salarioBruto * 0.1;
        System.out.println("O valor do desconto de INSS é de: " + inss);

        // Calcula o valor do FGTS
        double fgts = salarioBruto * 0.08;
        System.out.println("O valor do desconto de FGTS é de: " + fgts);

        // Calcula o valor do IRRF
        double irrf = 0;
        double salarioBase = salarioBruto + adicionalPericulosidade + adicionalInsalubridade + beneficioValeTransporte + beneficioValeAlimentacao;
        double baseCalculoIRRF = salarioBase - inss;
        if (baseCalculoIRRF <= 1903.98) {
            irrf = 0;
        } else if (baseCalculoIRRF <= 2826.65) {
            irrf = baseCalculoIRRF *


// 3 - Folha de Pagamento (coleta de dados do funcionário)
              
        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite o cargo ocupado pelo funcionário: ");
        String cargo = scanner.nextLine();

        System.out.println("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o valor dos adicionais (periculosidade e insalubridade) recebidos: ");
        double adicionais = scanner.nextDouble();

        System.out.println("Digite o valor dos descontos (INSS, FGTS e IRRF) aplicados: ");
        double descontos = scanner.nextDouble();

        System.out.println("Digite o valor dos benefícios (vale transporte e vale alimentação) recebidos: ");
        double beneficios = scanner.nextDouble();

        // cálculo dos valores da folha de pagamento
        double valorHora = salarioBase / horasTrabalhadas;
        double valorPericulosidade = 0;
        double valorInsalubridade = 0;

        // verifica se o funcionário tem direito ao adicional de periculosidade
        System.out.println("O funcionário tem direito ao adicional de periculosidade? (S/N)");
        String respostaPericulosidade = scanner.next();
        if (respostaPericulosidade.equalsIgnoreCase("S")) {
            valorPericulosidade = (salarioBase + adicionais) * 0.3;
        }

        // verifica se o funcionário tem direito ao adicional de insalubridade
        System.out.println("O funcionário tem direito ao adicional de insalubridade? (S/N)");
        String respostaInsalubridade = scanner.next();
        if (respostaInsalubridade.equalsIgnoreCase("S")) {
            valorInsalubridade = (salarioBase + adicionais) * 0.2;
        }

        double valorValeTransporte = salarioBase * 0.06;
        double valorValeAlimentacao = salarioBase * 0.1;

        double valorINSS = salarioBase * 0.11;
        double valorFGTS = salarioBase * 0.08;
        double valorIRRF = salarioBase * 0.15 - descontos;

        double salarioLiquido = salarioBase + valorPericulosidade + valorInsalubridade + beneficios - valorINSS - valorFGTS - valorIRRF;

        // exibição do relatório de folha de pagamento
        System.out.println("\nRelatório de Folha de Pagamento:");
        System.out.println("Nome do funcionário: " + nome);
        System.out.println("CPF do funcionário: " + cpf);
        System.out.println("Cargo do funcionário: " + cargo);
        System.out.println("Salário Base do funcionário: " + salarioBase);
        System.out.println("Horas trabalhadas no mês: " + horasTrabalhadas);
        System.out.println("Valor da hora trabalhada: " + valorHora);
        System.out.println("Valor do adicional de: " + valorAdicional);
      

 // Folha de pagamento
        String nome, cpf, cargo;
        double salarioBase, horasTrabalhadas, adicionais, descontos, beneficios, valorHora;

        System.out.println("Informe o nome do funcionário:");
        nome = input.nextLine();
        System.out.println("Informe o CPF do funcionário:");
        cpf = input.nextLine();
        System.out.println("Informe o cargo do funcionário:");
        cargo = input.nextLine();
        System.out.println("Informe o salário base do funcionário:");
        salarioBase = input.nextDouble();
        System.out.println("Informe as horas trabalhadas no mês:");
        horasTrabalhadas = input.nextDouble();
        System.out.println("Informe o valor dos adicionais:");
        adicionais = input.nextDouble();
        System.out.println("Informe o valor dos descontos:");
        descontos = input.nextDouble();
        System.out.println("Informe o valor dos benefícios:");
        beneficios = input.nextDouble();

        // Calcula o valor da hora trabalhada
        valorHora = salarioBase / horasTrabalhadas;

        // Calcula os adicionais de periculosidade e insalubridade
        double adicionalPericulosidade = 0.0;
        double adicionalInsalubridade = 0.0;
        boolean recebePericulosidade = false;
        boolean recebeInsalubridade = false;
        System.out.println("O funcionário recebe adicional de periculosidade? (S/N)");
        String resposta = input.next();
        if (resposta.equalsIgnoreCase("S")) {
            recebePericulosidade = true;
            adicionalPericulosidade = salarioBase * 0.3;
        }
        System.out.println("O funcionário recebe adicional de insalubridade? (S/N)");
        resposta = input.next();
        if (resposta.equalsIgnoreCase("S")) {
            recebeInsalubridade = true;
            adicionalInsalubridade = salarioBase * 0.2;
        }

        // Calcula o valor do vale transporte e do vale alimentação
        double valeTransporte = 0.0;
        double valeAlimentacao = 0.0;
        double salarioBruto = salarioBase + adicionais + beneficios;
        if (salarioBruto > 2000.0) {
            valeTransporte = salarioBase * 0.06;
            valeAlimentacao = salarioBase * 0.1;
        }

        // Calcula o desconto de INSS, FGTS e IRRF
        double inss = salarioBruto * 0.11;
        double fgts = salarioBruto * 0.08;
        double irrf = 0.0;
        double salarioLiquido = salarioBruto - descontos - inss - fgts;
        if (salarioLiquido > 1903.98 && salarioLiquido <= 2826.65) {
            irrf = (salarioLiquido * 0.075) - 142.80;
        } else if (salarioLiquido > 2826.65 && salarioLiquido <= 3751.05) {
            irrf = (salarioLiquido * 0.15) - 354.80;
        } else if (salarioLiquido > 3751.05 && salarioLiquido <= 4664.68) {


// 3.1- Obter valores do usuário

        Scanner sc = new Scanner(System.in);
          
        System.out.print("Informe o salário bruto: ");
        double salarioBruto = sc.nextDouble();
        
        System.out.print("Informe a quantidade de horas trabalhadas por dia: ");
        int horasPorDia = sc.nextInt();
        
        System.out.print("Informe a quantidade de dias trabalhados por semana: ");
        int diasPorSemana = sc.nextInt();
        
        // Realizar cálculos
        int horasPorSemana = horasPorDia * diasPorSemana;
        int horasPorMes = horasPorSemana * 4; // Considerando um mês com 4 semanas
        double salarioHora = salarioBruto / horasPorMes;
        
        // Exibir resultado
        System.out.printf("Salário por hora: R$ %.2f", salarioHora);
        
        sc.close();
    }
}

// 3.2- Calcular Periculosidade

        double adicional = salario * 0.3;
        return adicional;
    }
    
}

// 3.3- Calcular Insalubridade

    Scanner input = new Scanner(System.in);
        
        double salarioMinimo = 1380.60;
        
        System.out.print("Informe o grau de risco (baixo, medio ou alto): ");
        String grauRisco = input.next();
        
        double adicional = 0;
        
        switch(grauRisco) {
            case "baixo":
                adicional = 0.1;
                break;
            case "medio":
                adicional = 0.2;
                break;
            case "alto":
                adicional = 0.4;
                break;
            default:
                System.out.println("Grau de risco invalido!");
                return;
        }
        
        double valorAdicional = salarioMinimo * adicional;
        
        System.out.printf("Valor do adicional: R$ %.2f\n", valorAdicional);
        
        input.close();
    }

// 3.4- Vale transporte 

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário bruto: ");
        double salarioBruto = input.nextDouble();

        System.out.print("Digite o valor total dos vales transportes recebidos: ");
        double valorVT = input.nextDouble();

        double percentualDesconto = 0.06;
        double valorMaximoDesconto = salarioBruto * percentualDesconto;

        double valorDesconto = 0.0;
        if (valorVT < valorMaximoDesconto) {
            valorDesconto = valorVT;
        } else {
            valorDesconto = valorMaximoDesconto;
        }

        System.out.printf("Valor a descontar: R$ %.2f", valorDesconto);
    }

}

// 3.5- Vale Alimentação (Informações do funcionário)
  public class ValeAlimentacao {
    public static void main(String[] args) {
      
        double valorDiario = 24.00; // Valor do vale alimentação diário
        int diasTrabalhados = 26; // Quantidade de dias úteis trabalhados no mês
        
        // Cálculo do valor do vale alimentação
        double valorMensal = (valorDiario * diasTrabalhados);
        
        // Exibição do resultado
        System.out.println("Valor do Vale Alimentação: " + valorMensal);
    }
}
