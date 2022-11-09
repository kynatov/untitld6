public class Weapon  {
    private String katana;
    private String ace;

    public String getType() {
        return katana;
    }

    public void setType(String katana) {
        katana = katana;
    }

    public String getName() {
        return  ace;
    }

    public void setName(String  ace) {
        ace =  ace;
    }


    public Weapon(String katana, String ace) {
        this.katana = katana;
        this. ace =  ace;
    }
}