package proyecto;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Principal {
    public static void main(String[] args) throws Exception {
        //Rocky
        //String ruta = "D:/Ricky/UAA/ISC/8°/Compiladores I/IDE/Proyecto/src/proyecto/Lexer.flex";
        
        //Laliux
        //E:/LALO/UNIVERSIDAD/8vo Semestre/Compiladores I/Compilador
        //String ruta1 = "E:/LALO/UNIVERSIDAD/8vo Semestre/Compiladores I/Compilador/IDE/Proyecto/src/proyecto/Lexer.flex";
        //String ruta2 = "E:/LALO/UNIVERSIDAD/8vo Semestre/Compiladores I/Compilador/IDE/Proyecto/src/proyecto/LexerCup.flex";
        //String[] rutaS = {"-parser", "Sintax", "E:/LALO/UNIVERSIDAD/8vo Semestre/Compiladores I/Compilador/IDE/Proyecto/src/proyecto/Sintax.cup"};
        
        //C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores
        String ruta1 = "C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores/IDE/Proyecto/src/proyecto/Lexer.flex";
        String ruta2 = "C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores/IDE/Proyecto/src/proyecto/LexerCup.flex";
        String[] rutaS = {"-parser", "Sintax", "C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores/IDE/Proyecto/src/proyecto/Sintax.cup"};
        generar(ruta1, ruta2, rutaS);
    }
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception{
        File archivo;
        archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        
        archivo = new File(ruta2);
        JFlex.Main.generate(archivo);
        java_cup.Main.main(rutaS);
        
        Path rutaSym = Paths.get("C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores/IDE/Proyecto/src/proyecto/sym.java");
        if(Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        
        Path rutaSin = Paths.get("C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores/IDE/Proyecto/src/proyecto/Sintax.java");
        if(Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        
        Files.move(
                Paths.get("C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores/IDE/Proyecto/sym.java"),
                Paths.get("C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores/IDE/Proyecto/src/proyecto/sym.java")
        );
        
        Files.move(
                Paths.get("C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores/IDE/Proyecto/Sintax.java"),
                Paths.get("C:/Users/eduar/OneDrive/Documentos Universidad/Compiladores/IDE/Proyecto/src/proyecto/Sintax.java")
        );
    }
}
