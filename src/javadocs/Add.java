package javadocs;

/**
 * this class performs addition of two number
 * @author Ruchi
 */
public class Add {
    /**
     * first number*/
    int a = 12;
    /**
     * second number
     * */
    int b = 14;

    /**
     * create an Add object with two values
     * @param a
     * @param b
     */
    Add(int a,int b){
        this.a = a;
        this.b = b;
    }
    /**
     * Add two integer
     * @param a first number
     * @param b second number
     * @return Sum of both numbers
     * */
    public int add(int a,int b){
        return a+b;
    }
/**
 * main method(Empty for now)
 * @param args command-line arguments
 * */
    public static void main(String[] args) {

    }
}
