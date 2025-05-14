package com.example.trust.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceOfferingService {
  @Autowired
  private ServiceRepository repo;

  public List<ServiceOffering> listAll() {
    return repo.findAll();
  }
  public ServiceOffering save(ServiceOffering s) {
    return repo.save(s);
  }
  // autres méthodes business…
  public void delete(Long id) {
    // TODO Auto-generated method stub
    repo.deleteById(id);
  }

  public Optional<ServiceOffering> findById(Long id) {
    return repo.findById(id);
}
 
}
