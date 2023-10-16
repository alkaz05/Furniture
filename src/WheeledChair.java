public class WheeledChair extends Chair {

    public WheeledChair(String color, String material, double height, int x, int y) {
        super(color, material, height, x, y);   //вызов кнструктора родительского класса
    }

    @Override   //опять переопределяем метод, описанный в родительском классе
    public void moveTo(int newX, int newY) {
        System.out.println("плавно катим стул из " + getX() + ", " + getY() + " в " + newX + ", " + newY);
        x = newX;
        y = newY;
    }

    public void adjustHeight(double h)
    {
        height=h;
    }
}
