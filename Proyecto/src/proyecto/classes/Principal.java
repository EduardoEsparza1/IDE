package proyecto.classes;

import java.io.File;

public class Principal {
    public static void main(String[] args) {
        String ruta = "D:/Apps/IDE/Proyecto/src/proyecto/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo); 
    }
}
