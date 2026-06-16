public class variables {
        public static void main(){
            int age = 20;
            String name = "Amar";
            double salary = 10000.50;
            char gender = 'M';
            boolean isMarried = false;

             System.out.println(name + " " + age);
             System.out.println(salary);
             System.out.println(gender);
             System.out.println(isMarried);

             age = 21;
             System.out.println(name + " " + age);  

             //multiple variables

             int x = 2, y = 3, z = 4;
             System.out.println(x + " " + y + " " + z);

             //If a value should never change, use final

                final double PI = 3.14159;
                System.out.println(PI);

            
        }
}
