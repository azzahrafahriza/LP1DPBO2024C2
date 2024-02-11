import java.util.Scanner;
import java.util.ArrayList;

public class Crud
{
	private ArrayList<Human> listHumans = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);
	Crud(){
	}
	
	public void tambah(){
		String nama, id, bidang, partai;
		System.out.print("Masukkan id       : ");
		id = sc.next();
		System.out.print("Masukkan nama     : ");
		nama = sc.next();
		System.out.print("Masukkan bidang   : ");
		bidang = sc.next();
		System.out.print("Masukkan partai   : ");
		partai = sc.next();
		Human temp = new Human(id,nama,bidang,partai);
		listHumans.add(temp);
		System.out.println(nama + " berhasil ditambahkan!");
		System.out.println();
	}
	
	public void ubah(){
		String nama, id, bidang, partai;
		if(listHumans.size()==0){
			System.out.println("Data tidak ada");
		}else{
			System.out.println("Masukkan indeks nama");
			for(int i=0;i<listHumans.size();i++){
				System.out.println(Integer.toString(i+1)+
				". "+listHumans.get(i).getName());
			}
			System.out.println();
			int masukkan;
			try{
				masukkan = sc.nextInt();
				System.out.println();
			}catch(Exception e){
				masukkan=-1;
			}
			if(masukkan<=listHumans.size() && masukkan > 0){
				System.out.println("Masukkan indeks isi");
				System.out.println("1. id");
				System.out.println("2. nama");
				System.out.println("3. bidang");
				System.out.println("4. partai");
				System.out.println();
				
				int ubahB;
				try{
					ubahB = sc.nextInt();
					System.out.println("");
				}catch(Exception e){
					ubahB = -1;
				}
				switch(ubahB){
					case 1:
                        System.out.print("Masukkan id : ");
                        id = sc.next();
                        listHumans.get(masukkan-1).setId(id);
                        break;
                    case 2:
						System.out.print("Masukkan nama : ");
						nama = sc.next();
						listHumans.get(masukkan-1).setName(nama);
						break;
						
					case 3:
						System.out.print("Masukkan bidang : ");
						bidang = sc.next();
						listHumans.get(masukkan-1).setBidang(bidang);
						break;
					case 4:
						System.out.print("Masukkan partai : ");
						partai = sc.next();
						listHumans.get(masukkan-1).setPartai(partai);
						break;
					default:
						System.out.println("Indeks tidak valid");
				}
			}else{
				System.out.println("Indeks tidak valid");
			}
		}
		System.out.println();
	}
	
	public void hapus(){
		if(listHumans.size()==0){
			System.out.println("Data tidak ada");
		}else{
			System.out.println("Masukkan indeks nama");
			for(int i=0;i<listHumans.size();i++){
				System.out.println(Integer.toString(i+1)+
				". "+listHumans.get(i).getName());
			}
			System.out.println();
			int masukkan;
			try{
				masukkan = sc.nextInt();
				System.out.println();
			}catch(Exception e){
				masukkan = -1;
			}
			if(masukkan<=listHumans.size() && masukkan >0){
				System.out.println(listHumans.get(masukkan-1).getName() + " berhasil dihapus!");
				listHumans.remove(masukkan-1);
			}else{
				System.out.println("Indeks tidak valid");
			}
		}
		System.out.println();
	}
	
	public void tampil(){
		if(listHumans.size()==0){
			System.out.println("Data tidak ada");
		}else{
			int maxNama=4,maxid=2,maxbidang=6,maxpartai=6;
			for(int i=0;i<listHumans.size();i++){
                if(listHumans.get(i).getId().length()>maxid){
                    maxid = listHumans.get(i).getId().length();
				}
                if(listHumans.get(i).getName().length()>maxNama){
                    maxNama = listHumans.get(i).getName().length();
                }
				if(listHumans.get(i).getBidang().length()>maxbidang){
					maxbidang = listHumans.get(i).getBidang().length();
				}
				if(listHumans.get(i).getPartai().length()>maxpartai){
					maxpartai = listHumans.get(i).getPartai().length();
				}
			}
			for(int j=0;j<(maxNama+maxid+maxbidang+maxpartai+13);j++)System.out.print("-");
			System.out.println();
			
			System.out.print("| id");
			for(int j=2;j<maxid;j++)System.out.print(" ");
			System.out.print(" | Nama");
			for(int j=4;j<maxNama;j++)System.out.print(" ");
			System.out.print(" | bidang");
			for(int j=6;j<maxbidang;j++)System.out.print(" ");
			System.out.print(" | partai");
			for(int j=6;j<maxpartai;j++)System.out.print(" ");
			System.out.print(" |");
			System.out.println();
			for(int j=0;j<(maxid+maxNama+maxbidang+maxpartai+13);j++)System.out.print("-");
			System.out.println();
			
			for(int i=0;i<listHumans.size();i++){
                System.out.print("| "+listHumans.get(i).getId());
				for(int j=listHumans.get(i).getId().length();j<maxid;j++)System.out.print(" ");
				System.out.print(" | "+listHumans.get(i).getName());
				for(int j=listHumans.get(i).getName().length();j<maxNama;j++)System.out.print(" ");
				System.out.print(" | "+listHumans.get(i).getBidang());
				for(int j=listHumans.get(i).getBidang().length();j<maxbidang;j++)System.out.print(" ");
				System.out.print(" | "+listHumans.get(i).getPartai());
				for(int j=listHumans.get(i).getPartai().length();j<maxpartai;j++)System.out.print(" ");
				System.out.print(" |");
				System.out.println();
				for(int j=0;j<(maxNama+maxid+maxbidang+maxpartai+13);j++)System.out.print("-");
				System.out.println();
			}
		}
		System.out.println();
	}
	
}