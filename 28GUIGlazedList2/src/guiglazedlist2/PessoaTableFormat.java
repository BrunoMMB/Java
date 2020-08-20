package guiglazedlist2;

import ca.odell.glazedlists.gui.TableFormat;


public class PessoaTableFormat implements TableFormat<Pessoa> {
  
    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Nome";
            case 1: return "Endereço";
            case 2: return "CPF";
            case 3: return "Sexo";
            default: throw new IllegalStateException();
        }
    }

    @Override
    public Object getColumnValue(Pessoa baseObject, int column) {
        switch (column) {
            case 0: return baseObject.getNome();
            case 1: return baseObject.getEndereco();
            case 2: return baseObject.getCpf();
            case 3: return baseObject.getSexo();
            default: throw new IllegalStateException();
        }
    }
    
}

