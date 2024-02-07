public class Venda {

    public String nomeCliente;
    public String dataVenda;
    public Integer valorVenda;

    public Venda(String nomeCliente, Integer valorVenda, String dataVenda) {
        this.nomeCliente = nomeCliente;
        this.dataVenda = dataVenda;
        this.valorVenda = valorVenda;
    }

    public String getNomeCliente() {

        return this.nomeCliente;
    }

    public String getDataVenda() {

        return this.dataVenda;
    }

    public Integer getValorVenda() {

        return this.valorVenda;
    }

}
