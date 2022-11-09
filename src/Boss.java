public class Boss extends GameEntity {
    private Weapon mech;


    public Weapon getMech() {
        return mech;
    }

    public void setMech(Weapon mech) {
        this.mech = mech;
    }


    public  String printInfo(){
        return getMech().getName() + " " + getMech().getType() + " " + getDamage() + " " + getHealth();
    }

}