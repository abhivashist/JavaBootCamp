package Enum;

public enum Operation {
    PLUS, MINUS, MULTIPLY, DIVIDE;
   long ans=0;
    long calculate(long x, long y) {
        switch (this) {
            case PLUS:
                ans = x + y;
                break;
            case MINUS:
                ans= x - y;
                break;
            case MULTIPLY:
                ans= x * y;
                break;
            case DIVIDE:
                ans = x / y;
                break;
            default:
                System.out.println("Not a valid operation");
//                             try {
//                    throw new operationNotValidException();
//                } catch (operationNotValidException e) {
//                    System.out.println(e.getMessage());
//                    System.exit(1);
//                }

        }
        return ans;

    }

}
//class operationNotValidException extends Exception
//{
//    public operationNotValidException()
//    {
//        super("invalid operation");
//    }
//}
