public class Produto extends Venda{
    private  Integer quantItens;
    public Produto(String nomeCliente, String dataVenda, Integer valorVenda, Integer quantItens){
        super(nomeCliente, valorVenda,dataVenda);
        this.quantItens = quantItens;
    }
    public Integer getQuantItens(){

        return this.quantItens;
    }
}
