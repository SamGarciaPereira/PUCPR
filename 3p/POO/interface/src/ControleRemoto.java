public class ControleRemoto implements Controlador {

    public int volume;
    public boolean statusTV;
    public boolean statusMenu;
    public boolean statusMudo;
    public boolean videoTocando;

    public ControleRemoto(){
        this.volume = 5;
        this.statusTV = false;
        this.statusMenu = false;
        this.statusMudo = false;
        this.videoTocando = false;
    }

    @Override
    public void ligar() {
        this.statusTV = true;
    }

    @Override
    public void desligar() {
        this.statusTV = false;
    }

    @Override
    public void abrirMenu() {
        if(this.tvLigada()) {
            System.out.print("Volume: ");
            for(int i = 0; i <= this.volume; i++){
                System.out.print("|");
            }
            System.out.print("\n");
        }
    }

    @Override
    public void fecharMenu() {
        if(menuAberto()){
            this.statusMenu = false;
        }
    }

    @Override
    public void aumentarVolume() {
        if(this.tvLigada()) {
            if (this.volume < 10) {
                this.volume++;
            }
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.tvLigada()) {
            if(this.volume > 0) {
                this.volume--;
            }
        }
    }

    @Override
    public void mudo() {
        if(this.tvLigada()) {
            if(this.statusMudo()) {
                this.statusMudo = false;
            }
            else{
                this.statusMudo = true;
            }
        }
    }


    @Override
    public void play() {
        this.videoTocando = true;
    }

    @Override
    public void pause() {
        this.videoTocando = false;
    }

    public boolean tvLigada(){
        return this.statusTV;
    }

    public boolean menuAberto(){
        return this.statusMenu;
    }

    public boolean statusMudo(){
        return this.statusMudo;
    }



}
