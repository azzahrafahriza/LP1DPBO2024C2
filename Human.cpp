#include <iostream>
#include<string>
#include <vector>

using namespace std;
#ifndef HUMAN_H
#define HUMAN_H


class Human {
    private:
        string id;
        string name;
        string bidang;
        string partai;
    
    public:
        Human(){
            this->id = "";
            this->name = "";
            this->bidang = "";
            this->partai = "";
        }
        

        Human(string id,string name, string bidang, string partai){
			this->id = id;
			this->name = name;
			this->bidang = bidang;
			this->partai = partai;
		}
        string getName(){
            return this->name;
        }

        void setName(string name){
            this->name = name;
        }

        string getId(){
            return this->id;
        }

        void setId(string id){
            this->id = id;
        }

        string getBidang(){
            return this->bidang;
        }

        void setBidang(string bidang){
            this->bidang = bidang;
        }

        string getPartai(){
            return this->partai;
        }

        void setPartai(string Partai){
            this->partai = partai;
        }
};
#endif // HUMAN_H
