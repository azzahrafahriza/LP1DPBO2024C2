from Human import Human

class Crud:
    def __init__(self):
        self.__listHumans = []
    
    def tambah(self):
        print()
        id = input("Masukkan id      : ")
        nama = input("Masukkan nama    : ")
        bidang = input("Masukkan bidang  : ")
        partai = input("Masukkan partai  : ")
        temp = Human(id,nama,bidang,partai)
        self.__listHumans.append(temp)
        print( nama + " berhasil ditambahkan!\n")
    
    def ubah(self):
        print()
        if len(self.__listHumans)==0:
            print("Data tidak ada")
        else:
            print("Masukkan indeks nama")
            for i in range(len(self.__listHumans)):
                print(str(i+1)+". "+self.__listHumans[i].getNama())
		
            print()
            masukkan = int(input())
            print()
            
            if masukkan<=len(self.__listHumans) and masukkan > 0:
                print("Masukkan indeks isi")
                print("1. nama")
                print("2. id")
                print("3. bidang")
                print("4. partai")
                print()
				
                ubahB = int(input())
                print()
                
				
                if ubahB==1:
                    print("Masukkan nama : ")
                    nama = input()
                    self.__listHumans[masukkan-1].setNama(nama)
                elif ubahB==2:
                    print("Masukkan id : ")
                    id = input()
                    self.__listHumans[masukkan-1].setId(id)
                elif ubahB==3:
                    print("Masukkan bidang : ")
                    bidang = input()
                    self.__listHumans[masukkan-1].setBidang(bidang)
                elif ubahB==4:
                    print("Masukkan partai : ")
                    partai = input()
                    self.__listHumans[masukkan-1].setPartai(partai)
                else:
                    print("Indeks tidak valid")
            else:
                print("Indeks tidak valid")
			
		
        print()
	
    def hapus(self):
        print()
        if len(self.__listHumans)==0 :
            print("Data tidak ada")
        else:
            print("Masukkan indeks nama")
            for i in range(len(self.__listHumans)):
                print(str(i+1)+". "+self.__listHumans[i].getNama())
            
            print()
            masukkan = int(input())
            print()
            
            if masukkan<=len(self.__listHumans) and masukkan >0:
                print(self.__listHumans[masukkan-1].getNama() + " berhasil dihapus!")
                self.__listHumans.pop(masukkan-1)
            else:
                print("Indeks tidak valid")
            
        
        print()
	
    def tampil(self):
        print()
        if len(self.__listHumans)==0 :
            print("Data tidak ada", end="")
        else:
            maxNama=4
            maxid=2
            maxbidang=6
            maxpartai=6
            for i in range(len(self.__listHumans)):
                if(len(self.__listHumans[i].getNama())>maxNama):
                    maxNama = len(self.__listHumans[i].getNama())
                
                if(len(self.__listHumans[i].getId())>maxid):
                    maxid = len(self.__listHumans[i].getId())
                
                if(len(self.__listHumans[i].getBidang())>maxbidang):
                    maxbidang = len(self.__listHumans[i].getBidang())
                
                if(len(self.__listHumans[i].getPartai())>maxpartai):
                    maxpartai = len(self.__listHumans[i].getPartai())
                
            
            for j in range(maxNama+maxid+maxbidang+maxpartai+13):
                print("-", end="")
            print()
            
            print("| id", end="")
            for j in range(2,maxid):
                print(" ", end="")
            print(" | Nama", end="")
            for j in range(4,maxNama):
                print(" ", end="")
            print(" | bidang", end="")
            for j in range(6,maxbidang):
                print(" ", end="")
            print(" | partai", end="")
            for j in range(6,maxpartai):
                print(" ", end="")
            print(" |", end="")
            print()
            for j in range(maxNama+maxid+maxbidang+maxpartai+13):
                print("-", end="")
            print()
            
            for i in range(len(self.__listHumans)):
                print("| " + self.__listHumans[i].getId(), end="")
                for j in range(len(self.__listHumans[i].getId()),maxid):
                    print(" ", end="")
                print( " | " + self.__listHumans[i].getNama(), end="")
                for j in range(len(self.__listHumans[i].getNama()),maxNama):
                    print(" ", end="")
                print(" | " + self.__listHumans[i].getBidang(), end="")
                for j in range(len(self.__listHumans[i].getBidang()),maxbidang):
                    print(" ", end="")
                print(" | " + self.__listHumans[i].getPartai(), end="")
                for j in range(len(self.__listHumans[i].getPartai()),maxpartai):
                    print(" ", end="")
                print(" |", end="")
                print("\n", end="")
                for j in range(maxNama+maxid+maxbidang+maxpartai+13):
                    print("-", end="")
                print()
            
        
        print()
    
