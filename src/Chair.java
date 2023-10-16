public class Chair {
    private String color;
    private String material;
    protected double height;
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

    public void moveTo(int newX, int newY)
    {
        System.out.println("тащим стул из "+x+", "+y+" в "+newX + ", "+newY);
        x=newX;
        y=newY;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                ", height=" + height +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
