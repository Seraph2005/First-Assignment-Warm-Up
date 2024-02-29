public class Exercises1 {
    public long factorial(int n) {
        if(n > 1)
            return factorial(n - 1)*n;
        return 1;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        if(n > 2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        return 1;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][];
        for(int cnt = 0; cnt < rows; cnt++)
        {
            triangle[cnt] = new char[cnt+1];
            for(int i = 0; i <= cnt; i++)
            {
                triangle[cnt][i] = '*';
            }
        }
        return triangle;
    }


    public static void main(String[] args) {

    }

}