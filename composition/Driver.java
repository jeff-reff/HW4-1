public class Driver {
    public static void main(String[] args){
        Folder phpDemo1 = new Folder();

        phpDemo1.setFolderName("php_demo1");
        phpDemo1.addSubFolder("Source Files");
        phpDemo1.addSubFolder("Include Path");
        phpDemo1.addSubFolder("Remote Files");

        phpDemo1.getSubFolder("Source Files").addSubFolder(".phalcon");
        phpDemo1.getSubFolder("Source Files").addSubFolder("app");
        phpDemo1.getSubFolder("Source Files").addSubFolder("cache");
        phpDemo1.getSubFolder("Source Files").addSubFolder("public");

        phpDemo1.getSubFolder("Source Files").getSubFolder("app").addSubFolder("config");
        phpDemo1.getSubFolder("Source Files").getSubFolder("app").addSubFolder("controllers");
        phpDemo1.getSubFolder("Source Files").getSubFolder("app").addSubFolder("library");
        phpDemo1.getSubFolder("Source Files").getSubFolder("app").addSubFolder("migrations");
        phpDemo1.getSubFolder("Source Files").getSubFolder("app").addSubFolder("models");
        phpDemo1.getSubFolder("Source Files").getSubFolder("app").addSubFolder("views");

        phpDemo1.getSubFolder("Source Files").getSubFolder("public").addFile(".htaccess");
        phpDemo1.getSubFolder("Source Files").getSubFolder("public").addFile(".htrouter.php");
        phpDemo1.getSubFolder("Source Files").getSubFolder("public").addFile("index.html");

        System.out.println("Complete File System");
        phpDemo1.print();

        System.out.println("After app removal");
        phpDemo1.getSubFolder("Source Files").removeSubFolder("app");
        phpDemo1.print();

        System.out.println("After public folder removal");
        phpDemo1.getSubFolder("Source Files").removeSubFolder("public");
        phpDemo1.print();
    }
}