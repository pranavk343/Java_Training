import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        StImple ob = new StImple();
        System.out.println("Enter id : ");
        int id = sc.nextInt();
        st.setId(id);
        System.out.println("Enter name : ");
        String name = sc.next();
        st.setName(name);
        while (true){
            System.out.println("1. Insert");
            System.out.println("2. Update");
            System.out.println("3. Select");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            int x = sc.nextInt();

            switch (x){
                case 1 :
                    ob.save(st);
                    break;
                case 2 :
                    ob.update(st);
                    break;
                case 3 :
                    ob.select(st);
                    break;
                case 4 :
                    ob.delete(st);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default :
                    System.out.println("Please enter correct choice!!");
            }
        }
    }
}
