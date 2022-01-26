package com.example.studycatalogservice.service;

import com.example.studycatalogservice.jpa.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
