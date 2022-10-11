import lombok.Data;

import java.util.Scanner;

public @Data class Student {
    private String  name;
    private  int age;
    public void InputStudent (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten sinh vien : ");
        this.name = sc.nextLine();
        System.out.print("Nhap tuoi sinh vien : ");
        this.age = sc.nextInt();
    }
    public  void ShowStudent (){
        System.out.print("Ho va ten : "+ this.name);
        System.out.println("\ttuoi : "+ this.age);

    }
}
