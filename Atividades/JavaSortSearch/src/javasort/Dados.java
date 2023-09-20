
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private int nPokedex ;
   private String name;
   private int totalPc;
   private int HP;
   private int attack;
   private int defense;
   private int spAtk;
   private int spDef;
   private int speed;
 

    public int getnPokedex() {
        return nPokedex;
    }

    public void setnPokedex(int nPokedex) {
        this.nPokedex = nPokedex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPc() {
        return totalPc;
    }

    public void setTotalPc(int totalPc) {
        this.totalPc = totalPc;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    @Override    
    public int compareTo(Dados outroDado){
      return this.getName().
              compareTo(outroDado.getName());
    }
    
    
    @Override
    public String toString(){
        return getName()+ " : " + getTotalPc() ;
    }// fim toString
    
        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dados dados = (Dados) o;
        return name.equals(dados.name);
    }

}
