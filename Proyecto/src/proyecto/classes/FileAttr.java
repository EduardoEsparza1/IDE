/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.classes;

/**
 *
 * @author Ricky
 */
public class FileAttr {

    String fileName, path;
    boolean saved;

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public FileAttr(String fileName, String path, boolean saved) {
        this.fileName = fileName;
        this.path = path;
        this.saved = saved;
    }
    
    public FileAttr() {
    }

    public FileAttr(String fileName, String path) {
        this.fileName = fileName;
        this.path = path;
        this.saved = false;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
    
}
