#include <iostream>
#include<string>
#include <vector>
#include "Human.cpp"

class Crud{
	private:
		vector<Human> listHuman;
	public:
		Crud(){
		}
		void tambah(){
			string name, id, bidang, partai;
			cout << endl;
			cout << "Masukkan id       : ";
			cin >> id;
			cout << "Masukkan name     : ";
			cin >> name;
			cout << "Masukkan bidang   : ";
			cin >> bidang;
			cout << "Masukkan partai   : ";
			cin >> partai;
			Human temp(name,id,bidang,partai);
			listHuman.push_back(temp);
			cout << name << " berhasil ditambahkan!" << endl;
		}
		void ubah(){
			string name, id, bidang, partai;
			cout << endl;
			if(listHuman.size()==0){
				cout << "Data tidak ada";
			}else{
				cout << "Masukkan indeks name" << endl;
				int i=0;
				for(int i=0; i<listHuman.size(); i++){
					cout << i+1 << ". " << listHuman.at(i).getName() << endl;
				}
				cout << endl;
				
				int masukkan;
				cin >> masukkan;
				cout << endl;
				
				if(masukkan<=listHuman.size() && masukkan > 0){
					cout << "Masukkan indeks isi" << endl;
					cout << "1. name" << endl;
					cout << "2. id" << endl;
					cout << "3. bidang" << endl;
					cout << "4. partai" << endl;
					cout << endl;
					
					int ubahB;
					cin >> ubahB;
					
					switch(ubahB){
						case 1:
							cout << "Masukkan name : ";
							cin >> name;
							listHuman.at(masukkan-1).setName(name);
							break;
						case 2:
							cout << "Masukkan id : ";
							cin >> id;
							listHuman.at(masukkan-1).setId(id);
							break;
						case 3:
							cout << "Masukkan bidang : ";
							cin >> bidang;
							listHuman.at(masukkan-1).setBidang(bidang);
							break;
						case 4:
							cout << "Masukkan partai : ";
							cin >> partai;
							listHuman.at(masukkan-1).setPartai(partai);
							break;
						default:
							cout << "Indeks tidak valid";
					}
				}else{
					cout << "Indeks tidak valid";
				}
			}
			cout << endl;
		}
		void hapus(){
			cout << endl;
			if(listHuman.size()==0){
				cout << "Data tidak ada";
			}else{
				cout << "Masukkan indeks name" << endl;
				for(int i=0;i<listHuman.size();i++){
					cout << i+1 << ". " << listHuman.at(i).getName() << endl;
				}
				cout << endl;
				int masukkan;
				cin >> masukkan;
				cout << endl;
				
				if(masukkan<=listHuman.size() && masukkan >0){
					cout << listHuman.at(masukkan-1).getName() << " berhasil dihapus!" << endl;
					listHuman.erase(listHuman.begin() + masukkan-1);
				}else{
					cout << "Indeks tidak valid";
				}
			}
			cout << endl;
		}
		void tampil(){
			cout << endl;
			if(listHuman.size()==0){
				cout << "Data tidak ada";
			}else{
				int maxname=4,maxid=2,maxbidang=6,maxpartai=6;
				for(int i=0;i<listHuman.size();i++){
					if(listHuman.at(i).getId().length()>maxid){
						maxid = listHuman.at(i).getId().length();
					}
					if(listHuman.at(i).getName().length()>maxname){
						maxname = listHuman.at(i).getName().length();
					}
					if(listHuman.at(i).getBidang().length()>maxbidang){
						maxbidang = listHuman.at(i).getBidang().length();
					}
					if(listHuman.at(i).getPartai().length()>maxpartai){
						maxpartai = listHuman.at(i).getPartai().length();
					}
				}
				for(int j=0;j<(maxname+maxid+maxbidang+maxpartai+13);j++)cout << "-";
				cout << endl;
				
				cout << "| id";
				for(int j=2;j<maxid;j++)cout << " ";
				cout << " | name";
				for(int j=4;j<maxname;j++)cout << " ";
				cout << " | bidang";
				for(int j=6;j<maxbidang;j++)cout << " ";
				cout << " | partai";
				for(int j=6;j<maxpartai;j++)cout << " ";
				cout << " |";
				cout << endl;
				for(int j=0;j<(maxname+maxid+maxbidang+maxpartai+13);j++)cout << "-";
				cout << endl;
				
				for(int i=0; i<listHuman.size(); i++){
					cout << "| " << listHuman.at(i).getName();
					for(int j=listHuman.at(i).getName().length();j<maxname;j++)cout << " ";
					cout << " | " << listHuman.at(i).getId();
					for(int j=listHuman.at(i).getId().length();j<maxid;j++)cout << " ";
					cout << " | " << listHuman.at(i).getBidang();
					for(int j=listHuman.at(i).getBidang().length();j<maxbidang;j++)cout << " ";
					cout << " | " << listHuman.at(i).getPartai();
					for(int j=listHuman.at(i).getPartai().length();j<maxpartai;j++)cout << " ";
					cout << " |";
					cout << endl;
					for(int j=0;j<(maxname+maxid+maxbidang+maxpartai+13);j++)cout << "-";
					cout << endl;
				}
			}
			cout << endl;
		}
};