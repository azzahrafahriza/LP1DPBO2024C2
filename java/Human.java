public class Human {
    private String id;
    private String name;
    private String bidang;
    private String partai;

    Human(){}
    Human(String id, String name, String bidang, String partai){
        this.id = id;
        this.name = name;
        this.bidang = bidang;
        this.partai = partai;
    }

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return this.id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setBidang(String bidang){
        this.bidang = bidang;
    }
    public String getBidang(){
        return this.bidang;
    }
    public void setPartai(String partai){
        this.partai = partai;
    }
    public String getPartai(){
        return this.partai;
    }
}
