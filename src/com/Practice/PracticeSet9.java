package com.Practice;

class rectangleNew {

    private int length;
    private int width;

    public rectangleNew(int height, int width) {
        this.length = height;
        this.width = width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int findWidthRectangle(){
        int area;
        area = length * width;
        return area;
    }
}

class cuboid extends rectangleNew{
    int height;
    int width;
    int length;

    public cuboid(int h, int w, int l) {
        super(h, w);
        this.length = l;
        this.height = h;
        this.width = w;
    }

    public int FindVolumeCuboid(){
        int volume = length * width * height;
        return volume;
    }

}
public class PracticeSet9 {
    public static void main(String[] args) {

        //rectangleNew rect = new rectangleNew(12, 5);

        cuboid newCube = new cuboid(15,5,5);
        int volCube = newCube.FindVolumeCuboid();
        System.out.println(volCube);

        int areaRect = newCube.findWidthRectangle();
        System.out.println(areaRect);




    }
}
