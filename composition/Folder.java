import java.util.ArrayList;
public class Folder{
    private String folderName;
    private ArrayList<Folder> subFolders;
    private ArrayList<File> files;

    public Folder() {
        subFolders = new ArrayList<>();
        files = new ArrayList<>();
    }

    public String getFolderName(){
        return folderName;
    }

    public void setFolderName(String folderName){
        this.folderName = folderName;
    }

    public void removeSubFolder(String subFolderName){
        subFolders.removeIf(subFolder -> subFolder.getFolderName().equals(subFolderName));
    }

    public void addSubFolder (String subFolderName){
        Folder subFolder = new Folder();
        subFolder.setFolderName(subFolderName);
        subFolders.add(subFolder);
    }

    public Folder getSubFolder(String subFolderName){
        for (Folder subFolder : subFolders){
            if (subFolderName == subFolder.getFolderName()){
                return subFolder;
            }
        }
        return new Folder();
    }

    public boolean removeFile(File file){
        return files.remove(file);
    }

    public void addFile(String fileName){
        File file = new File(fileName);
        files.add(file);
    }

    public void print(){
        System.out.println("name: " + folderName);

        for (File file : files){
            file.print();
        }

        for (Folder subFolder : subFolders){
            subFolder.print();
        }
    }
}