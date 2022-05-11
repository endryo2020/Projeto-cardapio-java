/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardapio;

/**
 *
 * @author moises
 */
public abstract class ProdutoAbstrato {
    protected String nome;
    protected double preco;
    protected double quantidade;
    
    public ProdutoAbstrato (String nome,double preco, double quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        
    }
    
    public abstract double getTotalprodutos();
    
    @Override
    public String toString(){
        return "nome: " + nome + "preço: " + preco;
    }
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    
    public double getQuantidade(){
        return this.quantidade;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public void setQuantidade(double quant){
        this.quantidade = quant;
    }
    
    
    

}
