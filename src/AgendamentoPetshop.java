import java.util.Scanner;



public class AgendamentoPetshop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int dia, mes, ano;
        int hora, minuto;
        String nomePet, nomeDono, telefone;
        int servicoSelecionado;

        servicoSelecionado = exibirServicos(scanner);

        switch (servicoSelecionado) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                agendarBanho(scanner);
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }

    public static int exibirServicos(Scanner scanner) {
        System.out.println("Serviços disponíveis:");
        System.out.println("1. Banho e tosa");
        System.out.println("2. Banho");
        System.out.println("3. Tosa");
        System.out.println("4. Hidratação");
        System.out.println("5. Corte de unhas");
        System.out.println("6. Limpeza de ouvidos");
        System.out.print("Digite o número correspondente ao serviço desejado: ");
        int servicoSelecionado = scanner.nextInt();
        return servicoSelecionado;
    }

    public static void agendarBanho(Scanner scanner) {
        System.out.print("Digite o nome do pet: ");
        String nomePet = scanner.next();
        System.out.print("Digite o nome do dono: ");
        String nomeDono = scanner.next();
        System.out.print("Digite o telefone para contato: ");
        String telefone = scanner.next();
        exibirHorarios();
        System.out.print("Digite o número correspondente ao horário desejado: ");
        int horarioSelecionado = scanner.nextInt();
        System.out.print("Digite o dia do agendamento: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o mês do agendamento: ");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano do agendamento: ");
        int ano = scanner.nextInt();
        System.out.println("Agendamento realizado com sucesso!");
    }

    public static void exibirHorarios() {
        System.out.println("Horários disponíveis:");
        System.out.println("1. 09:00");
        System.out.println("2. 10:00");
        System.out.println("3. 11:00");
        System.out.println("4. 14:00");
        System.out.println("5. 15:00");
        System.out.println("6. 16:00");

    }

    @Override
    public String toString() {
        return "AgendamentoPetshop []";
    }

    

}
