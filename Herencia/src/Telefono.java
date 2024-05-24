public class Telefono {

    public String Marca;
    public String Modelo;
    public double Precio;
    private double Costo;

    public void MostrarTelefono() {
        System.out.print("Marca: " + Marca + " Modelo: " + Modelo + " Precio: " + Precio + " Costo " + Costo);
    }

    public void setCosto(double cost) {
        this.Costo = cost;
    }

    public double getCosto(String user) {
        if (user.equalsIgnoreCase("Admin")) {
     return this.Costo;   
        }else{
            return 0.00;
        }
    }

}
