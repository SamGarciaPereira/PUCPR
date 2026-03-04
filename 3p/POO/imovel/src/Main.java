public class Main {
    public static void main(String[] args) {
        Imovel i1 = new Imovel(500000);
        ImovelNovo in = new ImovelNovo(500000);
        ImovelVelho iv = new ImovelVelho(500000);

        i1.imprimirImovel();
        in.imprimirValorNovo();
        iv.imprimirValorVelho();


    
    }
}