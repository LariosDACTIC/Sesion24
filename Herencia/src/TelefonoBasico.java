public class TelefonoBasico extends Telefono{


    public boolean Radio ;//true // false
    public boolean juegoculebrita;


    public void MostrarTelefonoBasico(){
        MostrarTelefono();

        String rad= (Radio)?"SI":"NO";
        String j= (juegoculebrita)?"SI":"NO";
        System.out.println(" Tiene linterna: "+rad+" Tiene Juego "+j);

    }
}
