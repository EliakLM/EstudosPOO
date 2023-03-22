public class ContaBanco {
    public int numeroConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void mostrar(){
        System.out.println("------------------------------------------");
        System.out.println("conta: "+ this.getNumeroConta());
        System.out.println("dono: "+ this.getDono());
        System.out.println("saldo: "+ this.getSaldo());
        System.out.println("tipo: "+ this.getTipo());
        System.out.println("Status: "+ this.getStatus());
    }

    public ContaBanco(){

    }

    public ContaBanco(int numeroConta, String tipo, String dono, float saldo, boolean status) {
        this.numeroConta = numeroConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0f;
        this.status = false;
    }


    public int getNumeroConta() {
        return numeroConta;
    }


    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getDono() {
        return dono;
    }


    public void setDono(String dono) {
        this.dono = dono;
    }


    public float getSaldo() {
        return saldo;
    }


    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    public boolean getStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }


    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);

        } else if (t == "CP") {
            this.setSaldo(150);            
        }
        System.out.println("Conta aberta com Sucesso!");

    }
    public void fechaConta(){
        if (this.getSaldo()> 0){
            System.out.println("Sua conta nao pode ser fechado pois ainda contem valores!");
        } else if (this.getSaldo()<0){
            System.out.println("Conta impossibilitada de ser fechada! Esta em debito!");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com Sucesso!");
        }

    }
    public void depositar(float v){
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado nda conta: " + this.getDono());
        } else {
            System.out.println("Impossivel realizar deposito em conta fechada");
        }

    }

    public void sacar(float v){
        if (this.getStatus()){
            if (this.getSaldo()>= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso," + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        }else {
            System.out.println("impossivel sacar em conta fechada!");
        }

    }

    public void pagarMensal(){
        int v = 0;
        if (this.getTipo()== "CC") {
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo()-v);
            System.out.println("mensalidade pega com sucesso por "+ this.getDono() );
            } else{
                System.out.println("Impossivel pagar com conta fechada!");
            }

    }
}
