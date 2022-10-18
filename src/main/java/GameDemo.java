public class GameDemo {

    public String divideByNumber(int firstNumber, int secondNumber)
    {
        int finalNumber = 0;
        try
        {
            finalNumber = firstNumber/secondNumber;
        }
        catch (Exception exception)
        {
            return exception.toString();
        }
        return String.valueOf(finalNumber);
    }

    public static void main(String[] args)
    {
        GameDemo gameDemo = new GameDemo();
        String finalNumber = gameDemo.divideByNumber(10,0);
        System.out.println("Remainder = "+finalNumber);
    }
}