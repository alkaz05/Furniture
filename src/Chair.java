public class Chair {
    private String color;       //нельзя обратиться снаружи
    private String material;
    protected double height;    //можно обращаться внутри методов этого класса
                                //и всех потомков
    protected int x, y;

    public Chair(String color, String material, double height, int x, int y) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public double getHeight() {
        return height;
    }

    public void moveTo(int newX, int newY) //метод перемещения куда-то
    {
        System.out.println("тащим стул из ("+x+", "+y+") в ("+newX + ", "+newY+")");
        x=newX;
        y=newY;
    }

    @Override   //аннотация, обращающая наше и компилятора внимание
                // на перегрузку родительского метода
    public String toString() {
        return  this.getClass().getSimpleName()+"{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
