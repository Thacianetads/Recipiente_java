public class Recipiente{
    private int cap;
    private int qtde;
    
    //set configura o tamanho quantidade
    //get mostrar quantidade

    public int getCap(){
        return this.cap;
    }
    
    public void setCap(int cap){
        this.cap = cap;
    }

    public int getQtde(){
        return this.qtde;
    }
    
    public void setQtde(int qtde){ 
        if(this.qtde + qtde <= this.cap ){
            this.qtde = qtde;
        }    
    }

    public void addQtde(int qtde){
        if((this.qtde + qtde) <= this.cap){
            this.qtde += qtde;        
        }    
    }

    public void remQtde(int qtde){
        /*if(this.qtde - qtde >= 0){
            this.qtde -= qtde; 
        
        } */
        if(qtde <= this.qtde){
            this.qtde -= qtde;        
        }
    }

    public void esvaziar(){
        this.qtde = 0;
    }

}
