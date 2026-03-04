public class Main {
    public static void main(String[] args) {

        CelularBarato cb = new CelularBarato();
        CelularMedio cm = new CelularMedio();
        CelularCaro cc = new CelularCaro();

        System.out.println("==CELULAR BARATO==");
        cb.emparelhar("iPhone 13");
        cb.tirarFoto();
        cb.gravarVideo();
        cb.escolherChip(2);
        cb.localizar();
        cb.conectarWiFi("Visitantes");
        System.out.println("");
        System.out.println("==CELULAR MÉDIO==");
        cm.emparelhar("iPhone 13");
        cm.tirarFoto();
        cm.gravarVideo();
        cm.escolherChip(2);
        cm.localizar();
        cm.conectarWiFi("Visitantes");
        cm.desbloquearComDigital();
        cm.conectar5G();
        System.out.println("");
        System.out.println("==CELULAR CARO==");
        cc.emparelhar("iPhone 13");
        cc.tirarFoto();
        cc.gravarVideo();
        cc.escolherChip(2);
        cc.localizar();
        cc.conectarWiFi("Visitantes");
        cc.desbloquearComDigital();
        cc.conectar5G();
        cc.desbloquearComRosto();
        cc.fazerPagamento("Starbucks");
        cc.iniciarCarregamento();
    }
}