public class Main {
    public static void main(String[] args) {

        Venda produto1 = new Produto("Meu pai", "10/11/2023", 3500, 23);
        Venda produto2 = new Produto(null, "10/11/2023", 3500, 23);
        Venda servico1 = new Servico("Meu pai", "10/11/2023", 3500, "04:00");
        Venda servico2 = new Servico(null, "10/11/2023", 3500, "04:00");
        Produto vprod1 = (Produto)produto1;
        Produto vprod2 = (Produto)produto2;
        Servico vservice1 = (Servico)servico1;
        Servico vservice2 = (Servico)servico2;
        if (produto1.getNomeCliente() == null) {
            System.out.println("Venda não validada");
        } else {
            System.out.println("Venda validada de " + vprod1.getQuantItens() + " produtos!");
        }
        if (produto2.getNomeCliente() == null) {
            System.out.println("Venda não validada");
        } else {
            System.out.println("Venda validada de " + vprod2.getQuantItens() + " produtos!");
        }
        if (servico1.getNomeCliente() == null) {
            System.out.println("Venda não validada");
        } else {
            System.out.println("Venda validada: " + vservice1.getQuantHoras() + " horas de serviço!");
        }
        if (servico2.getNomeCliente() == null) {
            System.out.println("Venda não validada");
        } else {
            System.out.println("Venda validada: " + vservice2.getQuantHoras() + " horas de serviço!");
        }

    }
}