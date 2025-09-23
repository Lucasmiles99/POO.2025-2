package Veiculo;

public class VeiculoMain {
    public static void main(String[] args) {
        Caminhao cam = new Caminhao(true, 6);
        Carro car = new Carro(true, 4);
        Moto moto = new Moto(true, 250);

        System.out.println(cam);
        System.out.println(car);
        System.out.println(moto);
    }
}