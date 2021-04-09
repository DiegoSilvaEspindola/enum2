package twoEnum;

public class Main {
    public static void main(String[] args) {
        Flores flores = new Flores();

        flores.corDasFlores = Cores.AMARELO.getTexto();

        //System.out.println(flores.corDasFlores);

        System.out.println("Seu arranjo é de "+ flores.buque1 + " na cor "+ flores.corDasFlores);
    }
}
