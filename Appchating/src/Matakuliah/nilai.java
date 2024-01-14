/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matakuliah;

/**
 *
 * @author Asus
 */
public class nilai {
 private int id;
    private int idMahasiswa;
    private int idMataKuliah;
    private double nilai;

    public nilai(int id, int idMahasiswa, int idMataKuliah, double nilai) {
        this.id = id;
        this.idMahasiswa = idMahasiswa;
        this.idMataKuliah = idMataKuliah;
        this.nilai = nilai;
    }

    public int getId() {
        return id;
    }

    public int getIdMahasiswa() {
        return idMahasiswa;
    }

    public int getIdMataKuliah() {
        return idMataKuliah;
    }

    public double getNilai() {
        return nilai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdMahasiswa(int idMahasiswa) {
        this.idMahasiswa = idMahasiswa;
    }

    public void setIdMataKuliah(int idMataKuliah) {
        this.idMataKuliah = idMataKuliah;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}   

