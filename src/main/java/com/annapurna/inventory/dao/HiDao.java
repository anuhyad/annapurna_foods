package com.annapurna.inventory.dao;

import com.annapurna.inventory.Constants.ProviderConstants;
import com.annapurna.inventory.entities.Provider;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class HiDao{
    @PersistenceContext
    EntityManager em;

    public List<Provider> getProvidersList(Long provider_id) {

        Query q= em.createNativeQuery(ProviderConstants.PROVIDER_LIST, Provider.class);
        ArrayList<Provider> provList = (ArrayList<Provider>) q.getResultList();

        return provList;
    }
}
