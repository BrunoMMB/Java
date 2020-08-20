package jjfilechooserjcolorchooser;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class FiltroArquivosImagens extends FileFilter {

    public String getExtensao(File f) {
        String ext = null;
        String s = f.getName();
        int i = s.lastIndexOf('.');

        if (i > 0 && i < s.length() - 1) {
            ext = s.substring(i + 1).toLowerCase();
        }
        return ext;
    }

    @Override
    public boolean accept(File f) {
        if (f.isDirectory()) {
            return true;
        }
        String extensao = getExtensao(f);
        if (extensao != null) {
            if (extensao.equals("tiff")
                    || extensao.equals("tif")
                    || extensao.equals("gif")
                    || extensao.equals("jpeg")
                    || extensao.equals("jpg")
                    || extensao.equals("png")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public String getDescription() {      
        return "Arquivos de imagens";
    }
}
