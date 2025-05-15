package com.example.trust.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/services")
public class ServiceController {
  @Autowired
  private ServiceOfferingService service;

  //Lister tous les services
  @GetMapping
  public List<ServiceOffering> ListAll() {
    return service.listAll();
  }

  //Récupérer un service par son identifiant
  @GetMapping("/{id}")
  public ResponseEntity<ServiceOffering> getById(@PathVariable Long id) {
      return service.findById(id)
          .map(ResponseEntity::ok)
          .orElse(ResponseEntity.notFound().build());
  }

  //Ajouter un service
  @PostMapping
  public ServiceOffering create(@RequestBody ServiceOffering serviceOffering) {
      return service.save(serviceOffering);
  }


}
