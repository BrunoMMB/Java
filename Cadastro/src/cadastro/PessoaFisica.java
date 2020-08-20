package cadastro;
public class PessoaFisica {
    int CPF;
    String Nome; 
    String Sexo; 
    int Idade;
    String Naturalidade;
    int Tipo_de_Emprego; //0 = formal, 1 = informal 
    double rfm;//Renda Familiar Mensal
    double rt;//Rendimentos Tributáveis em 2018

    public PessoaFisica(int CPF, String Nome, String Sexo, int Idade, String Naturalidade) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.Naturalidade = Naturalidade;
    }

    public PessoaFisica(int CPF, String Nome, String Sexo, int Idade, String Naturalidade, int Tipo_de_Emprego, double rfm, double rt) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Idade = Idade;
        this.Naturalidade = Naturalidade;
        this.Tipo_de_Emprego = Tipo_de_Emprego;
        this.rfm = rfm;
        this.rt = rt;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public String getNaturalidade() {
        return Naturalidade;
    }

    public void setNaturalidade(String Naturalidade) {
        this.Naturalidade = Naturalidade;
    }

    public int getTipo_de_Emprego() {
        return Tipo_de_Emprego;
    }

    public void setTipo_de_Emprego(int Tipo_de_Emprego) {
        this.Tipo_de_Emprego = Tipo_de_Emprego;
    }

    public double getRfm() {
        return rfm;
    }

    public void setRfm(double rfm) {
        this.rfm = rfm;
    }

    public double getRt() {
        return rt;
    }

    public void setRt(double rt) {
        this.rt = rt;
    }

    boolean recebeAuxilio(){
        boolean auxilio = false;
        if(this.Idade >= 18){
            if(this.Tipo_de_Emprego == 1){
                if(this.rt <= 28559.70){
                    if(this.rfm <= 3135.00){
                        auxilio = true;
                    }
                }
            }
        }
        return auxilio;
    }
       
}
