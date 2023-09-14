public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Carro("VW", "Gol", 1999, 4);
        Veiculo veiculo2 = new Carro("GM", "Opala", 1964, 2);
        Veiculo veiculo3 = new Moto("Honda", "Cg", 2021, "Esportiva");

        veiculo1.acelerar();
        if (veiculo1 instanceof Carro) {
            ((Carro) veiculo1).abrirPorta();
        }

        veiculo2.acelerar();
        if (veiculo2 instanceof Carro) {
            ((Carro) veiculo2).abrirPorta();
        }

        veiculo3.acelerar();
        if (veiculo3 instanceof Moto) {
            ((Moto) veiculo3).empinar();
        }
    }
}
class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("O " + modelo + " está acelerando.");
    }

    public void frear() {
        System.out.println("O " + modelo + " está freando.");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}

class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro " + getModelo() + " está acelerando.");
    }

    public void abrirPorta() {
        System.out.println("Abrindo " + quantidadePortas + " portas do " + getModelo() + ".");
    }
}

class Moto extends Veiculo {
    private String tipo;

    public Moto(String marca, String modelo, int ano, String tipo) {
        super(marca, modelo, ano);
        this.tipo = tipo;
    }

    @Override
    public void acelerar() {
        System.out.println("A moto " + getModelo() + " está acelerando.");
    }

    public void empinar() {
        System.out.println("A moto " + getModelo() + " do tipo " + tipo + " está empinando.");
    }
}


