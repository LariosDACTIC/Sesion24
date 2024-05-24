public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        TelefonoInteligente t1 = new TelefonoInteligente();
        TelefonoBasico t2 = new TelefonoBasico();

        t1.Marca = "Iphone";
        t1.Modelo = "Iphone 12Pro Max";
        t1.Precio = 750.00;
        t1.setCosto(500);;
        t1.CantidadRam= 16;
        

        t1.MostrarTelefonoInteligente();

        t2.Marca = "Nokia";
        t2.Modelo = "T12";
        t2.Precio = 90.00;
        t2.setCosto(60.00);;
        t2.Radio= true;
    

        t2.MostrarTelefonoBasico();


        System.out.println("el costo del iphone es "+t1.getCosto("admin"));
        System.out.println("el costo del Nokia es "+t2.getCosto("Cliente1"));

    }
}
