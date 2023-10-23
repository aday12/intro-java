package gov.test;

class IncrementTest {

    public static void main(String[] args) {
        int i = 3; //must define default value
        System.out.println(i);

        System.out.println(i++); //increment is done before printing when ++i, increment after print if i++
        System.out.println();

        int x = 18;
        int y = x;

        x++;
        System.out.println(y);

    }
}
