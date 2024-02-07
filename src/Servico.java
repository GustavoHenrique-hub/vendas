public class Servico extends Venda{
    private String quantHoras;
    public Servico(String nomeCliente, String dataVenda, Integer valorVenda, String quantHoras){
        super(nomeCliente, valorVenda,dataVenda);
        this.quantHoras = quantHoras;
    }
    public String getQuantHoras(){

        return this.quantHoras;
    }
}
