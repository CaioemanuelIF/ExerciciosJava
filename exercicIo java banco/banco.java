class banco{
    String nomeTitular;
    String agencia;
    int numero;
    String dataAbertura;
    double saldo;

    public banco(   String nomeTitular,
    String agencia,
    int numero,
    String dataAbertura,
    double saldo){
        this.nomeTitular=nomeTitular;
        this.agencia=agencia;
        this.numero=numero;
        this.dataAbertura=dataAbertura;
        this.saldo=saldo;
    }
    public String ragencia(){
        return this.agencia;
    }
     public String rnomeTitular(){
        return this.nomeTitular;
    }
     public int rnumero(){
        return this.numero;
    }
     public String rdataAbertura(){
        return this.dataAbertura;
    }
     public double rsaldo(){
        return this.saldo;
    }
}

