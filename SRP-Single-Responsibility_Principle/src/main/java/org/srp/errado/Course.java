package org.srp.errado;

public class Course {
    private String name;
    private String categoria;
    private String descricao;



    public void connection(){
        System.out.println("Connectou..");
    }

    public  void createCategoria(){
        connection();
        System.out.println("Criar categoria no banco");
    }

    public void createCourse(){
        connection();
        System.out.println("Criar curso no banco");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
