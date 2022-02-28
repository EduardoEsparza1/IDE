/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.classes;

import java.io.File;

/**
 *
 * @author Ricky
 */
public class FileAttr {

    private File file;
    private boolean saved;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean isSaved() {
        return saved;
    }

    public void setSaved(boolean saved) {
        this.saved = saved;
    }

    public FileAttr(File file, boolean saved) {
        this.file = file;
        this.saved = saved;
    }

    @Override
    public String toString() {
        return "FileAttr{" + "file=" + file.getPath() + ", saved=" + saved + '}';
    }


    
}
