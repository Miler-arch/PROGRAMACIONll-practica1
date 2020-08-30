import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //cliente
        Cliente carlos = new Cliente( 1,"Pedro","Mamani","Rojas");

        //ciudad
        Ciudad cochabamba = new Ciudad(1,"Cochabamba");
        Ciudad santaCruz = new Ciudad(2,"Santa Cruz");
        Ciudad Tarija = new Ciudad(3,"Tarija");

        //categoria
        Categoria turista = new Categoria(1,"Turista");

        //aeropuertos
        Aeropuerto jorgewilstermanncamacho = new Aeropuerto("JW","Jorge Wilstermann Camacho",cochabamba);
        Aeropuerto viruViru = new Aeropuerto("vV","Viru Viru",santaCruz);
        Aeropuerto orielLea= new Aeropuerto("OL","Oriel Lea",Tarija);

        //vuelos
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cochabambasantaCruz = new Vuelo("BOA-157",Calendar.getInstance().getTime(),jorgewilstermanncamacho,viruViru);
        vuelos.add(cochabambasantaCruz);
        Vuelo santaCruzTarija = new Vuelo("BOA-154",Calendar.getInstance().getTime(),viruViru,orielLea);
        vuelos.add(santaCruzTarija);

        //billete
        Billete billete = new Billete(1,Calendar.getInstance().getTime(),650.5,carlos,cochabamba,Tarija,turista,vuelos);

        System.out.println("Billete");
        System.out.println("--------");
        System.out.println("Id: " + billete.getIdBillete());
        System.out.println("Fecha: " + billete.getFechaEmision());
        System.out.println("Precio: " + billete.getPrecioTotal());
        System.out.println("Cliene: " + billete.getCliente().getNombre());
        System.out.println("Origen: " + billete.getOrigen().getNombre());
        System.out.println("Destino: " + billete.getDestino().getNombre());
        System.out.println("Categoria: " + billete.getCategoria().getNombre());
        System.out.println("Vuelos: ");
        for (Vuelo vuelo:billete.getVuelos()){
            System.out.println("Codigo vuelo:" + vuelo.getCodigoVuelo() + " | Salida: " + vuelo.getSalida() + " | Origen:" + vuelo.getOrigen().getNombre() + "| Destino: " + vuelo.getDestino().getNombre());
        }

    }
}
