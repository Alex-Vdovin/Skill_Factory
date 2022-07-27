public class Mage {
    private String name;
    private int level;
    private int damage;
    private String type;
    public Mage(String name, int level, int damage, String type){
        this.name = name;
        this.level = level;
        this.damage = damage;
        if(type.equals("fire")||type.equals("earth")||type.equals("ice")){
            this.type = type;
        }else{
            int random = (int) (3*Math.random())+1;
            if(random==1){
                this.type = "fire";
            }else if(random ==2){
                this.type = "ice";
            }else {
                this.type = "earth";
            }
        }

    }
    public String getInfo(){
        return String.format("%s, %d, %d, %s", name,level,damage,type);
    }
    public String fight(Mage mage){
        if(this.type.equals("fire")&&mage.type.equals("ice")){
            return this.name;
        }else if(this.type.equals("fire")&&mage.type.equals("earth")){
            return mage.name;
        }else if(this.type.equals("ice")&&mage.type.equals("earth")){
            return this.name;
        }else if(this.type.equals("ice")&&mage.type.equals("fire")){
            return mage.name;
        }else if(this.type.equals("earth")&&mage.type.equals("fire")){
            return this.name;
        }else if(this.type.equals("earth")&&mage.type.equals("ice")){
            return mage.name;
        }else if(this.level>mage.level){
            return this.name;
        }else if(this.level<mage.level){
            return mage.name;
        }else if(this.damage>mage.damage){
            return this.name;
        }else if(this.damage<mage.damage){
            return mage.name;
        }
        return "draw";
    }

    public static void main(String[] args) {
        Mage ivan = new Mage("Ivan", 100, 50, "fire");
        Mage petr = new Mage("Petr", 50, 70, "ice");
//        Mage delbik = new Mage("Delbik", 1000, 25, "fhvbsobhosfv");
//        System.out.println(delbik.getInfo());
        System.out.println(ivan.getInfo());
        System.out.println(petr.getInfo());
        System.out.println(ivan.fight(petr));
    }
}
