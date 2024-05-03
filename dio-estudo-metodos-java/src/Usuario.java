public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.desligar();
        System.out.println("Novo status-> TV ligada?" + smartTv.ligada);

        smartTv.ligar();
        System.out.println("Novo status-> TV ligada?" + smartTv.ligada);

        System.out.println("TV ligada ?"  + smartTv.ligada);
        System.out.println("Canal atual :" + smartTv.canal);
        System.out.println("Volume atual :" + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(12);
        System.out.println("Canal atual:" + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual:" + smartTv.volume);

        

        


    }
}
