package demopack;
class Exceptions {
	public static void main (String[] args) {
        try{
               System.out.println(3/0);
               try{
                    int[] a={1,2,3,4};
                    System.out.println(a[3]);
                }
   catch(ArrayIndexOutOfBoundsException e)
                {
                    System.out.println("Out of bounds");
                }
        }
       catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException : divide by 0");
        }
	}
    }
