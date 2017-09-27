public class TestException{

    public static void main(String[] args){
        try{
            int result = fact(-2);
            System.out.println(result);
        }
        catch(MyException ex){
            ex.printStackTrace();
        }
    }

    public static int fact(int num) throws MyException{
        if (num < 0)
            throw new MyException("число не может быть меньше 0.", num);
        return (num == 0) ? 1 : num * fact(num - 1);
    }
}