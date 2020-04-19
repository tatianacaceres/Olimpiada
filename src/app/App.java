package app;

public class App {
    public static void main(String[] args) throws Exception {
        Olimpiada olimpiadaCoronaEdition;
        olimpiadaCoronaEdition = new Olimpiada();
        Maratonista maratonista1;
        maratonista1 = new Maratonista();

        maratonista1.nombre = "Tatiana";
        maratonista1.nacionalidad = "Alemania";
        maratonista1.pasaporte = "AAA395";
        maratonista1.edad = 35;
        maratonista1.energia = 100;

        boolean corrio;
        maratonista1.participar(olimpiadaCoronaEdition);

        while (maratonista1.energia>0){

            corrio = maratonista1.correr();

        if (corrio) {
            System.out.println("El maratonista ha podido correr" + maratonista1.nombre);   
        } else {
            System.out.println("No ha podido correr, esta lesionado");
        }
    }
}
}