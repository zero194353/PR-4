class TestShape
{
    public static void main(String[] args)
    {
        var shapes = new Shape[6];

        for (int i = 0; i < 6; i++)
        {
            if (i % 2 == 0)
            {
                shapes[i] = new Circle(123, "Red", i % 3 == 0);
            }
            else
            {
                shapes[i] = new Rectangle(123, 123, "Green",  i % 3 == 0);
            }
        }

        for (var current : shapes)
        {
            System.out.println(current.toString());
            System.out.println();
        }
    }
}