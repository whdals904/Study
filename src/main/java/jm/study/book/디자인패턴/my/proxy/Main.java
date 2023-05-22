package jm.study.book.디자인패턴.my.proxy;


class ProxyImage implements Image{

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }
}

class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        System.out.println(fileName + " : 이미지 보여주기");
    }
}
public class Main {


    public static void main(String[] args) {
        Image image1 = new ProxyImage("1.jpg");
        Image image2 = new ProxyImage("2.jpg");
        image1.displayImage();
        image2.displayImage();
    }

}
