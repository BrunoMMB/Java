package cadastro;
public class AuxilioEmergencial {    
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new PessoaFisica(101010, "Flávia",   "f", 19, "Brasil");
        PessoaFisica pessoa2 = new PessoaFisica(101011, "Henrique", "m", 20, "Brasil", 1, 1000.00, 12000.00);
        PessoaFisica pessoa3 = new PessoaFisica(101012, "Thiago",   "m", 15, "Brasil");
        
        pessoa1.setTipo_de_Emprego(0); // trabalho formal
        pessoa1.setRfm(2000.00);
        pessoa1.setRt(24000.00);
        
        if(pessoa1.recebeAuxilio() == false){
            System.err.println("Auxilio não aprovado");
        }else{
            System.err.println("Auxilio aprovado");
        }
        
        if(pessoa2.recebeAuxilio() == false){
            System.err.println("Auxilio não aprovado");
        }else{
            System.err.println("Auxilio aprovado");
        }
        
    }
}
