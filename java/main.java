import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Crud newCrud = new Crud();
		Scanner sc = new Scanner(System.in);
		int menu;

        do{
            System.out.println("Silahkan pilih menu");
            System.out.println("1: tambah data");
            System.out.println("2: ubah data");
			System.out.println("3: hapus data");
			System.out.println("4: lihat data");
			System.out.println("5: keluar");
			System.out.println();
            try{
				menu = sc.nextInt();
				System.out.println();
			}catch(Exception e){
				menu=0;
			}
			switch(menu){
				case 1:
					newCrud.tambah();
					break;
				case 2: 
					newCrud.ubah();
					break;
				case 3:
					newCrud.hapus();
					break;
				case 4:
					newCrud.tampil();
					break;
				case 5:
					break;
				default:
					System.out.println("Indeks tidak valid");
					System.out.println();
			}
			System.out.println("Enter untuk melanjutkan");
			sc.nextLine();
			sc.nextLine();
        }while(menu!=5);
    }
}