package com.shankar.service;

import com.shankar.model.HondaBike;

import java.util.List;

public interface HondaBikeService {

    public String savetheBike(HondaBike bike);
    public List<HondaBike> getallBikes();
    public String getById(int id);

   // public HondaBike updateBikeName(String bikename);
}
