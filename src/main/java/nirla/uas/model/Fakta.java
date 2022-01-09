package nirla.uas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fakta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sk_employe;
    private int amount;
    private int sk_product;
    private int sk_customer;
    private int sk_waktu;

    public Fakta(){

    }
    public Fakta(int id, int sk_employe, int emount, int sk_product, int sk_customer, int sk_waktu){
        this.id = id;
        this.sk_employe = sk_employe;
        this.amount = amount;
        this.sk_product = sk_product;
        this.sk_customer = sk_customer;
        this.sk_waktu = sk_waktu;
    }
    public int getid(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getsk_employe(){
        return sk_employe;
    }
    public void setSk_employe(int sk_employe){
        this.sk_employe = sk_employe;
    }
    public int getsk_product() {
        return sk_product;
    }
    public void setsk_product(int sk_product) {
        this.sk_product = sk_product;
    }
    public int getSk_customer(){ return sk_customer;}
    public void setSk_customer(){ this.sk_customer = sk_customer;}

    public int getSk_waktu() {
        return sk_waktu;
    }

    public void setSk_waktu(int sk_waktu) {
        this.sk_waktu = sk_waktu;
    }

    public void setSk_waktu(){ this.sk_waktu = sk_waktu;}
    public int getAmount(){ return amount;}
    public void setAmount(){ this.amount = amount;}

}
