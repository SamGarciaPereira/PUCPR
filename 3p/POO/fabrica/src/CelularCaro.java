public class CelularCaro implements WiFi, Bluetooth, Camera, GPS, DualChip, Rede5G, SensorBiometrico, NFC, ReconhecimentoFacial, CarregamentoSemFio {

    public CelularCaro(){

    }

    @Override
    public void emparelhar(String dispositivo) {
        System.out.println("Celular Caro emparelhado com " + dispositivo);
    }

    @Override
    public void tirarFoto() {
        System.out.println("Celular Caro tirou foto!");
    }

    @Override
    public void gravarVideo() {
        System.out.println("Celular Caro gravou vídeo!");
    }

    @Override
    public void iniciarCarregamento() {
        System.out.println("Celular Caro iniciou carregamento sem fio!");
    }

    @Override
    public void escolherChip(int numero) {
        System.out.println("Celular Caro esta usando o chip: " + numero + "!");
    }

    @Override
    public void localizar() {
        System.out.println("Celular Caro foi localizado!");
    }

    @Override
    public void fazerPagamento(String loja) {
        System.out.println("Celular Caro realizou pagamento na loja " + loja + "!");
    }

    @Override
    public void desbloquearComRosto() {
        System.out.println("Celular Caro foi desbloqueado usando desbloqueio facial!");
    }

    @Override
    public void conectar5G() {
        System.out.println("Celular Caro esta conectado a rede 5G!");
    }

    @Override
    public void desbloquearComDigital() {
        System.out.println("Celular Caro foi desbloqueado usando biometria!");
    }

    @Override
    public void conectarWiFi(String rede) {
        System.out.println("Celular Caro conectado na rede " + rede);
    }
}
