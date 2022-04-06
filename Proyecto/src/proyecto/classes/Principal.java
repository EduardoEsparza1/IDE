package proyecto.classes;

import java.io.File;

public class Principal {
    public static void main(String[] args) {
        //Rocky
        String ruta = "D:/Ricky/UAA/ISC/8°/Compiladores I/IDE/Proyecto/src/proyecto/Lexer.flex";
        //Laliux
        //String ruta = "D:/Apps/IDE/Proyecto/src/proyecto/Lexer.flex";
        generarLexer(ruta);
    }
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo); 
    }
}
