/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cardapio;

/**
 *
 * @author moises
 */
public class Produtos extends ProdutoAbstrato{
    
    //propriedades
    
    
    
    //construtores
    
    public Produtos(String nome,double preco, double quantidade){
        super(nome, preco, quantidade);
        
    }
    public Produtos(){
    }
    
    // metodos
    
    @Override
    public String getNome(){
        return this.nome;
    }
    @Override
    public double getPreco(){
        return this.preco;
    }
    
    @Override
    public double getQuantidade(){
        return this.quantidade;
    }
    
    @Override
    public void setNome(String nome){
        this.nome = nome;
    }
    @Override
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    @Override
    public void setQuantidade(double quant){
        this.quantidade = quant;
    }
    
    @Override
    public String toString(){
        return nome + preco;
    }
    @Override
    public double getTotalprodutos(){
        return this.quantidade;
    }

    
    
    
}
