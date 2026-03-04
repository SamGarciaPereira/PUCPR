public class CelularMedio implements  WiFi, Bluetooth, Camera, GPS, DualChip, Rede5G, SensorBiometrico{

    public CelularMedio(){

    }

    @Override
    public void emparelhar(String dispositivo) {
        System.out.println("Celular Médio emparelhado com " + dispositivo);
    }

    @Override
    public void tirarFoto() {
        System.out.println("Celular Médio tirou foto!");
    }

    @Override
    public void gravarVideo() {
        System.out.println("Celular Médio gravou vídeo!");
    }

    @Override
    public void escolherChip(int numero) {
        System.out.println("Celular Médio esta usando o chip: " + numero + "!");
    }

    @Override
    public void localizar() {
        System.out.println("Celular Médio foi localizado!");
    }

    @Override
    public void conectar5G() {
        System.out.println("Celular Médio esta conectado a rede 5G!");
    }

    @Override
    public void desbloquearComDigital() {
        System.out.println("Celular Médio foi desbloqueado usando biometria!");
    }

    @Override
    public void conectarWiFi(String rede) {
        System.out.println("Celular Médio conectado na rede " + rede);
    }
}

