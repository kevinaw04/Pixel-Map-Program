public class Pixel {
    public int red;
    public int green;
    public int blue;
    public Pixel (){
        red = 255;
        green = 255;
        blue = 255;

    }
    public Pixel(int red, int green, int blue){
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public void changeRGB(int red, int green, int blue) {
        this.red = red;
        this.blue = blue;
        this.green = green;



    }
    public void printRGB(){
        System.out.print(red +" " + green + " " + blue + " ");
    }

}
