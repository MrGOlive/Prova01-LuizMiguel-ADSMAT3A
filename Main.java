import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // CRIANDO OS QUARTOS DO HOTEL
        Menu AtendimentoHotel = new Menu();
        AtendimentoHotel.CriandoQuartos.CriandoQuartos();
 
        // INICIANDO O ATENDIMENTO - O SISTEMA SÓ ENCERRA QUANDO O ATENDENTE ESCOLHER A OPÇÃO 4
        int OpcaoEscolhida = 0;
 
        do {
            AtendimentoHotel.Inicio();
            OpcaoEscolhida = AtendimentoHotel.InicioAtendimento;
 
            if (OpcaoEscolhida == 1) {
                AtendimentoHotel.RealizarReserva();
            } else if (OpcaoEscolhida == 2) {
                AtendimentoHotel.RealizarCheckOut();
            } else if (OpcaoEscolhida == 3) {
                AtendimentoHotel.ExibirQuartos();
            } else if (OpcaoEscolhida == 4) {
                AtendimentoHotel.EncerrarSistema();
            }
 
        } while (OpcaoEscolhida != 4);
    }
    }

    // CLASSE PARA CRIAR OS QUARTOS
    public class CriarQuarto{
        Scanner Teclado = new Scanner(System.in);        

        // ATRIBUTOS
        Quarto Quarto01 = new Quarto();
        Quarto Quarto02 = new Quarto();
        Quarto Quarto03 = new Quarto();
        Quarto Quarto04 = new Quarto();
        public int TipoQuarto;
        public int Status;

        // METODO
        public void CriandoQuartos(){

            // PRIMEIRO QUARTO
            System.out.println("Informações do primeiro quarto");

            // NUMERO DO QUARTO
            System.out.println("Qual o numero do primeiro quarto?");
            Quarto01.setNumeroQuarto(Teclado.nextInt());

            // TIPO DO QUARTO
            System.out.println("Informe se o quarto é:\nbásico - 1\nluxo - 2");
            TipoQuarto = Teclado.nextInt();

            // TRATAMENTO DE ERRO CASO NÚMERO ERRADO
            while (TipoQuarto != 1 && TipoQuarto != 2) {
                System.out.println("Número inválido, digite novamente:\nbásico - 1\nluxo - 2");
                TipoQuarto = Teclado.nextInt();
            }

            if (TipoQuarto == 1){
                Quarto01.setTipoQuarto("básico");
            }else{
                Quarto01.setTipoQuarto("luxo");
            }

            // CAPACIDADE MÁXIMA DO QUARTO
            System.out.println("Digite a capacidade máxima do quarto:");
            Quarto01.setCapacidadeMaxima(Teclado.nextInt());

            // STATUS DO QUARTO
            System.out.println("O quarto está disponível?\nSim - 1\nNão - 2");
            Status = Teclado.nextInt();

            // TRATAMENTO DE ERRO CASO NÚMERO ERRADO
            while (Status != 1 || Status != 2) {
                System.out.println("Número inválido, digite novamente:\nSim - 1\nNão - 2");
                Status = Teclado.nextInt();
            }

            if (Status == 1){
                Quarto01.setStatusQuarto(true);
            }else{
                Quarto01.setStatusQuarto(false);
            }

            // SEGUNDO QUARTO
            System.out.println("Informações do segundo quarto");

            // NUMERO DO QUARTO
            System.out.println("Qual o numero do primeiro quarto?");
            Quarto02.setNumeroQuarto(Teclado.nextInt());

            // TIPO DO QUARTO
            System.out.println("Informe se o quarto é:\nbásico - 1\nluxo - 2");
            TipoQuarto = Teclado.nextInt();

            // TRATAMENTO DE ERRO CASO NÚMERO ERRADO
            while (TipoQuarto != 1 || TipoQuarto != 2) {
                System.out.println("Número inválido, digite novamente:\nbásico - 1\nluxo - 2");
                TipoQuarto = Teclado.nextInt();
            }

            if (TipoQuarto == 1){
                Quarto02.setTipoQuarto("básico");
            }else{
                Quarto02.setTipoQuarto("luxo");
            }

            // CAPACIDADE MÁXIMA DO QUARTO
            System.out.println("Digite a capacidade máxima do quarto:");
            Quarto02.setCapacidadeMaxima(Teclado.nextInt());

            // STATUS DO QUARTO
            System.out.println("O quarto está disponível?\nSim - 1\nNão - 2");
            Status = Teclado.nextInt();

            // TRATAMENTO DE ERRO CASO NÚMERO ERRADO
            while (Status != 1 || Status != 2) {
                System.out.println("Número inválido, digite novamente:\nSim - 1\nNão - 2");
                Status = Teclado.nextInt();
            }

            if (Status == 1){
                Quarto02.setStatusQuarto(true);
            }else{
                Quarto02.setStatusQuarto(false);
            }

            // TERCEIRO QUARTO
            System.out.println("Informações do primeiro quarto");

            // NUMERO DO QUARTO
            System.out.println("Qual o numero do primeiro quarto?");
            Quarto03.setNumeroQuarto(Teclado.nextInt());

            // TIPO DO QUARTO
            System.out.println("Informe se o quarto é:\nbásico - 1\nluxo - 2");
            TipoQuarto = Teclado.nextInt();

            // TRATAMENTO DE ERRO CASO NÚMERO ERRADO
            while (TipoQuarto != 1 || TipoQuarto != 2) {
                System.out.println("Número inválido, digite novamente:\nbásico - 1\nluxo - 2");
                TipoQuarto = Teclado.nextInt();
            }

            if (TipoQuarto == 1){
                Quarto03.setTipoQuarto("básico");
            }else{
                Quarto03.setTipoQuarto("luxo");
            }

            // CAPACIDADE MÁXIMA DO QUARTO
            System.out.println("Digite a capacidade máxima do quarto:");
            Quarto03.setCapacidadeMaxima(Teclado.nextInt());

            // STATUS DO QUARTO
            System.out.println("O quarto está disponível?\nSim - 1\nNão - 2");
            Status = Teclado.nextInt();

            // TRATAMENTO DE ERRO CASO NÚMERO ERRADO
            while (Status != 1 || Status != 2) {
                System.out.println("Número inválido, digite novamente:\nSim - 1\nNão - 2");
                Status = Teclado.nextInt();
            }

            if (Status == 1){
                Quarto03.setStatusQuarto(true);
            }else{
                Quarto03.setStatusQuarto(false);
            }

            // QUARTO QUARTO kkkkk
            System.out.println("Informações do primeiro quarto");

            // NUMERO DO QUARTO
            System.out.println("Qual o numero do primeiro quarto?");
            Quarto04.setNumeroQuarto(Teclado.nextInt());

            // TIPO DO QUARTO
            System.out.println("Informe se o quarto é:\nbásico - 1\nluxo - 2");
            TipoQuarto = Teclado.nextInt();

            // TRATAMENTO DE ERRO CASO NÚMERO ERRADO
            while (TipoQuarto != 1 || TipoQuarto != 2) {
                System.out.println("Número inválido, digite novamente:\nbásico - 1\nluxo - 2");
                TipoQuarto = Teclado.nextInt();
            }

            if (TipoQuarto == 1){
                Quarto04.setTipoQuarto("básico");
            }else{
                Quarto04.setTipoQuarto("luxo");
            }

            // CAPACIDADE MÁXIMA DO QUARTO
            System.out.println("Digite a capacidade máxima do quarto:");
            Quarto04.setCapacidadeMaxima(Teclado.nextInt());

            // STATUS DO QUARTO
            System.out.println("O quarto está disponível?\nSim - 1\nNão - 2");
            Status = Teclado.nextInt();

            // TRATAMENTO DE ERRO CASO NÚMERO ERRADO
            while (Status != 1 || Status != 2) {
                System.out.println("Número inválido, digite novamente:\nSim - 1\nNão - 2");
                Status = Teclado.nextInt();
            }

            if (Status == 1){
                Quarto04.setStatusQuarto(true);
            }else{
                Quarto04.setStatusQuarto(false);
            }
        }
    }

    // CLASSE DO MENU
    public class Menu{
        Scanner Teclado = new Scanner(System.in);        

        // ATRIBUTOS
        CriarQuarto CriandoQuartos = new CriarQuarto();
        Hospede Hospede01 = new Hospede();
        Hospede Hospede02 = new Hospede();
        Hospede Hospede03 = new Hospede();
        Hospede Hospede04 = new Hospede();
        Hospede Hospede05 = new Hospede();
        int capacidadeMaxima = 0;
        public int InicioAtendimento;
        public int QuartoReservar;

        // METODOS
        public void Inicio(){
            System.out.println("Bem vindo ao nosso hotel!\nO que deseja realizar?");
            System.out.println("Realizar reserva - 1\nRealizar Check-out - 2\nExibir Quartos - 3\nEncerrar - 4");
            
            InicioAtendimento = Teclado.nextInt();

            // TRATAMENTO DE ERRO CASO NÚMERO ERRADO
            while (InicioAtendimento != 1 || InicioAtendimento != 2 || InicioAtendimento != 3 || InicioAtendimento != 4) {
                System.out.println("Número inválido, digite novamente:");
                System.out.println("Bem vindo ao nosso hotel!\nO que deseja realizar?");
                System.out.println("Realizar reserva - 1\nRealizar Check-out - 2\nExibir Quartos - 3\nEncerrar - 4");
                InicioAtendimento = Teclado.nextInt();
            }
        }

        public void RealizarReserva(){
            if (CriandoQuartos.Quarto01.isStatusQuarto() == false &&
                CriandoQuartos.Quarto02.isStatusQuarto() == false &&
                CriandoQuartos.Quarto03.isStatusQuarto() == false &&
                CriandoQuartos.Quarto04.isStatusQuarto() == false) {
                System.out.println("Nao e possivel realizar uma reserva, pois todos os quartos estao ocupados no momento!");
                return;
            }
 
            // SOLICITANDO OS DADOS DO HOSPEDE
            System.out.println("Informe o nome do hospede responsavel pela reserva:");
            Teclado.nextLine(); // LIMPANDO O BUFFER ANTES DE LER O NOME
            String NomeHospede = Teclado.nextLine();
 
            System.out.println("Informe a quantidade de hospedes queirao se hospedar:");
            int QtdHospedes = Teclado.nextInt();
 
            // EXIBINDO OS QUARTOS DISPONIVEIS PARA O ATENDENTE
            System.out.println("Quartos disponiveis no momento:");
            if (CriandoQuartos.Quarto01.isStatusQuarto() == true) {
                System.out.println("Quarto " + CriandoQuartos.Quarto01.getNumeroQuarto() +
                        " (" + CriandoQuartos.Quarto01.getTipoQuarto() +
                        " - ate " + CriandoQuartos.Quarto01.getCapacidadeMaxima() + " hospede(s))");
            }
            if (CriandoQuartos.Quarto02.isStatusQuarto() == true) {
                System.out.println("Quarto " + CriandoQuartos.Quarto02.getNumeroQuarto() +
                        " (" + CriandoQuartos.Quarto02.getTipoQuarto() +
                        " - ate " + CriandoQuartos.Quarto02.getCapacidadeMaxima() + " hospede(s))");
            }
            if (CriandoQuartos.Quarto03.isStatusQuarto() == true) {
                System.out.println("Quarto " + CriandoQuartos.Quarto03.getNumeroQuarto() +
                        " (" + CriandoQuartos.Quarto03.getTipoQuarto() +
                        " - ate " + CriandoQuartos.Quarto03.getCapacidadeMaxima() + " hospede(s))");
            }
            if (CriandoQuartos.Quarto04.isStatusQuarto() == true) {
                System.out.println("Quarto " + CriandoQuartos.Quarto04.getNumeroQuarto() +
                        " (" + CriandoQuartos.Quarto04.getTipoQuarto() +
                        " - ate " + CriandoQuartos.Quarto04.getCapacidadeMaxima() + " hospede(s))");
            }
 
            // SOLICITANDO O NUMERO DO QUARTO DESEJADO
            System.out.println("Digite o numero do quarto que deseja reservar:");
            QuartoReservar = Teclado.nextInt();
 
            // VERIFICANDO SE O QUARTO INFORMADO EXISTE
            if (QuartoReservar != CriandoQuartos.Quarto01.getNumeroQuarto() &&
                QuartoReservar != CriandoQuartos.Quarto02.getNumeroQuarto() &&
                QuartoReservar != CriandoQuartos.Quarto03.getNumeroQuarto() &&
                QuartoReservar != CriandoQuartos.Quarto04.getNumeroQuarto()) {
                System.out.println("Quarto " + QuartoReservar + " nao existe! Retornando ao menu.");
                return;
            }
 
            // VERIFICANDO SE O QUARTO ESTA DISPONIVEL
            if (QuartoReservar == CriandoQuartos.Quarto01.getNumeroQuarto() && CriandoQuartos.Quarto01.isStatusQuarto() == false) {
                System.out.println("O quarto " + QuartoReservar + " esta indisponivel no momento! Retornando ao menu.");
                return;
            }
            if (QuartoReservar == CriandoQuartos.Quarto02.getNumeroQuarto() && CriandoQuartos.Quarto02.isStatusQuarto() == false) {
                System.out.println("O quarto " + QuartoReservar + " esta indisponivel no momento! Retornando ao menu.");
                return;
            }
            if (QuartoReservar == CriandoQuartos.Quarto03.getNumeroQuarto() && CriandoQuartos.Quarto03.isStatusQuarto() == false) {
                System.out.println("O quarto " + QuartoReservar + " esta indisponivel no momento! Retornando ao menu.");
                return;
            }
            if (QuartoReservar == CriandoQuartos.Quarto04.getNumeroQuarto() && CriandoQuartos.Quarto04.isStatusQuarto() == false) {
                System.out.println("O quarto " + QuartoReservar + " esta indisponivel no momento! Retornando ao menu.");
                return;
            }
 
            // VERIFICANDO SE A CAPACIDADE DO QUARTO E SUFICIENTE PARA A QUANTIDADE DE HOSPEDES
            int CapacidadeDoQuarto = 0;
 
            if (QuartoReservar == CriandoQuartos.Quarto01.getNumeroQuarto()) {
                CapacidadeDoQuarto = CriandoQuartos.Quarto01.getCapacidadeMaxima();
            } else if (QuartoReservar == CriandoQuartos.Quarto02.getNumeroQuarto()) {
                CapacidadeDoQuarto = CriandoQuartos.Quarto02.getCapacidadeMaxima();
            } else if (QuartoReservar == CriandoQuartos.Quarto03.getNumeroQuarto()) {
                CapacidadeDoQuarto = CriandoQuartos.Quarto03.getCapacidadeMaxima();
            } else if (QuartoReservar == CriandoQuartos.Quarto04.getNumeroQuarto()) {
                CapacidadeDoQuarto = CriandoQuartos.Quarto04.getCapacidadeMaxima();
            }
 
            if (QtdHospedes > CapacidadeDoQuarto) {
                System.out.println("A quantidade de hospedes informada excede a capacidade maxima do quarto " +
                        QuartoReservar + " (maximo: " + CapacidadeDoQuarto + " hospede(s)). Retornando ao menu.");
                return;
            }
 
            // REALIZANDO A RESERVA - REGISTRANDO O HOSPEDE E MARCANDO O QUARTO COMO OCUPADO
            Hospede NovoHospede = new Hospede();
            NovoHospede.setNomeHospede(NomeHospede);
            NovoHospede.setQtdHospedes(QtdHospedes);
 
            if (QuartoReservar == CriandoQuartos.Quarto01.getNumeroQuarto()) {
                CriandoQuartos.Quarto01.setStatusQuarto(false);
                Hospede01 = NovoHospede;
            } else if (QuartoReservar == CriandoQuartos.Quarto02.getNumeroQuarto()) {
                CriandoQuartos.Quarto02.setStatusQuarto(false);
                Hospede02 = NovoHospede;
            } else if (QuartoReservar == CriandoQuartos.Quarto03.getNumeroQuarto()) {
                CriandoQuartos.Quarto03.setStatusQuarto(false);
                Hospede03 = NovoHospede;
            } else if (QuartoReservar == CriandoQuartos.Quarto04.getNumeroQuarto()) {
                CriandoQuartos.Quarto04.setStatusQuarto(false);
                Hospede04 = NovoHospede;
            }
 
            System.out.println("Reserva realizada com sucesso! O quarto " + QuartoReservar +
                    " foi reservado para " + NomeHospede + ".");
        }
        
        public void RealizarCheckOut(){
            System.out.println("Informe o numero do quarto para realizar o check-out:");
            int QuartoCheckOut = Teclado.nextInt();
 
            // VERIFICANDO SE O QUARTO INFORMADO EXISTE
            if (QuartoCheckOut != CriandoQuartos.Quarto01.getNumeroQuarto() &&
                QuartoCheckOut != CriandoQuartos.Quarto02.getNumeroQuarto() &&
                QuartoCheckOut != CriandoQuartos.Quarto03.getNumeroQuarto() &&
                QuartoCheckOut != CriandoQuartos.Quarto04.getNumeroQuarto()) {
                System.out.println("Quarto " + QuartoCheckOut + " nao existe! Retornando ao menu.");
                return;
            }
 
            // VERIFICANDO SE O QUARTO ESTA DE FATO OCUPADO (so e possivel fazer check-out de quarto reservado)
            if (QuartoCheckOut == CriandoQuartos.Quarto01.getNumeroQuarto() && CriandoQuartos.Quarto01.isStatusQuarto() == true) {
                System.out.println("O quarto " + QuartoCheckOut + " ja esta disponivel, nao ha reserva ativa para liberar! Retornando ao menu.");
                return;
            }
            if (QuartoCheckOut == CriandoQuartos.Quarto02.getNumeroQuarto() && CriandoQuartos.Quarto02.isStatusQuarto() == true) {
                System.out.println("O quarto " + QuartoCheckOut + " ja esta disponivel, nao ha reserva ativa para liberar! Retornando ao menu.");
                return;
            }
            if (QuartoCheckOut == CriandoQuartos.Quarto03.getNumeroQuarto() && CriandoQuartos.Quarto03.isStatusQuarto() == true) {
                System.out.println("O quarto " + QuartoCheckOut + " ja esta disponivel, nao ha reserva ativa para liberar! Retornando ao menu.");
                return;
            }
            if (QuartoCheckOut == CriandoQuartos.Quarto04.getNumeroQuarto() && CriandoQuartos.Quarto04.isStatusQuarto() == true) {
                System.out.println("O quarto " + QuartoCheckOut + " ja esta disponivel, nao ha reserva ativa para liberar! Retornando ao menu.");
                return;
            }
 
            // REALIZANDO O CHECK-OUT - LIBERANDO O QUARTO E REMOVENDO O HOSPEDE
            if (QuartoCheckOut == CriandoQuartos.Quarto01.getNumeroQuarto()) {
                CriandoQuartos.Quarto01.setStatusQuarto(true);
                Hospede01 = null;
            } else if (QuartoCheckOut == CriandoQuartos.Quarto02.getNumeroQuarto()) {
                CriandoQuartos.Quarto02.setStatusQuarto(true);
                Hospede02 = null;
            } else if (QuartoCheckOut == CriandoQuartos.Quarto03.getNumeroQuarto()) {
                CriandoQuartos.Quarto03.setStatusQuarto(true);
                Hospede03 = null;
            } else if (QuartoCheckOut == CriandoQuartos.Quarto04.getNumeroQuarto()) {
                CriandoQuartos.Quarto04.setStatusQuarto(true);
                Hospede04 = null;
            }
 
            System.out.println("Check-out do quarto " + QuartoCheckOut + " realizado com sucesso! O quarto esta disponivel para novas reservas.");
        }

        public void ExibirQuartos(){
            System.out.println("\n=== Quartos cadastrados no hotel ===\n");
 
            // QUARTO UM
            System.out.println("--- Quarto " + CriandoQuartos.Quarto01.getNumeroQuarto() + " ---");
            System.out.println("Tipo: " + CriandoQuartos.Quarto01.getTipoQuarto());
            System.out.println("Capacidade maxima: " + CriandoQuartos.Quarto01.getCapacidadeMaxima() + " hospede(s)");
            if (CriandoQuartos.Quarto01.isStatusQuarto() == true) {
                System.out.println("Status: Disponivel");
            } else {
                System.out.println("Status: Ocupado");
                if (Hospede01 != null) {
                    System.out.println("Hospede: " + Hospede01.getNomeHospede() + " (" + Hospede01.getQtdHospedes() + " pessoa(s))");
                }
            }
            System.out.println("");
 
            // QUARTO DOIS
            System.out.println("--- Quarto " + CriandoQuartos.Quarto02.getNumeroQuarto() + " ---");
            System.out.println("Tipo: " + CriandoQuartos.Quarto02.getTipoQuarto());
            System.out.println("Capacidade maxima: " + CriandoQuartos.Quarto02.getCapacidadeMaxima() + " hospede(s)");
            if (CriandoQuartos.Quarto02.isStatusQuarto() == true) {
                System.out.println("Status: Disponivel");
            } else {
                System.out.println("Status: Ocupado");
                if (Hospede02 != null) {
                    System.out.println("Hospede: " + Hospede02.getNomeHospede() + " (" + Hospede02.getQtdHospedes() + " pessoa(s))");
                }
            }
            System.out.println("");
 
            // QUARTO TRES
            System.out.println("--- Quarto " + CriandoQuartos.Quarto03.getNumeroQuarto() + " ---");
            System.out.println("Tipo: " + CriandoQuartos.Quarto03.getTipoQuarto());
            System.out.println("Capacidade maxima: " + CriandoQuartos.Quarto03.getCapacidadeMaxima() + " hospede(s)");
            if (CriandoQuartos.Quarto03.isStatusQuarto() == true) {
                System.out.println("Status: Disponivel");
            } else {
                System.out.println("Status: Ocupado");
                if (Hospede03 != null) {
                    System.out.println("Hospede: " + Hospede03.getNomeHospede() + " (" + Hospede03.getQtdHospedes() + " pessoa(s))");
                }
            }
            System.out.println("");
 
            // QUARTO QUATRO
            System.out.println("--- Quarto " + CriandoQuartos.Quarto04.getNumeroQuarto() + " ---");
            System.out.println("Tipo: " + CriandoQuartos.Quarto04.getTipoQuarto());
            System.out.println("Capacidade maxima: " + CriandoQuartos.Quarto04.getCapacidadeMaxima() + " hospede(s)");
            if (CriandoQuartos.Quarto04.isStatusQuarto() == true) {
                System.out.println("Status: Disponivel");
            } else {
                System.out.println("Status: Ocupado");
                if (Hospede04 != null) {
                    System.out.println("Hospede: " + Hospede04.getNomeHospede() + " (" + Hospede04.getQtdHospedes() + " pessoa(s))");
                }
            }
            System.out.println("");
        }

        public void EncerrarSistema(){
            System.out.println("Sistema encerrado. Obrigado e até logo!");
        }
    }
}