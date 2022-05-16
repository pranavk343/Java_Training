package com.example.Day33Assignment;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class Day33AssignmentApplication {
	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(Day33AssignmentApplication.class, args);
		RoleRepository role = context.getBean(RoleRepository.class);
		EmpRepository empl = context.getBean(EmpRepository.class);
		Scanner sc = new Scanner(System.in);
		int post_id,id;
		String name;
		
		int x;
		while(true) {
			Role r1;
			Emp e1;
			Optional<Role> roll;
			Optional<Emp> employee;
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Select");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.println("Enter your choice : ");
			x = sc.nextInt();
			switch (x) {
			case 1:
				System.out.println("Enter id : ");
				id = sc.nextInt();
				System.out.println("Enter name : ");
				name = sc.next();
				System.out.println("Enter post_id: (1-3)");
				post_id = sc.nextInt();
				roll = role.findById(post_id);
				r1 = roll.get();
				e1 = new Emp(id,name,r1);
				empl.save(e1);
				System.out.println("Record Inserted!!");
				break;
			case 2:
				System.out.println("Enter id of the data to be update : ");
				id = sc.nextInt();
				employee = empl.findById(id);
				e1 = employee.get();
				System.out.println("Enter new name to be updated : ");
				name = sc.next();
				e1.setName(name);
				empl.save(e1);
				System.out.println("Record updated!!");
				break;
			case 3:
				List<Emp> emp_list;
				emp_list= empl.findAll();
				System.out.println("-------------------------------------");
				for(Emp ex : emp_list) {
					System.out.println(ex.getEmp_id()+" "+ex.getName()+" "+ex.getRollObj().getRoll_id());
				}
				System.out.println("-------------------------------------");
				break;
			case 4:
				System.out.println("Enter the id to be delete : ");
				id = sc.nextInt();
				employee = empl.findById(id);
				e1 = employee.get();
				empl.delete(e1);
				System.out.println("Record Deleted!!");
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Please enter correct choice !!");
				break;
			}
		}		
	}
}
/*List<Student> studlist;
studlist=stud.findAll();

for(Student st3:studlist) {
	System.out.println(st3.getId());
	System.out.println(st3.getName());
}*/