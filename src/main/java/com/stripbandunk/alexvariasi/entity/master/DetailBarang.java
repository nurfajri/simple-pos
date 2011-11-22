/*
 *  Copyright (c) 2011, StripBandunk and/or its affiliates. All rights reserved.
 * 
 *       http://stripbandunk.com/
 * 
 *  STRIPBANDUNK PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.stripbandunk.alexvariasi.entity.master;

import com.stripbandunk.alexvariasi.entity.AbstractEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Eko Kurniawan Khannedy
 */
@Entity
@Table(name = "tabel_detail_barang")
public class DetailBarang extends AbstractEntity<String> {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "harga_beli", nullable = false)
    private Long hargaBeli;

    @Column(name = "harga_jual", nullable = false)
    private Long hargaJual;

    @Column(name = "stok", nullable = false)
    private Integer stok;

    @ManyToOne
    @JoinColumn(name = "id_barang", nullable = false)
    private Barang barang;

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Barang getBarang() {
        return barang;
    }

    public Long getHargaBeli() {
        return hargaBeli;
    }

    public void setHargaBeli(Long hargaBeli) {
        this.hargaBeli = hargaBeli;
    }

    public Long getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(Long hargaJual) {
        this.hargaJual = hargaJual;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
}