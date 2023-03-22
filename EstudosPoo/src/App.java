public class App {
    public static void main(String[] args) throws Exception {
       ContaBanco p1 = new ContaBanco();
        p1.setNumeroConta( 2225008);
        p1.setDono("thyago");
        p1.abrirConta("CP");    
        p1.depositar(500);        
        ContaBanco p2 = new ContaBanco();
        p2.setNumeroConta(2225007);
        p2.setDono("italo");
        p2.abrirConta("CC");
        p2.depositar(350);



        p1.mostrar();
        p2.mostrar();


    }
}
