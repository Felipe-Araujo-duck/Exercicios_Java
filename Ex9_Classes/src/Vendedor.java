public class Vendedor extends Funcionario{
    private double vendas;

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    @Override
    public String mostra(){
        return super.mostra() + "\nVendas: " + vendas;
    }

    @Override
    public double getSalario(){
        double aux = super.getSalario() + (0.05 * vendas);
        return aux;
    }
}
