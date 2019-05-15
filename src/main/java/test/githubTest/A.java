package test.githubTest;

/**
 * Hello world!
 *
 */
public class A 
{
    public static void main( String[] args )
    {
    	A.aa();
        System.out.println( "Hello World!" );
    }
    
    @SuppressWarnings("unused")
	public static void aa() {
    	int a = 1;
    	int b = 2;
    	int c = a + b;
    }
    public void testA() {
    	System.out.println("修改了代码内容");
    }
}
