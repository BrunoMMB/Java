package guiglazedlist2;

import ca.odell.glazedlists.gui.WritableTableFormat;


public class PessoaWritebleTableFormat implements WritableTableFormat<Pessoa> {

    @Override
    public boolean isEditable(Pessoa baseObject, int column) {
        return true;
    }

    @Override
    public Pessoa setColumnValue(Pessoa baseObject, Object editedValue, int column) {
        switch (column) {
            case 0:
                baseObject.setNome((String) editedValue);
                break;
            case 1:
                baseObject.setEndereco((String) editedValue);
                break;
            case 2:
                baseObject.setCpf((String) editedValue);
                break;
            case 3:
                baseObject.setSexo((String) editedValue);
                break;
            default:
                throw new IllegalStateException();
        }
        return baseObject;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nome";
            case 1:
                return "Endereço";
            case 2:
                return "CPF";
            case 3:
                return "Sexo";
            default:
                throw new IllegalStateException();
        }
    }

    @Override
    public Object getColumnValue(Pessoa baseObject, int column) {
        switch (column) {
            case 0:
                return baseObject.getNome();
            case 1:
                return baseObject.getEndereco();
            case 2:
                return baseObject.getCpf();
            case 3:
                return baseObject.getSexo();
            default:
                throw new IllegalStateException();
        }
    }

}
