package Enum;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE
}

//class Test {
//    Size pizzaSize;
//    public Test(Size pizzaSize) {
//        this.pizzaSize = pizzaSize;
//    }
//    public void orderPizza() {
//        switch(pizzaSize) {
//            case SMALL:
//                System.out.println("I ordered a small size pizza.");
//                break;
//            case MEDIUM:
//                System.out.println("I ordered a medium size pizza.");
//                break;
//            default:
//                System.out.println("I don't know which one to order.");
//                break;
//        }
//    }
//}

public class Enum2String {

    public static void main(String[] args) {

        /* ******** Following is the approach to convert any Enum to String using String.valueOf() method ***** */
//        Size arr[] = Size.values();
//        System.out.println(arr.length);
//
//        String[] ans= new String[arr.length];
//
//            for(int i=0;i<arr.length;i++)
//            {
//                ans[i] = String.valueOf(arr[i]);
//                System.out.println(ans[i]);
//            }



       //      Following is the alternate approach to convert any Enum to String using toString() method


//        Size arr[] = Size.values();
//        System.out.println(arr.length);
//
//        String[] ans= new String[arr.length];
//
//        for(int i=0;i<arr.length;i++)
//        {
//            ans[i] = arr[i].toString();
//            System.out.println(ans[i]);
//        }



        //      Following is the alternate approach to convert any Enum to String using name() method
        Size arr[] = Size.values();
        System.out.println(arr.length);

        String[] ans= new String[arr.length];

        for(int i=0;i<arr.length;i++)
        {
            ans[i] = arr[i].name();
            System.out.println(ans[i]);
        }
    }
    }

