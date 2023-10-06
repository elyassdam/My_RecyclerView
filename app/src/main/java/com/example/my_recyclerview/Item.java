package com.example.my_recyclerview;

public class Item {
    String nombre;
    String email;
    int image;

    public Item(String nombre, String email, int image) {
        this.nombre = nombre;
        this.email = email;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public String getEmail() {
        return email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
