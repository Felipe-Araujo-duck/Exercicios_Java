public class Gestor extends Funcionario{

    private String cargo;


    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String mostra(){
        return super.mostra() + "\nCargo: "+ cargo;
    }
}
