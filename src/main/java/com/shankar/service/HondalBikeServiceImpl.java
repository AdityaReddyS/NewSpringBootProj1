package com.shankar.service;

import com.shankar.model.HondaBike;
import com.shankar.repo.HondaBikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HondalBikeServiceImpl implements HondaBikeService {
    @Autowired
private HondaBikeRepository Bikerepo;
    @Override
    public String savetheBike(HondaBike bike) {
        int IdVal=Bikerepo.save(bike).getBikeid();
        return "Bike Saved With the id Value:::"+IdVal;
    }

    @Override
    public List<HondaBike> getallBikes() {
        List<HondaBike> list=Bikerepo.findAll();
        return list;
    }

    @Override
    public String getById(int id) {
        Optional<HondaBike> opt=Bikerepo.findById(id);
        if(opt.isEmpty())
            return null;
        else
        return "Bike is  Found with value"+opt.get().toString();
    }


}
