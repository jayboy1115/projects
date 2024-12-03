package org.example.Data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.example.Data.models.Package;

public interface PackageRepository extends MongoRepository<Package, String> {

}
