public class CelularBarato implements WiFi, Bluetooth, Camera, GPS, DualChip{

    public CelularBarato(){

    }

    @Override
    public void emparelhar(String dispositivo) {
        System.out.println("Celular Barato emparelhado com " + dispositivo);
    }

    @Override
    public void tirarFoto() {
        System.out.println("Celular Barato tirou foto!");
    }

    @Override
    public void gravarVideo() {
        System.out.println("Celular Barato gravou vídeo!");
    }

    @Override
    public void escolherChip(int numero) {
        System.out.println("Celular Barato esta usando o chip: " + numero + "!");
    }

    @Override
    public void localizar() {
        System.out.println("Celular Barato foi localizado!");
    }

    @Override
    public void conectarWiFi(String rede) {
        System.out.println("Celular Barato conectado na rede " + rede);
    }
}
