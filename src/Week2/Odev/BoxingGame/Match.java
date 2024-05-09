package Week2.Odev.BoxingGame;


public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int dodge;
    double probability = Math.random();

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;
    }

    public void run(){
        if(isCheck()){
            while(this.f1.health>0 && this.f2.health>0){
                System.out.println("=====YENİ ROUND=====");
                if (probability<0.5) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                }else{
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                System.out.println(this.f1.name + " sağlık : " + this.f1.health);
                System.out.println(this.f2.name + " sağlık : " + this.f2.health);
            }
        }else{
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight) ;
    }

    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name + " kazandı! " + this.f2.health + " canı kaldı." );
            return true;
        }
        if(this.f2.health==0){
            System.out.println(this.f1.name + " kazandı! " + this.f1.health + " canı kaldı.");
            return true;
        }
        return false;
    }
}
