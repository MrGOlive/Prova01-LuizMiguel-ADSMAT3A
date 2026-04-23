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
        public int InicioAtendimento;

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

        }
        
        public void RealizarCheckOut(){
            
        }

        public void ExibirQuartos(){
            
        }

        public void EncerrarSistema(){
            
        }
    }
}