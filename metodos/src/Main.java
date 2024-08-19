public class Main {
    public static void main(String[] args) {
       SmartTv smartTv = new SmartTv();

        System.out.println("Tv está ligada? " + smartTv.ligada);
        System.out.println("Qual o volume atual? " + smartTv.volume);
        System.out.println("Qual o canal que está? " + smartTv.canal);

        smartTv.ligarTv();

        System.out.println("Tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        System.out.println("Volume: " + smartTv.volume);


        smartTv.mudarCanal();

        System.out.println("Qual o canal que está? " + smartTv.canal);

        smartTv.escolherCanal(21);

        System.out.println("Qual o canal que está? " + smartTv.canal);
    }
}