package com.annapurna.inventory.services;

import com.annapurna.inventory.dao.HiDao;
import com.annapurna.inventory.entities.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HiService {
    @Autowired
    HiDao dao;

    public List<Provider> getProviderDetails(Long providerId) {
        return dao.getProvidersList(providerId);
    }

    @Async
    public void someAsyncMethod() {
        try {
            Thread.sleep(3000);	// Let me sleep for 3 sec
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("My Name " + Thread.currentThread().getName());
    }
}
