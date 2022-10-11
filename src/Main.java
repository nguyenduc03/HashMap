import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Student> hashMap = new HashMap<Integer, Student>();
        int choose = -1;
        do {
            choose = ChooseMenu(hashMap);
            switch (choose) {
                case 1:
                    Student studentInput = new Student();
                    studentInput.InputStudent();
                    Random rd = new Random();
                    int key = rd.nextInt();
                    while (hashMap.containsKey(key)){
                        key = rd.nextInt();
                    }
                    hashMap.put(key, studentInput);
                    break;
                case 2:
                    Set<Integer> keySet = hashMap.keySet();
                    System.out.println("Key\t Value");
                    for (Integer keyItem : keySet) {
                        System.out.print(keyItem + "\t");
                        hashMap.get(keyItem).ShowStudent();
                    }
                    hashMap.remove(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Nhap key muon lay thong tin : ");
                    hashMap.get(sc.nextInt()).ShowStudent();
                    break;

                case 4:
                    System.out.print("Nhap key  : ");
                    if (hashMap.containsKey(sc.nextInt()))
                        System.out.println("Key co trong hash map");
                    System.out.println("Key khong co trong hash map");
                    break;

                case 5:
                    keySet = hashMap.keySet();
                    for (Integer keyItem : keySet)
                        System.out.print(keyItem + "\t");
                    System.out.println();
                    break;

                case 6:
                    System.out.println("The set is: " + hashMap.entrySet());
                    break;

            }
        } while (choose != 0);

    }

    private static int ChooseMenu(HashMap<Integer,Student> hashMap) {
        int choose =-1;
        Scanner sc = new Scanner(System.in);
        int maxChoose =0;
        if (hashMap.isEmpty())
            maxChoose=1;
        else
            maxChoose =6;
        do{
            ShowMenu(hashMap);
            choose =sc.nextInt();
        }while (choose<0 || choose >maxChoose);
        return choose;
    }

    private static void ShowMenu(HashMap<Integer, Student> hashMap) {
        System.out.println("1: put student");
        if (!hashMap.isEmpty()) {
            System.out.println("2: remove student");
            System.out.println("3: get student");
            System.out.println("4: containsKey ");
            System.out.println("5: keySet ");
            System.out.println("6: entrySet ");
        }
        System.out.println("0: exit");
        System.out.print("Chon cong viec : ");
    }
}