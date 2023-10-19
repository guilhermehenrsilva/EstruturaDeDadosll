package javatreesProjeto;

import java.util.Objects;

public class Pokemon implements Comparable<Pokemon>{
    private int nPokedex;
    private String nome;
    
    public Pokemon(int nPokedex, String nome){
        this.nPokedex = nPokedex;
        this.nome = nome;
    }
    
        public Pokemon(){

    }
    
    public int getnPokedex() {
        return nPokedex;
    }

    public void setnPokedex(int nPokedex) {
        this.nPokedex = nPokedex;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int compareTo(Pokemon outro){
        return Integer.compare
           (this.nPokedex, outro.nPokedex);
    }
    @Override
    public String toString(){
            return " Nº Pokedex:"+this.nPokedex+
                      " Nome:"+this.nome;
    }
    
    @Override
    public boolean equals(Object novoObjeto){
        if(this == novoObjeto)
            return true;
        if (novoObjeto == null || this.getClass() != novoObjeto.getClass())
            return false;
        Pokemon outroPokemon = (Pokemon) novoObjeto;
        return this.nPokedex == outroPokemon.nPokedex;
    }
}
