public class ControlStatements {
    public static void main(String[] args) {
        /* Simple if statement */
        int num1 = 10;
        int num2 = 12;
        if(num1 + num2 > 20) {
            System.out.println("x + y is greater than 20");
        }

        /* if-else statement */
        int num3 = 10;
        int num4 = 12;
        if(num3 + num4 < 10) {
            System.out.println("x + y is less than 10");
        }
        else {
            System.out.println("x + y is greater than 20");
        }

        /* if-else-if ladder */
        String city = "Delhi";
        if(city == "Meerut") {
            System.out.println("city is meerut");
        }
        else if (city == "Noida") {
            System.out.println("city is noida");
        }
        else if(city == "Agra") {
            System.out.println("city is agra");
        }
        else {
            System.out.println(city);
        }

        /* Nested if-statement */
        String address = "Delhi, India";

        if(address.endsWith("India")) {
            if(address.contains("Meerut")) {
                System.out.println("Your city is Meerut");
            }
            else if(address.contains("Noida")) {
                System.out.println("Your city is Noida");
            }
            else {
                System.out.println(address.split(",")[0]);
            }
        }
        else {
            System.out.println("You are not living in India");
        }

        /* Switch Statement */
        int num = 2;
        switch (num){
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }

        /* for loop */
        int sum = 0;
        for(int j = 1; j <= 10; j++) {
            sum = sum + j;
        }

        /* for-each loop */
        String[] names = {"Java","C","C++","Python","JavaScript"};
        for(String name:names) {
            System.out.println(name);
        }

        /* while loop */
        int i = 0;
        while(i <= 10) {
            System.out.println(i);
            i = i + 2;
        }

        /* do-while loop */
        int b = 0;
        do {
            System.out.println(i);
            b = b + 2;
        } while(b <= 10);

        /* break statement */
        for(int c = 0; c <= 10; c++) {
            System.out.println(c);
            if(c == 6) {
                break;
            }
        }

        /* continue statement */
        for(int d = 0; d <= 2; d++) {

            for (int j = d; j <= 5; j++) {

                if(j == 4) {
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
