import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);        

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
            while (TipoQuarto != 1 || TipoQuarto != 2) {
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
            // TRATAMENTO EM CASO DE TODOS OS QUARTOS ESTAREM OCUPADOS
            if (CriandoQuartos.Quarto01.isStatusQuarto() == false && CriandoQuartos.Quarto02.isStatusQuarto() == false && CriandoQuartos.Quarto03.isStatusQuarto() == false && CriandoQuartos.Quarto04.isStatusQuarto() == false) {
                System.out.println("Não é possível realizar reserva, todos os quartos estão ocupados!");
                return;
            }

            // EXIBINDO QUARTOS DISPONIVEIS
            System.out.println("Qual quarto deseja reservar?");

            if (CriandoQuartos.Quarto01.isStatusQuarto() == true) {
                System.out.println("Quarto " + CriandoQuartos.Quarto01.getNumeroQuarto());
            }
            if (CriandoQuartos.Quarto02.isStatusQuarto() == true) {
                System.out.println("Quarto " + CriandoQuartos.Quarto02.getNumeroQuarto());
            }
            if (CriandoQuartos.Quarto03.isStatusQuarto() == true) {
                System.out.println("Quarto " + CriandoQuartos.Quarto03.getNumeroQuarto());
            }
            if (CriandoQuartos.Quarto04.isStatusQuarto() == true) {
                System.out.println("Quarto " + CriandoQuartos.Quarto04.getNumeroQuarto());
            }

            System.out.println("Digite o número do quarto que deseja reservar:");
            QuartoReservar = Teclado.nextInt();

            // VALIDANDO RESPOSTA DO USUARIO
            if (QuartoReservar != CriandoQuartos.Quarto01.getNumeroQuarto() || QuartoReservar != CriandoQuartos.Quarto02.getNumeroQuarto() || QuartoReservar != CriandoQuartos.Quarto03.getNumeroQuarto() || QuartoReservar != CriandoQuartos.Quarto04.getNumeroQuarto()) {
                System.out.println("Número de quarto inexistente, informe novamente:");
                QuartoReservar = Teclado.nextInt();
            }

            // ENTRADA DE DADOS DO USUARIO
            System.out.println("Informe o número de pessoas que irá ficar no quarto:");
            Hospede01.setQtdHospedes(Teclado.nextInt());

            // TRATAMENTO DE ERRO CASO NUMERO DE HOSPEDES MAIOR QUE A CAPACIDADE DO QUARTO
            if (QuartoReservar == CriandoQuartos.Quarto01.getNumeroQuarto()) {
                capacidadeMaxima = CriandoQuartos.Quarto01.getCapacidadeMaxima();
            } else if (QuartoReservar == CriandoQuartos.Quarto02.getNumeroQuarto()) {
                capacidadeMaxima = CriandoQuartos.Quarto02.getCapacidadeMaxima();
            } else if (QuartoReservar == CriandoQuartos.Quarto03.getNumeroQuarto()) {
                capacidadeMaxima = CriandoQuartos.Quarto03.getCapacidadeMaxima();
            } else if (QuartoReservar == CriandoQuartos.Quarto04.getNumeroQuarto()) {
                capacidadeMaxima = CriandoQuartos.Quarto04.getCapacidadeMaxima();
            }

            if (Hospede01.getQtdHospedes() > capacidadeMaxima) {
                System.out.println("Número de hóspedes excede a capacidade do quarto!");
                return;
            }

            // ENTRADA DO NOME DO HOSPEDE
            System.out.println("Informe o nome da pessoa que vai fazer a reserva:");
            Hospede01.setNomeHospede(Teclado.nextLine());

            if (QuartoReservar == CriandoQuartos.Quarto01.getNumeroQuarto()) {
                CriandoQuartos.Quarto01.setStatusQuarto(true);
            } else if (QuartoReservar == CriandoQuartos.Quarto02.getNumeroQuarto()) {
                CriandoQuartos.Quarto02.setStatusQuarto(true);
            } else if (QuartoReservar == CriandoQuartos.Quarto03.getNumeroQuarto()) {
                CriandoQuartos.Quarto03.setStatusQuarto(true);
            } else if (QuartoReservar == CriandoQuartos.Quarto04.getNumeroQuarto()) {
                CriandoQuartos.Quarto04.setStatusQuarto(true);
            }

            System.out.println("Reserva concluida!");
        }
        
        public void RealizarCheckOut(){
            
        }

        public void ExibirQuartos(){
            // QUARTO UM
            System.out.println("--- Quarto " + CriandoQuartos.Quarto01.getNumeroQuarto() + " ---");
            System.out.println("Tipo do quarto: " + CriandoQuartos.Quarto01.getTipoQuarto());
            System.out.println("Capacidade máxima: " + CriandoQuartos.Quarto01.getCapacidadeMaxima());
            if (CriandoQuartos.Quarto01.isStatusQuarto() == true) {
                System.out.println("Status: Livre");
            }else{
                System.out.println("Status: Ocupado");
            }
            System.out.println("");
            
            // QUARTO DOIS
            System.out.println("--- Quarto " + CriandoQuartos.Quarto02.getNumeroQuarto() + " ---");
            System.out.println("Tipo do quarto: " + CriandoQuartos.Quarto02.getTipoQuarto());
            System.out.println("Capacidade máxima: " + CriandoQuartos.Quarto02.getCapacidadeMaxima());
            if (CriandoQuartos.Quarto02.isStatusQuarto() == true) {
                System.out.println("Status: Livre");
            }else{
                System.out.println("Status: Ocupado");
            }
            System.out.println("");

            // QUARTO TRES
            System.out.println("--- Quarto " + CriandoQuartos.Quarto03.getNumeroQuarto() + " ---");
            System.out.println("Tipo do quarto: " + CriandoQuartos.Quarto03.getTipoQuarto());
            System.out.println("Capacidade máxima: " + CriandoQuartos.Quarto03.getCapacidadeMaxima());
            if (CriandoQuartos.Quarto03.isStatusQuarto() == true) {
                System.out.println("Status: Livre");
            }else{
                System.out.println("Status: Ocupado");
            }
            System.out.println("");

            // QUARTO QUATRO
            System.out.println("--- Quarto " + CriandoQuartos.Quarto04.getNumeroQuarto() + " ---");
            System.out.println("Tipo do quarto: " + CriandoQuartos.Quarto04.getTipoQuarto());
            System.out.println("Capacidade máxima: " + CriandoQuartos.Quarto04.getCapacidadeMaxima());
            if (CriandoQuartos.Quarto04.isStatusQuarto() == true) {
                System.out.println("Status: Livre");
            }else{
                System.out.println("Status: Ocupado");
            }
            System.out.println("");
        }

        public void EncerrarSistema(){
            
        }
    }
}